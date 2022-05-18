package com.educandoweb.SpringBootJPAHibernate.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.SpringBootJPAHibernate.entities.Pedido;
import com.educandoweb.SpringBootJPAHibernate.repositories.PedidoRepository;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository reporisty;

	public List<Pedido> findall() {
		return reporisty.findAll();
	}

	
	
}
