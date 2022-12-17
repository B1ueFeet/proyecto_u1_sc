package com.example.demo.ejercicio1.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.ejercicio1.modelo.Vehiculo;

@Repository
public class VehiculoRepositoryImpl implements IVehiculoRepository {

	private static List<Vehiculo> base = new ArrayList<>();

	@Override
	public Vehiculo buscar(String placa) {

		Vehiculo vehiculo = null;
		for (Vehiculo v : base) {
			if (v.getPlaca().equals(placa)) {
				vehiculo = v;
			}
		}
		return vehiculo;
	}

	@Override
	public void insertar(Vehiculo vehiculo) {

		base.add(vehiculo);

	}

	@Override
	public void actualizar(Vehiculo vehiculo) {

		Vehiculo vehiculoEncontrado = null;
		for (Vehiculo v : base) {
			if (v.getPlaca().equals(vehiculo.getPlaca())) {
				vehiculoEncontrado = v;
			}
		}
		base.remove(vehiculoEncontrado);
		base.add(vehiculo);
	}

	@Override
	public void borrar(String placa) {

		base.remove(this.buscar(placa));
	}

}