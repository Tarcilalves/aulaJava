package br.com.tarcila.bytebank;

public class testeBiblioteca {

	public static void main(String[] args) {
		
		Conta c = new ContaCorrente(123, 321);
		c.deposita(200.3);

        System.out.println(c.getSaldo());

	}

}
