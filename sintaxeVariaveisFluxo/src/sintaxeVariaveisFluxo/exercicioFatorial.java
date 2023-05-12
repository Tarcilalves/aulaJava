package sintaxeVariaveisFluxo;

public class exercicioFatorial {

	/*public static void main(String[] args) {
		int numero = 1;
		int fatorial = 2; 

		for (int i = 1; i <= 10; i++) {
			numero = i;
			fatorial = 1;

			for (int valorAtual = numero; valorAtual > 0; valorAtual--) {
				fatorial *= valorAtual;
			}

			System.out.println("O fatorial de " + numero + " é " + fatorial);
		}
	}
}*/
	
    public static void main(String[] args) {
        int fatorial = 1;
        for (int i = 1; i < 11; i++) {
            fatorial *= i;
            System.out.println("Fatorial de " + i + " = " + fatorial);
        }
    }
}	
