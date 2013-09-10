/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.alg3.agendaMedica.medico;

import projeto.alg3.agendaMedica.Pessoa;

/**
 *
 * @author Michel
 */
public class Medico extends Pessoa{
    
private int codmedico;
private String crm;
private String especialidade;

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    
    public Medico(){
        
   }
    
   public Medico(String nome){
       super(nome);
   }
   
    public String getNomeCompleto(){
        return "";
    }
   
    @Override
    public String toString() {
        return getNome();
    }

    public int getCodmedico() {
        return codmedico;
    }

    public void setCodmedico(int codmedico) {
        this.codmedico = codmedico;
    }
   
}