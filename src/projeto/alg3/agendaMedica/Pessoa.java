/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.alg3.agendaMedica;

/**
 *
 * @author Michel
 */
public abstract class Pessoa {
    
    private String nome;
    private String endereco;
    private String convenio;

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }
    
    public Pessoa(){
        
    }
    
    public Pessoa (String nome){
        this.nome = nome;
        
    }
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
}
