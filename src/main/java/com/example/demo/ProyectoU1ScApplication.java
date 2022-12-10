package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.banco.modelo.CuentaBancaria;
import com.example.demo.banco.modelo.Transferencia;
import com.example.demo.banco.service.ICuentaBancariaService;
import com.example.demo.banco.service.ITransferenciaService;

@SpringBootApplication
public class ProyectoU1ScApplication implements CommandLineRunner {

	@Autowired
	private ICuentaBancariaService bancariaService;
	@Autowired
	private ITransferenciaService transferenciaService;

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
		this.bancariaService.insertar(bancaria1);

		CuentaBancaria bancaria2 = new CuentaBancaria();
		bancaria2.setNumero("0023");
		bancaria2.setSaldo(new BigDecimal(300));
		bancaria2.setTipo("B");
		bancaria2.setTitular("Edison Moncayo");
		this.bancariaService.insertar(bancaria2);
		
		System.err.println("SALDOS 	ACTAULES");
		CuentaBancaria cuentaActual  = this.bancariaService.buscarPorNumero("0002");
		CuentaBancaria CuentaActual2  = this.bancariaService.buscarPorNumero("0023");
		
		System.out.println("Saldo Actual:" + cuentaActual.getSaldo());
		System.out.println("Saldo Actual:" + CuentaActual2.getSaldo());
		
		System.out.println("Reporte 1");
		for(Transferencia t : this.transferenciaService.buscarReporte()) {
			System.out.println(t);
		}

		this.transferenciaService.realizar("0002", "0023", new BigDecimal(10));
		
		System.out.println("Reporte 2");
		for(Transferencia t : this.transferenciaService.buscarReporte()) {
			System.out.println(t);
		}
		
		
		System.err.println("SALDOS NUEVOS");
		CuentaBancaria cuentaActual3  = this.bancariaService.buscarPorNumero("0002");
		CuentaBancaria cuentaActual4  = this.bancariaService.buscarPorNumero("0023");
		
		System.out.println("Nuevo saldo:" + cuentaActual3.getSaldo());
		System.out.println("Nuevo saldo:" + cuentaActual4.getSaldo());

		
		


	}

}
