package com.example.demo.ejercicio1.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ejercicio1.modelo.Vehiculo;
import com.example.demo.ejercicio1.repository.IVehiculoRepository;

@Service
public class VehiculoServiceImpl implements IVehiculoSservice {
	@Autowired
	private IVehiculoRepository vehiculoRepository;

	@Override
	public Vehiculo buscar(String placa) {
		return this.vehiculoRepository.buscar(placa);
	}

	@Override
	public void crear(Vehiculo vehiculo) {
		this.vehiculoRepository.insertar(vehiculo);
	}

	@Override
	public void modificar(Vehiculo vehiculo) {
		this.vehiculoRepository.actualizar(vehiculo);
	}

	@Override
	public void quitar(String placa) {
		this.vehiculoRepository.borrar(placa);
	}

	@Override
	public void modificar(BigDecimal precio, String marca, String placa) {
		// TODO Auto-generated method stub
		
		Vehiculo vehiculo = this.buscar(placa);
		vehiculo.setMarca(marca);
		vehiculo.setPrecio(precio);
		
		this.vehiculoRepository.actualizar(vehiculo);
		
	}

}
