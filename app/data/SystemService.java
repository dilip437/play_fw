package data;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import models.*;

import com.datastax.driver.core.*;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public class SystemService {
	
	public String process() {
		Config conf = ConfigFactory.load("additional.conf");
        Cluster cluster = null;
        String renderString = "Cannot connect to Cassandra";
        try {
            cluster = Cluster.builder()
                    .addContactPoint(conf.getString("cassandra.contact-point"))	.withCredentials("cassandra", "cassandra")
                    .build();
            Session session = cluster.connect();
            ResultSet rs = session.execute("select release_version from system.local");
            Row row = rs.one();
            String releaseVersion = row.getString("release_version");
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.writeValueAsString(new SystemDTO("system", "local", releaseVersion));
        } catch(JsonProcessingException e) {
        	return "Data Error";
        } finally {
        	if (cluster != null) cluster.close();
        }
	}
}
