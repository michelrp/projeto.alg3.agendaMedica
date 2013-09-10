/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.alg3.agendaMedica.consulta;

import java.sql.Connection;
import java.util.ArrayList;
import projeto.alg3.agendaMedica.GerenciaBD;
import projeto.alg3.agendaMedica.Main;
import projeto.alg3.agendaMedica.medico.Medico;
import projeto.alg3.agendaMedica.paciente.Paciente;

/**
 *
 * @author Michel
 */
public class ConsultaGerenciaBD extends GerenciaBD {
    
    private Consulta codconsulta;
    private Medico codmedico;
    private Paciente codpaciente;
    private Connection conexao = Main.conexao;
    

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

    @Override
    public ArrayList consultar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
