package ar.edu.unlp.info.oo1.ejercicio1;

import java.util.HashSet;
import java.util.Set;

public class Twitter {
	private Set usuarios;
	
	public Twitter() {
		usuarios = new HashSet<Usuario>();
	}
	
	public Set getUsuarios() {
		return this.usuarios;
	}
	
	public void eliminarUsuario(Usuario u) {
		this.usuarios.remove(u);
	}
	
	public void agregarUsuario(Usuario u) {
		this.usuarios.add(u);
	}
}
