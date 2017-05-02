package models;

/**
 * Created by af.moreno10 on 10/02/2017.
 */

public class MedicoEspecialista extends Medico
{

    private String informeMarcaPasos;

    /**
     * Constructor 1
     *
     * @param nombre       Nombre del medico
     * @param especialidad Especialidad que posee el medico
     * @param descripcion  Información adicional del medico
     */
    public MedicoEspecialista( String nombre, String especialidad, String descripcion, String informacionMarcaPasos) {
        super(nombre, especialidad, descripcion);
    }


    public String getInformeMarcaPasos() {
        return informeMarcaPasos;
    }

    public void setInformeMarcaPasos(String informeMarcaPasos) {
        this.informeMarcaPasos = informeMarcaPasos;
    }

}
