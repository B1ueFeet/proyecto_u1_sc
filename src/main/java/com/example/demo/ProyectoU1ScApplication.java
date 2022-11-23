package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Spring.boot.CitaMedicaSB;
import com.example.demo.Spring.boot.MedicoSB;
import com.example.demo.Spring.boot.PacienteCancerSB;
import com.example.demo.Spring.boot.PacienteTerceraEdadSB;
import com.example.demo.herencia.MedicoH;

@SpringBootApplication
public class ProyectoU1ScApplication implements CommandLineRunner {

	@Autowired
	private PacienteTerceraEdadSB pacienteTerceraE;
	@Autowired
	private CitaMedicaSB citaM;
	@Autowired
	private MedicoSB medico;
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1ScApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Spring Boot");
		System.out.println(pacienteTerceraE);
		this.pacienteTerceraE.setCodigoIESS("12345");
		this.pacienteTerceraE.setNombre("Edison");
		this.pacienteTerceraE.setCedula("17171547");
		this.pacienteTerceraE.setTipo("");
		
		medico.setCedula("123123");
		medico.setNombre("Diana");
		
		citaM.agendar("123123", LocalDateTime.of(2022, 12, 2, 8, 30),pacienteTerceraE, medico);
		System.out.println(pacienteTerceraE);
		
	}

}
