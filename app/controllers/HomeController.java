package controllers;

import aws.SQSConnection;
import com.typesafe.config.ConfigFactory;
import play.libs.Json;
import play.mvc.*;

import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    public static final String AWS_S3_BUCKET = "aws.s3.bucket";
    public static final String AWS_ACCESS_KEY = "aws.access.key";
    public static final String AWS_SECRET_KEY = "aws.secret.key";

    public Result loaderio() {
        return ok("loaderio-6d160b83d57d4302825f8e2854f38ddc");
    }



    public Result enviar(){
        SQSConnection sqs = new SQSConnection();
        sqs.sendMessage("Hola");
        return ok("Enviando");
    }

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(index.render("Hospital Cardiologico de Santa Fe"));
    }

    public Result login() {
        return ok(login.render());
    }

    public Result perfil() {
        return ok(login.render());
    }


}