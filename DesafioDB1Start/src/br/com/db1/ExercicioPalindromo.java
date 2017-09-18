package br.com.db1;

public class ExercicioPalindromo {

	public static boolean ePalindromo(String palavra) {
		return palavra.equals(new StringBuilder(palavra).reverse().toString());
	}

	public static void main(String[] args) {
		String palavra = "ommo";
		Integer numCaracteres = palavra.length();
		System.out.println("Palavra é um palindromo?: " + ePalindromo(palavra) + ", Palavra tem " + numCaracteres
				+ " números de Caracteres");
	}
}
