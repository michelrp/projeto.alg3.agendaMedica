/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.alg3.agendaMedica.medico;

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
public class MedicoGerenciaBD extends GerenciaBD {
    
    private Medico medico;
    private Connection conexao = Main.conexao;
    
    public MedicoGerenciaBD(){
        
    }
    
    private int temCrm (String crm){
        String sql = "select * from medico where crm=?;";
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, crm);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(MedicoGerenciaBD.class.getName()).log(Level.SEVERE, null, ex);
        }

        return -1;
    }

    @Override
    public void inserir() {
        if (temCrm(medico.getCrm()) != -1) {
            JOptionPane.showMessageDialog(null,"CRM já cadastrado!");
            return;
            
            
        }

        String sql = "insert into medico (crm,nome,endereco,especialidade,convenio) values (?,?,?,?,?);";
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, medico.getCrm());
            ps.setString(2, medico.getNome());
            ps.setString(3, medico.getEndereco());
            ps.setString(4, medico.getEspecialidade());
            ps.setString(5, medico.getConvenio());

            
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(MedicoGerenciaBD.class.getName()).log(Level.SEVERE, null, ex);
        }

        medico = null;
        JOptionPane.showMessageDialog(null,"Médico cadastrado com Sucesso!");
    }

    @Override
    public void editar() {
        int posicao = temCrm(medico.getCrm());
        if (posicao != -1) {
            String sql = "update medico set crm=?, nome=?, endereco=?,"
                    + "especialidade=?, convenio=?"
                    + "where codmedico =?;";
            try {
                PreparedStatement ps = conexao.prepareStatement(sql);
                ps.setString(1, medico.getCrm());
                ps.setString(2, medico.getNome());
                ps.setString(3, medico.getEndereco());
                ps.setString(4, medico.getEspecialidade());
                ps.setInt(6, medico.getCodmedico());
                ps.setString(5, medico.getConvenio());
                
                ps.executeUpdate();
                
            } catch (SQLException ex) {
                Logger.getLogger(MedicoGerenciaBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void excluir() {
        int posicao = temCrm(medico.getCrm());
        if (posicao != -1) {
            
            String sql = "delete from medico where codmedico=?;";
            try {
                PreparedStatement ps = conexao.prepareStatement(sql);
                ps.setInt(1, medico.getCodmedico());
                ps.executeUpdate();
                
            } catch (SQLException ex) {
                Logger.getLogger(MedicoGerenciaBD.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            JOptionPane.showMessageDialog(null,"Medico Excluido com sucesso!");
        }
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    @Override
    public ArrayList consultar() {
        dados = new ArrayList();
        
        String sql = "select * from medico;";
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            Medico aux;
            while(rs.next()){
                aux = new Medico();
                aux.setCodmedico(rs.getInt("codmedico"));
                aux.setCrm(rs.getString("crm"));
                aux.setNome(rs.getString("nome"));
                aux.setEndereco(rs.getString("endereco"));
                aux.setEspecialidade(rs.getString("especialidade"));
                aux.setConvenio(rs.getString("convenio"));
                
                dados.add(aux);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(MedicoGerenciaBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return dados;
    }
    
    
    
    

 
}
