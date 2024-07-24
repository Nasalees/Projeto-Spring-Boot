package com.projetoSpring.userdept.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;
	@ManyToOne
	@JoinColumn(name = "department_id")
	private Department department;

	// Fazendo a associação entre classes(entendidades)
	// Ou seja, cada class instanciada na minha class User,
	// também terá um atribudo do tipo Department, e com isso estou
	// criando uma associação entre as entidades(class).

	public User() {

	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setID(long id) {
		this.id = id;
	}

	public long getId() {
		return this.id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return this.email;
	}

}
