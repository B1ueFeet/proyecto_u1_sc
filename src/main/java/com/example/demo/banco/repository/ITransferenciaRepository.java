package com.example.demo.banco.repository;

import com.example.demo.banco.modelo.Transferencia;

public interface ITransferenciaRepository {

	//CRUD: siempre hasta tener experiencia
	
	public Transferencia buscar(Integer id);
	public void actualizar(Transferencia tranferencia);
	public void insertar(Transferencia tranferencia);
	public void borrar(Integer id);
}