/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.alg3.agendaMedica.paciente;

import projeto.alg3.agendaMedica.Pessoa;

/**
 *
 * @author Michel
 */
public class Paciente extends Pessoa {
    
    private int codpaciente;
    private String sexo;
    private String cpf;
    
    public Paciente(){
        
   }
    
   public Paciente(String nome){
       super(nome);
   }
   
    public String getNomeCompleto(){
        return "";
    }
   
    @Override
    public String toString() {
        return getNome();
    }

    public int getCodpaciente() {
        return codpaciente;
    }

    public void setCodpaciente(int codpaciente) {
        this.codpaciente = codpaciente;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }   

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
