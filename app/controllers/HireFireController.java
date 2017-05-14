package controllers;

import play.mvc.*;

/**
 * Created by John on 06/10/2016.
 */
public class HireFireController extends Controller {


    public Result recibir(String hirefire) {

        return ok("ok");

    }

    public class RespuestaJSON{
        public String name;
        public int quantity;

        public RespuestaJSON(String pName, int pQuantity){
            name = pName;
            quantity = pQuantity;
        }
    }
}
