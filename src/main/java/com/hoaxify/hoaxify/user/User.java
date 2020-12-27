package com.hoaxify.hoaxify.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;



import lombok.Data;

@Data
@Entity
public class User {
	
	@Id
	@GeneratedValue
	private long id;
	
	@NotNull
	private String username;
	
	@NotNull
	private String displayName;
	
	@NotNull
	private String password;

	
	

}
