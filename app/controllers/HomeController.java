package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import play.mvc.*;

public class HomeController extends Controller {

    public Result index() {
        return ok("It works!");
    }

    @BodyParser.Of(BodyParser.Json.class)
    public Result sayHello() {
        JsonNode json = request().body().asJson();
        String name = json.findPath("name").textValue();
        if (name == null) {
            return badRequest("Missing parameter [name]");
        } else {
            return ok("Hello " + name);
        }
    }
    
}
