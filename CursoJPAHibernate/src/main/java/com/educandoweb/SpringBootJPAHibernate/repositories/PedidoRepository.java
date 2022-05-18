package com.educandoweb.SpringBootJPAHibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.SpringBootJPAHibernate.entities.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
 
}
