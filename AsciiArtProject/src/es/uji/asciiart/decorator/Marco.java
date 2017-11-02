package es.uji.asciiart.decorator;

import es.uji.asciiart.domain.AsciiArt;

public class Marco extends AsciiArtDecorator{
	
	private char c;
	
	public Marco(AsciiArt asciiArt, char c){
		super(asciiArt);
		this.c = c;
	}
	
	@Override
	public String[] getLineas() {
		
		int ancho = super.getAncho();
		int alto = super.getAlto();
		
		String[] lineasMarco = new String[alto+2];
		lineasMarco[0] = new String(new char[ancho+2]).replace("\0", ""+c);
		
		int i=1;
		for(String linea: super.getLineas()) {
			lineasMarco[i] = ""+c + linea;
			
			for(int j=linea.length(); j<ancho; j++) {
				lineasMarco[i] += " ";
			}
			lineasMarco[i]+=""+c;
			i++;
		}
		lineasMarco[lineasMarco.length-1] = new String(new char[ancho+2]).replace("\0", ""+c);
		return lineasMarco;
	}
	
	@Override
	public int getAncho() {
		return super.getAncho()+2;
	}
	
	@Override
	public int getAlto() {
		return super.getAlto() +2;
	}
}