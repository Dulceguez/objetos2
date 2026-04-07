package ar.edu.unlp.info.oo1.ejercicio2;

public class Tijera implements Opcion {

	public String getGano(Piedra p) {
		return "Piedra";
	}
	public String getGano(Papel p) {
		return "Tijera";
	}
	public String getGano(Tijera t) {
		return "Empate";
	}
	@Override
	public String getGano(Lagarto l) {
		return "Tijera";
	}
	@Override
	public String getGano(Spock s) {
		return "Spock";
	}

}
