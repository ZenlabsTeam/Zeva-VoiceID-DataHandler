package com.zensar.zenlabs.zeva.voiceid.data;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Enrollment")
public class Enrollment {
	@Id 
	@Column(name = "id")
	private UUID id;
	@Column(name = "name")
	private String name;
	@Column(name = "status")
	private String status;
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
