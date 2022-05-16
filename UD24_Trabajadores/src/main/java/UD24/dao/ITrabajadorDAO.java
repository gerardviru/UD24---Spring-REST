package UD24.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import UD24.dto.Trabajador;

/**
 * 
 * @author Gerard
 *
 */

public interface ITrabajadorDAO extends JpaRepository<Trabajador, Long> {

	// Listar trabajadores por campo nombre
	
	public List<Trabajador> findByNombre(String nombre);
	
	
}