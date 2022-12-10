package com.example.demo.tienda.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Producto {
	private String codigoBarras, nombre, tipo;
	private BigDecimal precio;
	private Integer Stock;
	private LocalDateTime fechaCaducidad;
	
	//TOSTRING
	@Override
	public String toString() {
		return "Producto [codigoBarras=" + codigoBarras + ", nombre=" + nombre + ", tipo=" + tipo + ", precio=" + precio
				+ ", Stock=" + Stock + ", fechaCaducidad=" + fechaCaducidad + "]";
	}
	
	//GETTER & SETTER
	public String getCodigoBarras() {
		return codigoBarras;
	}
	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	public Integer getStock() {
		return Stock;
	}
	public void setStock(Integer stock) {
		Stock = stock;
	}
	public LocalDateTime getFechaCaducidad() {
		return fechaCaducidad;
	}
	public void setFechaCaducidad(LocalDateTime fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	
	


}
