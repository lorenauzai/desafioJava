package br.com.db1.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.ExercicioPalindromo;

public class ExercicioPalindromoTest {

	ExercicioPalindromo palindromo = new ExercicioPalindromo();

	@Test
	public void PalindromoTest() {
		palindromo.ePalindromo("ommo");
		Assert.assertTrue(true);
	}
}
