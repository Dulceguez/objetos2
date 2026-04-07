package ar.edu.unlp.info.oo1.ejercicio2;

public class Spock implements Opcion {

	@Override
	public String getGano(Tijera t) {
		return "Spock";
	}

	@Override
	public String getGano(Papel p) {
		return "Papel";
	}

	@Override
	public String getGano(Piedra p) {
		return "Spock";
	}

	@Override
	public String getGano(Lagarto l) {
		return "Lagarto";
	}

	@Override
	public String getGano(Spock s) {
		return "Empate";
	}

}
