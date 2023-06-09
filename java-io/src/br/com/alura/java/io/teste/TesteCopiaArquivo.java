package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteCopiaArquivo {

	public static void main(String[] args) throws IOException {
	
		//InputStream fis = new FileInputStream("texto.txt");
		InputStream fis = System.in; // teclado
		Reader isr = new InputStreamReader(fis);
		BufferedReader br =  new BufferedReader(isr);
		
		//OutputStream fos = new FileOutputStream("texto2.txt");		
		OutputStream fos = System.out;
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw =  new BufferedWriter(osw);

		String linha = br.readLine();
		
		while(linha != null && !linha.isEmpty()) {
            bw.write(linha);
            bw.newLine();
            bw.flush();
            linha = br.readLine();
		}
		
		System.out.println(linha);
		
		br.close();
		bw.close();
	}

}
