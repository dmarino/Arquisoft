package models;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


/**
 * Clase que representa la información de un medico
 * Created by af.moreno10 on 10/02/2017.
 */

@Entity
@Table(name="medico")
public class Medico extends Model {
    //-----------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------

    public static Finder<Long, Medico> FINDER = new Finder<>(Medico.class);
    /**
     * Referencia que identifica al medico en el sistema.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MedicoEntity")

    /**
     * Identificación dentro del sistema del medico.
     */
    private Long idMedico;

    /**
     * Nombre del medico.
     */
    private String nombreMedico;

    /**
     * Especialidad medico.
     */
    private String especialidadMedico;

    /**
     * Descripción general del medico.
     */
    private String descripcionMedico;

    private String email;
    private String contrasena;
    private String tipo;

    @ManyToMany
    @JsonBackReference
    private List<Paciente> pacientesDelMedico;

    //-------------------------------------------------------------
    //Constructores
    //-------------------------------------------------------------

    /**
     * Constructor 1
     *
     * @param nombre       Nombre del medico
     * @param especialidad Especialidad que posee el medico
     * @param descripcion  Información adicional del medico
     */
    public Medico( String nombre, String especialidad, String descripcion,String email, String contrasena, String tipo) {
        this.nombreMedico = nombre;
        this.especialidadMedico = especialidad;
        this.descripcionMedico = descripcion;
        this.email=email;
        this.contrasena=contrasena;
        this.tipo=tipo;
        pacientesDelMedico = new ArrayList<Paciente>();
    }

    public Medico(long id, String nombre, String especialidad, String descripcion, String email, String contrasena, List<Paciente> pacientesDoctor, String tipo) {
        this.idMedico = id;
        this.nombreMedico = nombre;
        this.especialidadMedico = especialidad;
        this.descripcionMedico = descripcion;
        this.email=email;
        this.contrasena=contrasena;
        this.pacientesDelMedico = pacientesDoctor;
        this.tipo=tipo;
    }

    /**
     * Constructor 2
     * @param idMedico Identificación del medico
     */

    // public Medico(Long idMedico)
    //{
    //  this.idMedico = idMedico;
    // }

    /**
     * Constructor pruebas SIN parametros
     */
    //public Medico()
    //{
    //this.idMedico=0L;
    //this.nombreMedico = "Medico no real";
    //this.especialidadMedico = "No se ha graduado";
    //  this.descripcionMedico = "Grupo sanguíneo: o+. No enfermedades hereditarias";
    //}

    //-------------------------------------------------------------
    //Metódos
    //-------------------------------------------------------------
    public Long getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Long idMedico) {
        this.idMedico=idMedico;
    }

    public String getNombreMedico() {
        return nombreMedico;
    }

    public void setNombreMedico(String nombreMedico) {
        this.nombreMedico = nombreMedico;
    }

    public String getEspecialidadMedico() {
        return especialidadMedico;
    }

    public void setEspecialidadMedico(String especialidadMedico) {
        this.especialidadMedico = especialidadMedico;
    }

    public String getDescripcionMedico() {
        return descripcionMedico;
    }

    public void setDescripcionMedico(String descripcionMedico) {
        this.descripcionMedico = descripcionMedico;
    }


    public List<Paciente> getPacientesDelMedico() {
        return pacientesDelMedico;
    }

    public void setPacientesDelMedico(List<Paciente> pacientesDelMedico) {
        this.pacientesDelMedico = pacientesDelMedico;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

    //public String toString()
   // {
      //  return "Medico{" +
              //  "id Medico:" + idMedico +
            //    ", Nombre Medico:" + nombreMedico +
          //      ", Especialidad Medico:" + especialidadMedico +
        //        ", Descripción Médico:" + descripcionMedico +
      //          '}';

    //}

    /**
     * Crear un objeto Medico apartir de un nodo Json
     */

   // public static Medico bind(JsonNode j)
    // {
       // int idMedico = j.findPath("idMedico").asInt();
        //String nombreMedico = j.findPath("Nombre Medico").asText();
       // String especialidadMedico = j.findPath("Especialidad medico").asText();
       // String descripcionMedico = j.findPath("Descripcion medico").asText();
       // Medico medico = new Medico(idMedico, nombreMedico, especialidadMedico, descripcionMedico);

        //return medico;
    //}

