package UD24.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="trabajador")//en caso que la tabla sea diferente

public class Trabajador {

	//Atributos de entidad cliente
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
		private Long id;
		@Column(name = "nombre")//no hace falta si se llama igual
		private String nombre;
		@Column(name = "apellido")//no hace falta si se llama igual
		private String apellido;
		@Column(name = "puesto")//no hace falta si se llama igual
		private String puesto;
		@Column(name = "salario")//no hace falta si se llama igual
		private int salario;
		
		private String trabajador;
		
		//Constructor por defecto
		
		public Trabajador() {
			
		}

		//Constructor con atributos
		
		
		
		//Getters & Setters

		public Long getId() {
			return id;
		}

		public Trabajador(Long id, String nombre, String apellido, UD24.controller.Trabajador trabajador) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.apellido = apellido;
			this.trabajador = UD24.controller.Trabajador.getTrabajo(trabajador);
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		

		public String getTrabajo() {
			return trabajador;
		}

		public void setTrabajo(String trabajo) {
			this.trabajador = trabajo;
		}

		public int getSalario() {
			return salario;
		}

		public void setSalario(int salario) {
			this.salario = salario;
		}

		@Override
		public String toString() {
			return "Trabajador [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", puesto=" + puesto
					+ ", salario=" + salario + ", trabajador=" + trabajador + "]";
		}

}
