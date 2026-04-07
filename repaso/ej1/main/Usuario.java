package ar.edu.unlp.info.oo1.ejercicio1;

import java.util.ArrayList;
import java.util.List;


public class Usuario {

	private String screenName;
	private List tweets;
	
	public Usuario(String screenName) {
	
		this.screenName = screenName;
		this.tweets = new ArrayList<Tweet>();
	}
	
	public String getScreenName() {
		return this.screenName;
	}
	

}
