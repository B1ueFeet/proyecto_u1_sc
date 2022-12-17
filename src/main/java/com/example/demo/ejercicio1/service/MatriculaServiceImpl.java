package com.example.demo.ejercicio1.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ejercicio1.modelo.Matricula;
import com.example.demo.ejercicio1.modelo.Propietario;
import com.example.demo.ejercicio1.modelo.Vehiculo;
import com.example.demo.ejercicio1.repository.IMatriculaRepository;
import com.example.demo.ejercicio1.repository.IPropietarioRepository;

@Service
public class MatriculaServiceImpl implements IMatriculaService {
	@Autowired
	private IMatriculaRepository matriculaRepository;
	@Autowired
	private IPropietarioRepository propietarioRepository;
	@Autowired
	private IVehiculoSservice vehiculoSservice;

	@Override
	public void matricular(String cedula, String placa) {
		// TODO Auto-generated method stub

		Matricula matricula = null;

		matricula.setFecha(LocalDateTime.now());

		Propietario propietario = this.propietarioRepository.buscar(cedula);

		matricula.setPropietario(propietario);

		Vehiculo vehiculo = this.vehiculoSservice.buscar(placa);

		matricula.setVehiculo(vehiculo);

		BigDecimal valor = null;

		if (vehiculo.getTipo().equalsIgnoreCase("p")) {
			valor = vehiculo.getPrecio().multiply(new BigDecimal(0.15));
		} else {
			valor = vehiculo.getPrecio().multiply(new BigDecimal(0.10));
		}
		// -1 CUANDO IZQ ES MENOR / 0 IGUALES / 1 CUANDO IZQ ES MAYOR
		if (valor.compareTo(new BigDecimal(2000)) > 1) {
			BigDecimal descuento = valor.multiply(new BigDecimal(0.07));
			valor = valor.subtract(descuento);
		}
		matricula.setValor(valor);
		this.matriculaRepository.insertar(matricula);
	}

}
