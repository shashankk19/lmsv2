package com.ccproject.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name="users")
public class User {
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long userId;
	
	@Column(name="username")
	private String userName;
	private String password;
	private boolean enabled = true;
	private String role = "ROLE_USER";
	
	private String email;
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String phoneNumber;
	
	@OneToMany(mappedBy="reservedByUser")
	private List<Book> reservedBooks;
	
	@OneToMany(mappedBy="theUser")
	private List<Book> books;
	
	@OneToMany(mappedBy="notificationReceiver")
	private List<Notification> notifications;
	
	public User(String userName, String password, String email, String firstName,
			String lastName, String address, String phoneNumber, String city) {
		super();
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.city= city;
	}


}
