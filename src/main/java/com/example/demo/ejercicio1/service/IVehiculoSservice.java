package com.example.demo.ejercicio1.service;

import java.math.BigDecimal;

import com.example.demo.ejercicio1.modelo.Vehiculo;

public interface IVehiculoSservice {

	public Vehiculo buscar(String placa);

	public void crear(Vehiculo vehiculo);

	public void modificar(Vehiculo vehiculo);

	public void quitar(String placa);
	
	public void modificar(BigDecimal precio,String marca, String placa);

}
