package com.ecommerce.common.entity;
import jakarta.persistence.*;
//import javax.persistence.*;
//import javax.persistence.Entity;
//import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length=40,nullable=false,unique=true)
	private String name;
	
	@Column(length=150,nullable=false)
	private String description;

	// Constructor for create instance of the entity
	public Role() {
		
	}
	public Role(String name, String description) {
		this.name = name;
		this.description = description;
		
	}
	public Role(String name) {
			this.name = name;
		}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
}
