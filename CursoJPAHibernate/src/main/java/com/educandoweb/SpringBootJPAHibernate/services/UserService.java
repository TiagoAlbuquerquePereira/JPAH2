package com.educandoweb.SpringBootJPAHibernate.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.SpringBootJPAHibernate.entities.User;
import com.educandoweb.SpringBootJPAHibernate.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository reporisty;

	public List<User> findall() {
		return reporisty.findAll();
	}

	
	
}
