package controllers;

import actions.UpdateContext;
import be.objectify.deadbolt.java.actions.*;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

/**
 * Created by Maria on 25/04/2017.
 */
@UpdateContext("Added before deferred Deadbolt actions")
@DeferredDeadbolt
public class DeferredController extends Controller
{
    @Restrict(value=@Group("medico"), deferred=true)
    public CompletionStage<Result> deferredRestrict()
    {
        return CompletableFuture.completedFuture(ok(views.html.accessOk.render()));
    }

    @Restrict(value=@Group({"medico", "paciente"}), deferred=true)
    public CompletionStage<Result> deferredRestrictions()
    {
        return CompletableFuture.completedFuture(ok(views.html.accessOk.render()));
    }

    @Pattern(value = "printers.detonate", deferred=true)
    public CompletionStage<Result> deferredPattern()
    {
        return CompletableFuture.completedFuture(ok(views.html.accessOk.render()));
    }

    @Dynamic(value="pureLuck", deferred=true)
    public CompletionStage<Result> deferredDynamic()
    {
        return CompletableFuture.completedFuture(ok(views.html.accessOk.render()));
    }

    @SubjectPresent(deferred=true)
    public CompletionStage<Result> deferredSubjectPresent()
    {
        return CompletableFuture.completedFuture(ok(views.html.accessOk.render()));
    }

    @SubjectNotPresent(deferred=true)
    public CompletionStage<Result> deferredSubjectNotPresent()
    {
        return CompletableFuture.completedFuture(ok(views.html.accessOk.render()));
    }
}
