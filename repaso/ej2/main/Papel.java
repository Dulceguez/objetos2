package ar.edu.unlp.info.oo1.ejercicio2;

public class Papel implements Opcion {

	public String getGano(Piedra p) {
		return "Papel";
	}
	public String getGano(Papel p) {
		return "Empate";
	}
	public String getGano(Tijera t) {
		return "Tijera";
	}
	@Override
	public String getGano(Lagarto l) {
		return "Lagarto";
	}
	@Override
	public String getGano(Spock s) {
		return "Papel";
	}
}
