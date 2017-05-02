package models;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by af.moreno10 on 10/02/2017.
 */
@Entity
@Table(name = "paciente")
public class Paciente extends Model
{

    public static Finder<Long, Paciente> FINDER = new Finder<>(Paciente.class);
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PacienteEntity")
    private long documento;

    private String nombre;

    private String tipoSangre;

    private String pais;

    private String ciudad;

    private long telefono;

    private long celular;

    @OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL)
    private List<Medicion> medicionesHistoricas;

    private String tratamientos;

    private String examenes;

    @ManyToOne
    @JsonBackReference(value="medico")
    private Medico medico;

    @OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL)
    private List<Consejo> consejos;


    //-----------------------------------------------------------
    // Constructores
    //-----------------------------------------------------------

    public Paciente(long documento, String nombre, String tipoSangre, String pais, String ciudad, long telefono, long celular, String tratamientos, String examenes) {
        this.documento = documento;
        this.nombre = nombre;
        this.tipoSangre = tipoSangre;
        this.pais = pais;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.celular = celular;
        medicionesHistoricas=new ArrayList<Medicion>();
        this.tratamientos=tratamientos;
        this.examenes=examenes;
        consejos = new ArrayList<Consejo>();
    }

    public Paciente(long documento, String nombre, String tipoSangre, String pais, String ciudad, long telefono, long celular, List<Medicion> medicionesHistoricas, String tratamientos, String examenes, List<Consejo> consejos) {
        this.documento = documento;
        this.nombre = nombre;
        this.tipoSangre = tipoSangre;
        this.pais = pais;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.celular = celular;
        this.medicionesHistoricas=medicionesHistoricas;
        this.tratamientos=tratamientos;
        this.examenes=examenes;
        this.consejos=consejos;
    }


    //-----------------------------------------------------------
    // Getters y setters
    //-----------------------------------------------------------


    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public List<Medicion> getMedicionesHistoricas() {
        return medicionesHistoricas;
    }

    public void setMedicionesHistoricas(List<Medicion> medicionesHistoricas) {
        this.medicionesHistoricas = medicionesHistoricas;
    }

    public String getTratamientos() {
        return tratamientos;
    }

    public void setTratamientos(String tratamientos) {
        this.tratamientos = tratamientos;
    }

    public String getExamenes() {
        return examenes;
    }

    public void setExamenes(String examenes) {
        this.examenes = examenes;
    }

    public Medico getMedico() {
        return medico;

    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public List<Consejo> getConsejos() {
        return consejos;
    }

    public void setConsejos(List<Consejo> consejos) {
        this.consejos = consejos;
    }
}
