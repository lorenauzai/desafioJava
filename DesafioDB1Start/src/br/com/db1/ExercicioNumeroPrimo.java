package br.com.db1;

public class ExercicioNumeroPrimo {

	private Integer resposta;
	
	public Integer numeroPrimo(Integer primo) {
		Integer cont = 0;
		for(Integer i = 1; i <= primo; i++) {
			if(primo % i ==0) {
				cont++;
			}
		}
		if(cont == 2) {
			System.out.println("O número: "+primo+ " é primo");
		}else {
			System.out.println("Número não é primo");
		}
		
		return resposta = primo;
	}
	
	public Integer exibirResultado(Integer resposta) {
		return resposta;
	}
}
