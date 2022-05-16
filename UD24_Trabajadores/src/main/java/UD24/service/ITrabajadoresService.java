package UD24.service;

import java.util.List;

import UD24.dto.Trabajador;

public interface ITrabajadoresService {
	
	
	//Métodos del CRUD
	
	
	//Lista de Trabajadores
	public List <Trabajador> listarTrabajadores();
	
	
	//Guardar
	public Trabajador guardarTrabajador(Trabajador trabajador);
	
	
	//Leer
	public Trabajador trabajadorID(Long id);
	
	
	//Lista trabajador campo nombre
	public List <Trabajador> listarTrabajadoresNombre (String Nombre);
	
	
	//Elimina el trabajador DELETE
	public void eliminarTrabajadores(Long ID);
	
	
	
	

}