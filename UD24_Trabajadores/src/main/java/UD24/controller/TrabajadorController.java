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
	TrabServiceImp trabServideImp;
	
	@GetMapping("/trabajadores")
	public List<Trabajador> listarTrabajadores(){
				return trabServideImp.listarTrabajadores();
	}
	
	@GetMapping("trabajador/nombre/{nombre}")
	public List<Trabajador> listarTrabajadoresNombre(@PathVariable(name = "nombre") String nombre) {
		return trabServideImp.listarTrabajadoresNombre(nombre);
	}
	
	@PostMapping("/trabajador")
	public Trabajador salvarCliente(@RequestBody Trabajador trabajador) {
		
		return trabServideImp.guardarTrabajador(trabajador);
	}
	
	@GetMapping("/trabajador/{id}")
	public Trabajador trabajadorID(@PathVariable(name="id") Long id) {
		
		Trabajador trabajador= new Trabajador();
		
		trabajador=trabServideImp.trabajadorID(id);
		
		System.out.println("Trabajador XID: "+trabajador);
		
		return trabajador;
	}
	
	@PutMapping("/trabajador/{id}")
	public Trabajador actualizarTrabajador(@PathVariable(name="id")Long id,@RequestBody Trabajador trabajador) {
		
		Trabajador trabajador_seleccionado= new Trabajador();
		Trabajador trabajador_actualizado= new Trabajador();
		
		trabajador_seleccionado= trabServideImp.trabajadorID(id);
		
		trabajador.setNombre(trabajador.getNombre());
		trabajador.setApellido(trabajador.getApellido());
		trabajador.setPuesto(trabajador.getPuesto());
		trabajador.setSalario(trabajador.getSalario());
		
		System.out.println("El cliente actualizado es: "+ trabajador_actualizado);
		
		return trabajador_actualizado;
	}
	
	@DeleteMapping("/trabajador/{id}")
	public void eleiminarCliente(@PathVariable(name="id")Long id) {
		trabServideImp.eliminarTrabajadores(id);
	}
	
}