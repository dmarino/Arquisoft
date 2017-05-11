package models;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.annotation.JsonBackReference;
import dtos.PacienteSimple;

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

    @ManyToMany
    private List<Medico> medicos;

    @OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL)
    private List<Consejo> consejos;

    private String email;
    private String contrasena;
    private String marcapasos;


    //-----------------------------------------------------------
    // Constructores
    //-----------------------------------------------------------

    public Paciente(){

    }
    public Paciente(long documento, String nombre, String tipoSangre, String pais, String ciudad, long telefono, long celular, String tratamientos, String examenes, String marcapasos) {
        this.documento = documento;
        this.nombre = nombre;
        this.tipoSangre = tipoSangre;
        this.pais = pais;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.celular = celular;
        this.marcapasos=marcapasos;
        medicionesHistoricas=new ArrayList<Medicion>();
        this.tratamientos=tratamientos;
        this.examenes=examenes;
        consejos = new ArrayList<Consejo>();
        medicos= new ArrayList<Medico>();
    }

    public Paciente(long documento, String nombre, String tipoSangre, String pais, String ciudad, long telefono, long celular, List<Medicion> medicionesHistoricas, String tratamientos, String examenes, List<Consejo> consejos, List<Medico> medicos, String marcapasos) {
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
        this.medicos=medicos;
        this.consejos=consejos;
        this.marcapasos=marcapasos;
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

    public List<Consejo> getConsejos() {
        return consejos;
    }

    public void setConsejos(List<Consejo> consejos) {
        this.consejos = consejos;
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

    public void setContrasena(String contrasena) {this.contrasena = contrasena;}

    public List<Medico> getMedicos() {return medicos;}

    public void setMedicos(List<Medico> medicos) {this.medicos = medicos;}

    public String getMarcapasos() {
        return marcapasos;
    }

    public void setMarcapasos(String marcapasos) {
        this.marcapasos = marcapasos;
    }

    public PacienteSimple darPacienteSimple(){
        PacienteSimple p = new PacienteSimple();
        p.setDocumento(documento);
        p.setNombre(nombre);
        p.setTipoSangre(tipoSangre);
        p.setPais(pais);
        p.setCiudad(ciudad);
        p.setTelefono(telefono);
        p.setCelular(celular);
        p.setEmail(email);
        p.setContrasena(contrasena);
        return p;
    }
}
