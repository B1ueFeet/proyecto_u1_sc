package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.banco.modelo.CuentaBancaria;
import com.example.demo.banco.service.ICuentaBancariaService;

@SpringBootApplication
public class ProyectoU1ScApplication implements CommandLineRunner {
	
	@Autowired
	private ICuentaBancariaService bancariaService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1ScApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		CuentaBancaria bancaria1 = new CuentaBancaria();
		bancaria1.setNumero("0002");
		bancaria1.setSaldo(new BigDecimal(200));
		bancaria1.setTipo("A");
		bancaria1.setTitular("Serghy Castillo");
		
		
		CuentaBancaria bancaria2 = new CuentaBancaria();
		bancaria2.setNumero("0023");
		bancaria2.setSaldo(new BigDecimal(300));
		bancaria2.setTipo("B");
		bancaria2.setTitular("Edison Moncayo");
		
		this.bancariaService.insertar(bancaria1);
		this.bancariaService.insertar(bancaria2);
		
	}

}
