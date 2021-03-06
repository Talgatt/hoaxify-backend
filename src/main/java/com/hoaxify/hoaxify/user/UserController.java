package com.hoaxify.hoaxify.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;


import com.hoaxify.hoaxify.shared.GenericResponse;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/api/1.0/users")
	GenericResponse createUser(@Valid @RequestBody User user) {
//		if(user.getUsername() == null || user.getDisplayName() == null) {
//			throw new UserNotValidException();
//		}
		userService.save(user);
		
		return new GenericResponse("User saved");
		
	}

}
