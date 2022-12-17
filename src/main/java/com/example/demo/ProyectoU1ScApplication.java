package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.ejercicio1.modelo.Propietario;
import com.example.demo.ejercicio1.modelo.Vehiculo;
import com.example.demo.ejercicio1.service.IMatriculaService;
import com.example.demo.ejercicio1.service.IPropietarioService;
import com.example.demo.ejercicio1.service.IVehiculoSservice;

@SpringBootApplication
public class ProyectoU1ScApplication implements CommandLineRunner {

	@Autowired
	private IVehiculoSservice vehiculoSservice;

	@Autowired
	private IPropietarioService propietarioService;

	@Autowired
	private IMatriculaService matriculaService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1ScApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// opcion 1
		Vehiculo vehiculo = new Vehiculo();
		vehiculo.setMarca("TOYOTA");
		vehiculo.setPlaca("PDG-9939");
		vehiculo.setPrecio(new BigDecimal(20000));
		vehiculo.setTipo("P");

		this.vehiculoSservice.crear(vehiculo);

		vehiculo.setMarca("Toyota");
		vehiculo.setTipo("L");

		this.vehiculoSservice.modificar(vehiculo);

		// Opciuon 2
		Propietario propietario = new Propietario();
		propietario.setApellido("Castillo");
		propietario.setCedula("17171844466");
		propietario.setNombre("Serghy");
		propietario.setFechaNacimiento(LocalDateTime.of(1997, 7, 12, 12, 35));
		this.propietarioService.agregar(propietario);
		
		// OPCION 3
		this.matriculaService.matricular("17171844466", "PDG-9939");
	}

}
