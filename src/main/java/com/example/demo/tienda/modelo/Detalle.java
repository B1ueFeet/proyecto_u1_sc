package com.example.demo.tienda.modelo;

import java.math.BigDecimal;

public class Detalle {
	
	private Producto producto;
	private String numero;
	private Integer cantidad;
	private BigDecimal subTotal;
	
	//to string
	@Override
	public String toString() {
		return "Detalle [producto=" + producto + ", numero=" + numero + ", cantidad=" + cantidad + ", subTotal="
				+ subTotal + "]";
	}
	
	
	

}
