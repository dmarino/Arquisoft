package models;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

/**
 * Created by Daniela on 30/04/2017.
 */
@Entity
@Table(name = "consejos")
public class Consejo extends Model {

    public static Finder<Long, Consejo> FINDER = new Finder<>(Consejo.class);

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ConsejoEntity")
    private Long id;

    private String tema;

    private String consejo;

    @ManyToOne
    @JsonBackReference
    private Paciente paciente;

    public Consejo(){

    }

    public Consejo(String tema, String consejo, Paciente paciente) {
        this.tema=tema;
        this.consejo = consejo;
        this.paciente = paciente;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getConsejo() {
        return consejo;
    }

    public void setConsejo(String consejo) {
        this.consejo = consejo;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
