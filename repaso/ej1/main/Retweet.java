package ar.edu.unlp.info.oo1.ejercicio1;

import java.time.LocalDate;

public class Retweet extends TweetBase {
	private Tweet origen;

	public Retweet(LocalDate fec, Tweet origen) {
		super(fec);
		this.origen = origen;
	}
	
	public Tweet origen() {
		return this.origen;
	}
}
