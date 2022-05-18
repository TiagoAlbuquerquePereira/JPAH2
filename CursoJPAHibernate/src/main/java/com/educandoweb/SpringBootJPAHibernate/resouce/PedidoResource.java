package com.educandoweb.SpringBootJPAHibernate.resouce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.SpringBootJPAHibernate.entities.Pedido;
import com.educandoweb.SpringBootJPAHibernate.services.PedidoService;

@RestController
@RequestMapping(value = "pedidos")
public class PedidoResource {

	@Autowired
	private PedidoService service;

	@GetMapping
	public ResponseEntity<List<Pedido>> findall() {

		List<Pedido> list = service.findall();
		return ResponseEntity.ok().body(list);
	}

}
