package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquais {

	public static void main(String[] args) {
		
//		Conta cc1 = new ContaCorrente(22, 22);
//        Conta cc2 = new ContaCorrente(22, 22);
//
//        boolean igual = cc1.ehIgual(cc2);
//        System.out.println(igual);
		
	     ArrayList<Conta> lista = new ArrayList<Conta>();

         Conta cc = new ContaCorrente(22, 11);
         lista.add(cc);

         Conta cc2 = new ContaCorrente(22, 22);
         lista.add(cc2);    
         
         Conta cc3 = new ContaCorrente(22, 22);
         boolean existe = lista.contains(cc3);

         System.out.println("Já existe? " + existe);
         
//         for(Conta conta : lista) {
//        	 if(conta.ehIgual(cc3)) {
//                 System.out.println("Já tenho essa conta!");
//             }
//         }

         for(Object o : lista) {
             System.out.println(o);
         }

	}

}
