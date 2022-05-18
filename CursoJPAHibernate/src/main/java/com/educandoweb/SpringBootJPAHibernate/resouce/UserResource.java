package com.educandoweb.SpringBootJPAHibernate.resouce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.SpringBootJPAHibernate.entities.User;
import com.educandoweb.SpringBootJPAHibernate.services.UserService;

@RestController
@RequestMapping(value = "users")
public class UserResource {

	@Autowired
	private UserService service;

	@GetMapping
	public ResponseEntity<List<User>> findall() {

		List<User> list = service.findall();
		return ResponseEntity.ok().body(list);
	}

}
