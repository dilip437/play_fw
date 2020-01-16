package controllers;

import javax.inject.*;
import play.mvc.*;
import models.*;
import data.*;

public class HealthController extends Controller {

	@Inject
	private HealthService healthService;
	
	@Inject
	private SystemService systemService;
	
    public Result index() {
        return ok(healthService.process());
    }

    public Result getData() {        	   
    	return ok(systemService.process());
    }
        
}
