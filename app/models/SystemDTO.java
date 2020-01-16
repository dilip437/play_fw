package models;

import java.io.Serializable;

public class SystemDTO implements Serializable {

	private static final long serialVersionUID = -4555899013688592378L;
	
	private String keyspace;
	private String table;
	private String releaseVersion;
	
	public SystemDTO() {}
	
	public SystemDTO(String keyspace, String table, String releaseVersion) {
		this.keyspace = keyspace;
		this.table = table;
		this.releaseVersion = releaseVersion;
	}
	
	public String getKeyspace() {
		return this.keyspace;
	}
    
	public void setKeyspace(String keyspace) {
		this.keyspace = keyspace;	
	}
	
	public String getTable() {
		return this.table;
	}
    
	public void setTable(String table) {
		this.table = table;	
	}
	
	public String getReleaseVersion() {
		return this.releaseVersion;
	}
    
	public void setReleaseVersion(String releaseVersion) {
		this.releaseVersion = releaseVersion;	
	}
}
