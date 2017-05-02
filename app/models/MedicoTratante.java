package models;


/**
 * Created by af.moreno10 on 10/02/2017.
 */

public class MedicoTratante extends Medico
{

    /**
     * Constructor 1
     *
     * @param nombre       Nombre del medico
     * @param especialidad Especialidad que posee el medico
     * @param descripcion  Información adicional del medico
     */
    public MedicoTratante(String nombre, String especialidad, String descripcion) {
        super(nombre, especialidad, descripcion);
    }
}
