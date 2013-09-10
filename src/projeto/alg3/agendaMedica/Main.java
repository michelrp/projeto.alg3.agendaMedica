package projeto.alg3.agendaMedica;

import java.sql.Connection;
import projeto.alg3.agendaMedica.medico.ListaMedicosJFrame;
import projeto.alg3.agendaMedica.medico.MedicoJFrame;
import projeto.alg3.agendaMedica.paciente.ListaPacientesJFrame;
import projeto.alg3.agendaMedica.paciente.PacienteJFrame;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michel
 */
public class Main {
    
    public static Banco banco;
    public static Connection conexao;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here7
        
        banco = new Banco();
        conexao = banco.abrirConexao();
        
        PrincipalJFrame tela = new PrincipalJFrame();
        tela.setVisible(true);
    }
}
