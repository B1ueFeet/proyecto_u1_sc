package com.example.demo.Spring.boot;

public class PacienteSB {
	
	private String nombre, cedula, tipo;
	
	public Integer calcularDescuento() {
		System.out.println("Sin descuento");
		return 0;
	}
	
	@Override
	public String toString() {
		return "Paciente [nombre=" + nombre + ", cedula=" + cedula + ", tipo= "+ tipo + "]";
	}
	
	//GETTER & SETTER

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	

}