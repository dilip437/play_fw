package data;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import models.*;

public class HealthService {
	
	public String process() {
		try {
    		ObjectMapper objectMapper = new ObjectMapper();
	        return objectMapper.writeValueAsString(new HealthDTO(true));
	    }catch(JsonProcessingException e) {
	        return "Parse Error";
	    }
	}
}
