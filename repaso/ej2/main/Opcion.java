package ar.edu.unlp.info.oo1.ejercicio2;

public interface Opcion {
	
	String getGano(Tijera t);
	String getGano(Papel p);
	String getGano(Piedra p);
	String getGano(Lagarto l);
	String getGano(Spock s);
}