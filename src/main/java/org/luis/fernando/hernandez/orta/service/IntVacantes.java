package org.luis.fernando.hernandez.orta.service;

import java.util.List;


import org.luis.fernando.hernandez.orta.model.Vacante;

public interface IntVacantes {
	
	public List<Vacante> obtenerTodas();
	public void guardar(Vacante vacante);
	public void eliminar(Integer idVacante);
	public Vacante buscarPorId(Integer idVacante);
	public long numeroVacantes();

}
