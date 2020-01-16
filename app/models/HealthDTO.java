package models;

import java.io.Serializable;

public class HealthDTO implements Serializable {

	private static final long serialVersionUID = -4555699013688592378L;
	
	private Boolean health;
	
	public HealthDTO() {}
	
	public HealthDTO(Boolean health) {
		this.health = health;	
	}
	
	public Boolean getHealth() {
		return this.health;
	}
    
	public void setHealth(Boolean health) {
		this.health = health;	
	}
}
