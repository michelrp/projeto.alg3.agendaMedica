/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.alg3.agendaMedica.consulta;

import projeto.alg3.agendaMedica.medico.Medico;
import projeto.alg3.agendaMedica.paciente.Paciente;

/**
 *
 * @author Michel
 */
public class Consulta {
    private Medico codmedico;
    private Paciente codpaciente;
    private int codconsulta;
    private String laudo;
    private String dataconsulta;
    private String horaconsulta;

    public Consulta(){
        
    }

    public Medico getCodmedico() {
        return codmedico;
    }

    public void setCodmedico(Medico codmedico) {
        this.codmedico = codmedico;
    }

    public Paciente getCodpaciente() {
        return codpaciente;
    }

    public void setCodpaciente(Paciente codpaciente) {
        this.codpaciente = codpaciente;
    }
    
    public Consulta(int codconsulta){
        this.codconsulta = codconsulta;
    }

    public int getCodconsulta() {
        return codconsulta;
    }

    public void setCodconsulta(int codconsulta) {
        this.codconsulta = codconsulta;
    }

    public String getLaudo() {
        return laudo;
    }

    public void setLaudo(String laudo) {
        this.laudo = laudo;
    }

    public String getDataconsulta() {
        return dataconsulta;
    }

    public void setDataconsulta(String dataconsulta) {
        this.dataconsulta = dataconsulta;
    }

    public String getHoraconsulta() {
        return horaconsulta;
    }

    public void setHoraconsulta(String horaconsulta) {
        this.horaconsulta = horaconsulta;
    }
    
    
    
}
