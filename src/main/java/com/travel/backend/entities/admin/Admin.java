package com.travel.backend.entities.admin;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.travel.backend.entities.user.User;

@Entity
@Table(name = "admin")
public class Admin extends User {
	public Admin() {
		super();
	}

	public Admin(User user) {
		super(user);
		// TODO Auto-generated constructor stub
	}
}
