package UD24.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import UD24.dto.Trabajador;
import UD24.service.TrabServiceImp;

@RestController
@RequestMapping("/api")
public class TrabajadorController {

	@Autowired
	TrabServiceImp TrabServiceImp;
	
	@GetMapping("/trabajadores")
	public List<Trabajador> listarTrebajador() {
		return TrabServiceImp.listarTrabajadores();
	}
	
	
	@GetMapping("/trabajador/nombre/{nombre}")
	public List<Trabajador> listarTrabajadoresNombre(@PathVariable(name= "nombre") String nombre) {
		
		return TrabServiceImp.listarTrabajadoresNombre(nombre);
	}
	
	
	@GetMapping("/trabajador/{id}")
	public Trabajador trabajadorID (@PathVariable(name="id")Long id) {
		
		Trabajador trabajador = new Trabajador();
		trabajador = TrabServiceImp.trabajadorID(id); 
		
		System.out.println("Trabajador ID: "+ trabajador);
		
		return trabajador;
	}
	
	@PutMapping("/trabajador/{id}")
	public Trabajador actualizarCliente(@PathVariable(name="id")Long id,@RequestBody Trabajador trabajador) {
		
		Trabajador trab_seleccionado= new Trabajador();
		Trabajador trab_actualizado= new Trabajador();
		
		trab_seleccionado= TrabServiceImp.trabajadorID(id);
		
		trab_seleccionado.setNombre(trabajador.getNombre());
		trab_seleccionado.setApellido(trabajador.getApellido());
		trab_seleccionado.setPuesto(trabajador.getPuesto());
		trab_seleccionado.setSalario(trabajador.getSalario());
		
		
		trab_actualizado = TrabServiceImp.actualizarTrabajador(trab_seleccionado);
		
		System.out.println("El cliente actualizado es: "+ trab_actualizado);
		
		return trab_actualizado;
	}
	
	@PutMapping("/trabajadores/{id}")
	public void eliminarTreballador(@PathVariable(name="id")Long id) {
		TrabServiceImp.eliminarTrabajadores(id);
	}
	
}