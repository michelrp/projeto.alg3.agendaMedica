/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.alg3.agendaMedica.convenio;

import projeto.alg3.agendaMedica.medico.Medico;

/**
 *
 * @author Michel
 */
public class Convenio {
    private String nome;
    private int codconvenio;
    private Medico codmedico;
    
    public Convenio(){
        
    }
    public Convenio(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodconvenio() {
        return codconvenio;
    }

    public void setCodconvenio(int codconvenio) {
        this.codconvenio = codconvenio;
    }

    public Medico getCodmedico() {
        return codmedico;
    }

    public void setCodmedico(Medico codmedico) {
        this.codmedico = codmedico;
    }

    
}
