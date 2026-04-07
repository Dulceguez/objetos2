package ar.edu.unlp.info.oo1.ejercicio2;

public class Lagarto implements Opcion {

	@Override
	public String getGano(Tijera t) {
		return "Tijera";
	}

	@Override
	public String getGano(Papel p) {
		return "Lagarto";
	}

	@Override
	public String getGano(Piedra p) {
		return "Piedra";
	}

	@Override
	public String getGano(Lagarto l) {
		return "Empate";
	}

	@Override
	public String getGano(Spock s) {
		return "Lagarto";
	}

}
