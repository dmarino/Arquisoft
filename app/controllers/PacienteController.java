package controllers;

import akka.dispatch.MessageDispatcher;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import dispatchers.AkkaDispatcher;
import models.Consejo;
import models.Medicion;
import models.Medico;
import models.Paciente;
import play.libs.Json;
import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import static play.libs.Json.toJson;

/**
 * Created by d.marino10 on 15/02/2017.
 */
public class PacienteController extends Controller {

    @Inject
    HttpExecutionContext ec;

    //PacienteMock mock= new PacienteMock();

    public CompletionStage<Result> getPacientes(){

        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.
                supplyAsync(
                        () -> {
                            return Paciente.FINDER.all();
    }
                        ,jdbcDispatcher)
                .thenApply(
                        pacientes -> {
                            return ok(toJson(pacientes));
                        }
                );
    }

    public CompletionStage<Result> getPaciente(long id){
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.
                supplyAsync(
                        () -> {
                            return Paciente.FINDER.byId(id);
                        }
                        ,jdbcDispatcher)
                .thenApply(
                        pacientes -> {
                            return ok(toJson(pacientes));
                        }
                );
    }

    public CompletionStage<Result> getPacienteSimple(long id){
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.
                supplyAsync(
                        () -> {
                            return Paciente.FINDER.byId(id);
                        }
                        ,jdbcDispatcher)
                .thenApply(
                        pacientes -> {
                            return ok(toJson(pacientes.darPacienteSimple()));
                        }
                );
    }

    public CompletionStage<Result> getPacienteByName(String name){
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.
                supplyAsync(
                        () -> {
                            return Paciente.FINDER.where().eq("nombre",name).findList();
                        }
                        ,jdbcDispatcher)
                .thenApply(
                        pacientes -> {
                            return ok(toJson(pacientes));
                        }
                );
    }

    public CompletionStage<Result> createPaciente(){
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        JsonNode p = request().body().asJson();
        Paciente paciente = Json.fromJson(p, Paciente.class);

        return CompletableFuture.supplyAsync(
                () -> {
                    paciente.save();
                    return paciente;
                }
        ).thenApply(
                pacientes -> {
                    return ok(Json.toJson(pacientes));
                }
        );
    }

    public CompletionStage<Result> deletePaciente(long id)
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.supplyAsync(
                ()->{
                    Paciente.FINDER.deleteById(id);
                     return id;
                }
        ).thenApply(
                pacientes -> {
                    return ok(Json.toJson(pacientes));
                }
        );
    }

    public CompletionStage<Result> updatePaciente(long id){

        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.
                supplyAsync(
                        () -> {
                            JsonNode p = request().body().asJson();
                            Paciente paciente = Json.fromJson(p, Paciente.class);
                            Paciente pPorActualizar = Paciente.FINDER.byId(id);

                            pPorActualizar.setCelular(paciente.getCelular());
                            pPorActualizar.setCiudad(paciente.getCiudad());
                            pPorActualizar.setExamenes(paciente.getExamenes());
                            pPorActualizar.setMedicionesHistoricas(paciente.getMedicionesHistoricas());
                            pPorActualizar.setMedicos(paciente.getMedicos());
                            pPorActualizar.setNombre(paciente.getNombre());
                            pPorActualizar.setPais(paciente.getPais());
                            pPorActualizar.setTelefono(paciente.getTelefono());
                            pPorActualizar.setTratamientos(paciente.getTratamientos());
                            pPorActualizar.setEmail(paciente.getEmail());

                            
                            pPorActualizar.update();

                            return pPorActualizar;

                        }
                        ,ec.current())
                .thenApply(
                        paciente -> {
                            return ok(toJson(paciente));
                        }
                );
    }

    public CompletionStage<Result> agregarMedicion(long id){

        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        JsonNode p = request().body().asJson();
        Medicion m = Json.fromJson(p, Medicion.class);

        return CompletableFuture.
                supplyAsync(
                        () -> {

                            Paciente pPorActualizar = Paciente.FINDER.byId(id);

                            pPorActualizar.getMedicionesHistoricas().add(0,m);

                            pPorActualizar.update();

                            m.save();
                            return m;

                        }
                        ,ec.current())
                .thenApply(
                        medicion -> {
                            return ok(toJson(m));
                        }
                );
    }

    public CompletionStage<Result> agregarConsejo(long id){

        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        JsonNode p = request().body().asJson();
        Consejo m = Json.fromJson(p, Consejo.class);

        return CompletableFuture.
                supplyAsync(
                        () -> {

                            Paciente pPorActualizar = Paciente.FINDER.byId(id);
                            pPorActualizar.getConsejos().add(0,m);
                            pPorActualizar.update();

                            m.save();
                            return m;

                        }
                        ,ec.current())
                .thenApply(
                        consejo -> {
                            return ok(toJson(m));
                        }
                );
    }

    public CompletionStage<Result> asignarMedico(long id){

        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        JsonNode p = request().body().asJson();
        Medico m = Json.fromJson(p, Medico.class);

        return CompletableFuture.
                supplyAsync(
                        () -> {

                            Medico mPorActualizar = Medico.FINDER.byId(m.getIdMedico());

                            Paciente pPorActualizar = Paciente.FINDER.byId(id);
                            pPorActualizar.getMedicos().add(mPorActualizar);
                            pPorActualizar.update();

                            mPorActualizar.getPacientesDelMedico().add(pPorActualizar);
                            mPorActualizar.update();
                            return pPorActualizar;

                        }
                        ,ec.current())
                .thenApply(
                        paciente -> {
                            return ok(toJson(paciente));
                        }
                );
    }

    public Result lista() {

        List<Paciente> p= Paciente.FINDER.all();
        return ok(views.html.pacientes.render(p));
    }

    public Result detalle(Long id) {
        Paciente p = Paciente.FINDER.byId(id);
        return ok(views.html.paciente.render(p));
    }

}

