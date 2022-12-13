package com.example.demo.tienda.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.tienda.modelo.Cliente;

@Repository
public class ClienteRepositoryImpl implements IClienteRepository {

	private static List<Cliente> baseDatos = new ArrayList<>();

	@Override
	public void insertar(Cliente cliente) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actualizar(Cliente cliente) {
		Cliente cli = null;
		for (Cliente cb : baseDatos) {
			if (cb.getCedula().equals(cliente.getCedula())) {
				cli = cb;
			}
		}

		baseDatos.remove(cliente);
		baseDatos.add(cli);
		System.out.println("se actualiza el cliente: " + cli);

	}

	@Override
	public Cliente buscar(String cedula) {
		Cliente cli = null;
		for (Cliente cb : baseDatos) {
			if (cb.getCedula().equals(cedula)) {
				cli = cb;
			}
		}

		System.out.println("se busca el cliente: " + cli);
		return cli;
	}

	@Override
	public void eliminar(String cedula) {
		Cliente cli = null;
		for (Cliente cb : baseDatos) {
			if (cb.getCedula().equals(cedula)) {
				cli = cb;
			}
		}

		baseDatos.remove(cli);
		System.out.println("se elimina el cliente: " + cli);

	}

}
