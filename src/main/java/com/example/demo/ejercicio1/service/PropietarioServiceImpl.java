package com.example.demo.ejercicio1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ejercicio1.modelo.Propietario;
import com.example.demo.ejercicio1.repository.IPropietarioRepository;

@Service
public class PropietarioServiceImpl implements IPropietarioService{
	@Autowired
	private IPropietarioRepository propietarioRepository;
	@Override
	public void agregar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.propietarioRepository.insertar(propietario);
		
	}

	@Override
	public void eliminar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.propietarioRepository.eliminar(propietario);
	}

}
