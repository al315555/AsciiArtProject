package es.uji.asciiart.domain.asciiart;

public class Cuadrado extends AsciiArt{
	
	public Cuadrado(int size, char c) {
		super();
		
		lineas = new String[size];
		
		String linea = new String(new char[size]).replace("\0", ""+c);
		
		for (int i=0; i<size; i++) {
			lineas[i] = linea;
		}
	}
}