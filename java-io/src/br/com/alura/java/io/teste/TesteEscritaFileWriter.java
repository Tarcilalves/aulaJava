package br.com.alura.java.io.teste;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
		
		//Fluxo de Entrada com Arquivo
//		OutputStream fos = new FileOutputStream("texto2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw =  new BufferedWriter(osw);
		
//		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));	
		
		//PrintStream ps = new PrintStream(new File("lorem2.txt"));
		
		
		PrintStream ps = new PrintStream("lorem2.txt");
		ps.println("A especialidade \"UX Writer\" refere-se a um profissional que se concentra na criação de conteúdo escrito");		
		ps.println();
		
		ps.println("escrito se alinhe à estrutura e ao fluxo de um produto.");
		
		ps.close();
		
		System.out.println();
	}

}
