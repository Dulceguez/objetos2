package ar.edu.unlp.info.oo1.ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TwitterTest {
	Twitter twitter;
	
	@BeforeEach
	void setUp() {
		twitter = new Twitter();
		Usuario u1 = new Usuario("Jorge");
		twitter.agregarUsuario(u1);
	}
	
	@Test
	void testAgregarUsuario() {
		Usuario u2 = new Usuario("Ana");
		twitter.agregarUsuario(u2);
		assertTrue(twitter.getUsuarios().contains(u2));
	}
	@Test
	void testEliminarUsuario() {
		Usuario u3 = new Usuario("Marta");
		twitter.agregarUsuario(u3);
		twitter.eliminarUsuario(u3);
	}

}
