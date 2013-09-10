/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.alg3.agendaMedica.paciente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import projeto.alg3.agendaMedica.GerenciaBD;
import projeto.alg3.agendaMedica.Main;

/**
 *
 * @author Michel
 */
public class PacienteGerenciaBD extends GerenciaBD {
    
    private Paciente paciente;
    private Connection conexao = Main.conexao;
    
    public PacienteGerenciaBD(){
        
    }
    
    private int temCpf (String cpf){
        String sql = "select * from paciente where cpf=?;";
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, cpf);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(PacienteGerenciaBD.class.getName()).log(Level.SEVERE, null, ex);
        }

        return -1;
    }
    

    @Override
    public void inserir() {
        if (temCpf(paciente.getCpf()) != -1) {
            JOptionPane.showMessageDialog(null,"CPF já cadastrado!");
            return;
        }

        String sql = "insert into paciente (nome,cpf,endereco,sexo,convenio) values (?,?,?,?,?);";
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, paciente.getNome());
            ps.setString(2, paciente.getCpf());
            ps.setString(3, paciente.getEndereco());
            ps.setString(4, paciente.getSexo());
            ps.setString(5, paciente.getConvenio());

            
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(PacienteGerenciaBD.class.getName()).log(Level.SEVERE, null, ex);
        }

        paciente = null;
        JOptionPane.showMessageDialog(null,"Paciente cadastrado com Sucesso!");
    }

    @Override
    public void editar() {
        int posicao = temCpf(paciente.getCpf());
        if (posicao != -1) {
            String sql = "update paciente set nome=?, cpf=?, endereco=?,"
                    + "sexo=? , convenio=?"
                    + "where codpaciente =?;";
            try {
                PreparedStatement ps = conexao.prepareStatement(sql);
                ps.setString(1, paciente.getNome());
                ps.setString(2, paciente.getCpf());
                ps.setString(3, paciente.getEndereco());
                ps.setString(4, paciente.getSexo());
                ps.setInt(6, paciente.getCodpaciente());
                ps.setString(5, paciente.getConvenio());
                
                ps.executeUpdate();
                
            } catch (SQLException ex) {
                Logger.getLogger(PacienteGerenciaBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void excluir() {
        int posicao = temCpf(paciente.getCpf());
        if (posicao != -1) {
            
            String sql = "delete from paciente where codpaciente=?;";
            try {
                PreparedStatement ps = conexao.prepareStatement(sql);
                ps.setInt(1, paciente.getCodpaciente());
                ps.executeUpdate();
                
            } catch (SQLException ex) {
                Logger.getLogger(PacienteGerenciaBD.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            JOptionPane.showMessageDialog(null,"Paciente excluido com Sucesso!");
        }
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    @Override
    public ArrayList consultar() {
        dados = new ArrayList();
        
        String sql = "select * from paciente;";
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            Paciente aux;
            while(rs.next()){
                aux = new Paciente();
                aux.setCodpaciente(rs.getInt("codpaciente"));
                aux.setNome(rs.getString("nome"));
                aux.setCpf(rs.getString("cpf"));
                aux.setEndereco(rs.getString("endereco"));
                aux.setSexo(rs.getString("sexo"));
                aux.setConvenio(rs.getString("convenio"));
                
                dados.add(aux);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(PacienteGerenciaBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return dados;
    }
    
    public Paciente getPacientePorCod(int cod) {
    	try {
    		String sql = "SELECT * FROM paciente WHERE codpaciente = ?";
        	PreparedStatement stm = this.conexao.prepareStatement(sql);
			stm.setInt(1, cod);
			
			ResultSet rs = stm.executeQuery();
			
			Paciente paciente = new Paciente();
			paciente.setCodpaciente(rs.getInt("codpaciente"));
			paciente.setConvenio(rs.getString("convenio"));
			paciente.setCpf(rs.getString("cpf"));
			paciente.setEndereco(rs.getString("endereco"));
			paciente.setNome(rs.getString("nome"));
			paciente.setSexo(rs.getString("sexo"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	
    	return paciente;
    }
}
