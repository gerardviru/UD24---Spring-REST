package UD24.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import UD24.dto.Trabajador;
import UD24.dao.ITrabajadorDAO;

@Service
public class TrabServiceImp implements ITrabajadoresService {

	@Autowired
	ITrabajadorDAO iTrabajadorDAO;
	
	@Override
	public List<Trabajador> listarTrabajadores() {
		
		return iTrabajadorDAO.findAll();
	}

	@Override
	public Trabajador guardarTrabajador(Trabajador trabajador) {
		
		return iTrabajadorDAO.save(trabajador);
	}

	@Override
	public Trabajador trabajadorID(Long id) {
		
		return iTrabajadorDAO.findById(id).get();
	}

	@Override
	public List<Trabajador> listarTrabajadoresNombre(String Nombre) {
		
		return iTrabajadorDAO.findByNombre(Nombre);
	}

	 
	public Trabajador actualizarTrabajador(Trabajador trabajador) {
		
		return iTrabajadorDAO.save(trabajador);
	}
	
	
	@Override
	public void eliminarTrabajadores(Long ID) {
		
		iTrabajadorDAO.deleteById(ID);
		
	}
	
}
