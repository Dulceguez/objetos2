package ar.edu.unlp.info.oo1.ejercicio1;

import java.time.LocalDate;

public class Tweet extends TweetBase {
	private String texto;

	public Tweet(LocalDate fec, String texto) {
		super(fec);
		if (texto.length() < 1 || texto.length() > 280) {
				System.out.print("El tweet debe tener entre 1 y 280 caracteres");
		} else this.texto = texto;
		
	}
	
	
}
