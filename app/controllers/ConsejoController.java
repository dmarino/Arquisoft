package controllers;

import akka.dispatch.MessageDispatcher;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import dispatchers.AkkaDispatcher;
import models.Consejo;
import models.Medico;
import play.libs.Json;
import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import static play.libs.Json.toJson;

/**
 * Created by Daniela on 30/04/2017.
 */
public class ConsejoController extends Controller {

    @Inject
    HttpExecutionContext ec;

    public CompletionStage<Result> getConsejos(){

        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.
                supplyAsync(
                        () -> {
                            return Consejo.FINDER.all();
                        }
                        ,jdbcDispatcher)
                .thenApply(
                        consejos -> {
                            return ok(toJson(consejos));
                        }
                );
    }

    public CompletionStage<Result> getConsejo(long id){
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.
                supplyAsync(
                        () -> {
                            return Consejo.FINDER.byId(id);
                        }
                        ,jdbcDispatcher)
                .thenApply(
                        consejos -> {
                            return ok(toJson(consejos));
                        }
                );
    }

    public CompletionStage<Result> createConsejo(){
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        JsonNode m = request().body().asJson();
        Consejo consejo = Json.fromJson(m, Consejo.class);
        return CompletableFuture.supplyAsync(
                () -> {
                    consejo.save();
                    return consejo;
                }
        ).thenApply(
                Consejo -> {
                    return ok(Json.toJson(Consejo));
                }
        );
    }

    public CompletionStage<Result> deleteConsejo(long id)
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.supplyAsync(
                () -> {
                    Consejo.FINDER.deleteById(id);
                    return id;
                }
        ).thenApply(
                Consejo -> {
                    return ok(Json.toJson(Consejo));
                }
        );
    }

    public CompletionStage<Result> updateConsejo(long id){

        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.
                supplyAsync(
                        () -> {
                            JsonNode m = request().body().asJson();
                            Consejo c = Json.fromJson(m, Consejo.class);
                            Consejo pPorActualizar =  Consejo.FINDER.byId(id);

                            pPorActualizar.setConsejo(c.getConsejo());
                            pPorActualizar.setPaciente(c.getPaciente());

                            pPorActualizar.update();

                            return pPorActualizar;
                        }
                        ,ec.current())
                .thenApply(
                        Consejo -> {
                            return ok(toJson(Consejo));
                        }
                );
    }

    public Result lista() {
        List<Consejo> m= Consejo.FINDER.all();
        return ok(views.html.consejos.render(m));
    }

    public Result detalle(Long id) {
        return ok(views.html.login.render());
    }
}
