/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.alg3.agendaMedica;

import java.util.ArrayList;

/**
 *
 * @author Michel
 */
public abstract class GerenciaBD {
    
    public abstract void inserir();
    
    public abstract void editar();
    
    public abstract void excluir();
    
    protected ArrayList dados;
    
    public abstract ArrayList consultar();
    
    public ArrayList getDados() {
        return dados;
    }

    public void setDados(ArrayList dados) {
        this.dados = dados;
    }
    
}
