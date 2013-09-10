/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.alg3.agendaMedica.convenio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import projeto.alg3.agendaMedica.GerenciaBD;
import projeto.alg3.agendaMedica.Main;

/**
 *
 * @author Michel
 */
public class ConvenioGerenciaBD extends GerenciaBD {
    
    private Convenio convenio;
    private Connection conexao = Main.conexao;
    
    @Override
    public ArrayList consultar() {
        dados = new ArrayList();
        
    String sql = "select * from convenio;";
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            Convenio aux;
            while(rs.next()){
                aux = new Convenio();
                aux.setCodconvenio(rs.getInt("codconvenio"));
                aux.setNome(rs.getString("nome"));
                //aux.setCodmedico(rs.getString("codmedico"));
                
                dados.add(aux);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ConvenioGerenciaBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return dados;
    }

    @Override
    public void inserir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
