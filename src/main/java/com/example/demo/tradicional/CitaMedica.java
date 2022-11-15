package com.example.demo.tradicional;

import java.time.LocalDateTime;

public class CitaMedica {

	private String numero;
	private LocalDateTime fechaCita, fechaAgenda;
	private Medico medico;
	private Paciente paciente;
	
	private void agendar(String numero,LocalDateTime fechac, String nombreMed, String cedMed, String nombrePaciente, String cedulaPaciente ) {
		
		this.numero = numero;
		this.fechaCita = fechaCita;
		
		Medico medico = new Medico ();
		medico.setCedula(cedMed);
		medico.setNombre(nombreMed);
		
		this.medico = medico;
		
			Paciente pacienteO = new Paciente();
			pacienteO.setCedula(cedulaPaciente);
			pacienteO.setNombre(nombrePaciente);
		
	}
	
	//GETTER & SETTER
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public LocalDateTime getFechaCita() {
		return fechaCita;
	}
	public void setFechaCita(LocalDateTime fechaCita) {
		this.fechaCita = fechaCita;
	}
	public LocalDateTime getFechaAgenda() {
		return fechaAgenda;
	}
	public void setFechaAgenda(LocalDateTime fechaAgenda) {
		this.fechaAgenda = fechaAgenda;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	
	
	
	
}
