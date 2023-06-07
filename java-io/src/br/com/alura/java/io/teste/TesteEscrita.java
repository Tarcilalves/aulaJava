package br.com.alura.java.io.teste;


import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		
		//Fluxo de Entrada com Arquivo
		OutputStream fos = new FileOutputStream("texto2.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw =  new BufferedWriter(osw);
		
		bw.write("A especialidade \"UX Writer\" refere-se a um profissional que se concentra na criação de conteúdo escrito");
       //s bw.newLine();
        bw.newLine();
        bw.write("escrito se alinhe à estrutura e ao fluxo de um produto.");
		
		bw.close();
	}

}
