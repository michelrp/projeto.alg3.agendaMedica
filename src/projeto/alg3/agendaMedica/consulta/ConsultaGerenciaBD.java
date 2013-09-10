/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.alg3.agendaMedica.consulta;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import projeto.alg3.agendaMedica.GerenciaBD;
import projeto.alg3.agendaMedica.Main;
import projeto.alg3.agendaMedica.medico.Medico;
import projeto.alg3.agendaMedica.medico.MedicoGerenciaBD;
import projeto.alg3.agendaMedica.paciente.Paciente;
import projeto.alg3.agendaMedica.paciente.PacienteGerenciaBD;

/**
 *
 * @author Michel
 */
public class ConsultaGerenciaBD extends GerenciaBD {
    
    private Consulta consulta;
    private Connection conexao = Main.conexao;
    

    @Override
    public void inserir() {
        String sql = "INSERT INTO consulta (codmedico, codpaciente, codconsulta, laudo, dataconsulta, horaconsulta) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement stm;
		try {
			stm = this.conexao.prepareStatement(sql);
			stm.setInt(1, this.consulta.getCodmedico().getCodmedico());
			stm.setInt(2, this.consulta.getCodpaciente().getCodpaciente());
			stm.setInt(3, this.consulta.getCodconsulta());
			stm.setString(4, this.consulta.getLaudo());
			stm.setString(5, this.consulta.getDataconsulta());
			stm.setString(6, this.consulta.getHoraconsulta());
			stm.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }

    @Override
    public void editar() {
        String sql = "UPDATE consulta set codmedico = ?, codpaciente = ?, laudo = ?, dataconsulta = ?, horaconsulta = ? WHERE codconsulta = ?";
        try {
			PreparedStatement stm = this.conexao.prepareStatement(sql);
			stm.setInt(1, this.consulta.getCodmedico().getCodmedico());
			stm.setInt(2, this.consulta.getCodpaciente().getCodpaciente());
			stm.setString(3, this.consulta.getLaudo());
			stm.setString(4, this.consulta.getDataconsulta());
			stm.setString(5, this.consulta.getHoraconsulta());
			stm.setInt(6, this.consulta.getCodconsulta());
			stm.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }

    @Override
    public void excluir() {
        String sql = "DELETE FROM consulta WHERE consuldacod = ?";
        try {
			PreparedStatement stm = this.conexao.prepareStatement(sql);
			stm.setInt(1, this.consulta.getCodconsulta());
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }

    @Override
    public ArrayList consultar() {
    	String sql = "SELECT * FROM consulta";
    	ArrayList listaConsulta = new ArrayList();
		Consulta consulta;
		MedicoGerenciaBD medGerencia = new MedicoGerenciaBD();
		PacienteGerenciaBD pacGerencia = new PacienteGerenciaBD();
    	try {
			PreparedStatement stm = this.conexao.prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
			
			while (rs.next()) {
				Medico medico = medGerencia.getMedicoPorCod(rs.getInt("codmedico"));
				Paciente paciente = pacGerencia.getPacientePorCod(rs.getInt("codpaciente"));
				consulta = new Consulta();
				consulta.setCodconsulta(rs.getInt("codconsulta"));
				consulta.setCodmedico(medico);
				consulta.setCodpaciente(paciente);
				consulta.setDataconsulta(rs.getString("dataconsulta"));
				consulta.setHoraconsulta(rs.getString("horaconsulta"));
				consulta.setLaudo(rs.getString("laudo"));
				listaConsulta.add(consulta);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	
    	return listaConsulta;
    }
    
    
    
}
