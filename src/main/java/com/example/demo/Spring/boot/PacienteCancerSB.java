package com.example.demo.Spring.boot;

import org.springframework.stereotype.Component;

@Component
public class PacienteCancerSB extends PacienteSB{
	public Integer calcularDescuento() {
		System.out.println("Paciente con descuento del 30%");
		return 30;
	}
}
