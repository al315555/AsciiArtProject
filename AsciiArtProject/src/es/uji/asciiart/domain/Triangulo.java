package es.uji.asciiart.domain;

public class Triangulo extends AsciiArt{

	public Triangulo(int size, char c) {
		super();
		
		lineas = new String[size];
		
		String linea = ""+c;
		
		for (int i=0; i<size; i++) {
			lineas[i] = linea;
			linea += c;
		}
	}
	
	@Override
	public int getAncho() {
		return lineas[lineas.length-1].length();
	}
}