package ar.edu.unlp.info.oo1.ejercicio2;

public class Piedra implements Opcion {


	public String getGano(Piedra p) {
		return "Empate";
	}
	public String getGano(Papel p) {
		return "Papel";
	}
	public String getGano(Tijera t) {
		return "Piedra";
	}
	@Override
	public String getGano(Lagarto l) {
		return "Piedra";
	}
	@Override
	public String getGano(Spock s) {
		return "Spock";
	}
}
