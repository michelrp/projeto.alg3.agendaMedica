/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.alg3.agendaMedica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Michel
 */
public class Banco {
    private Connection conexao;
    
    public Connection abrirConexao(){
        try {
            Class.forName("org.postgresql.Driver");
            try {
                conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/agenda","postgres","mrp123");
            } catch (SQLException ex) {
                Logger.getLogger(Banco.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Não abriu conexão!");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Banco.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexao;
        
    }
    
    public void fechaConexao(){
        try {
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(Banco.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Não fechou conexão!");
        }
    }
}