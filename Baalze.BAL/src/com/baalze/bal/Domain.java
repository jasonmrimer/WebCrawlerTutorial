package com.baalze.bal;

import java.sql.Timestamp;

public class Domain {
	private String domainHash;
	private String domainURL;
	private boolean activated;
	private Timestamp modified;
	private Timestamp created;
	
	public Domain(String domainHash, String domainURL) {
		super();
		this.domainHash = domainHash;
		this.domainURL = domainURL;
	}
	/*
	 * This will set all of the private variables and will mostly
	 * be used from the database
	 */
	public Domain(String domainHash, String domainURL, boolean activated, Timestamp modified, Timestamp created) {
		super();
		this.domainHash = domainHash;
		this.domainURL = domainURL;
		this.activated = activated;
		this.modified = modified;
		this.created = created;
	}


	// Getters
	public String getDomainHash() {
		return domainHash;
	}
	public String getDomainURL() {
		return domainURL;
	}
	public boolean isActivated() {
		return activated;
	}
	public Timestamp getModified() {
		return modified;
	}
	public Timestamp getCreated() {
		return created;
	}
	
	
}
