package controllers;

import models.Medico;
import play.mvc.*;

import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    private Medico medico;
    public Result loaderio() {
        return ok("loaderio-6d160b83d57d4302825f8e2854f38ddc");
    }

    public Result enviar(){
        return ok("Enviando");
    }

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {

        medico = Medico.FINDER.byId(1L);
        return ok(index.render(medico.getNombreMedico()));
    }

    public Result login() {
        return ok(login.render());
    }

    public Result perfil() {
        return ok(login.render());
    }


}