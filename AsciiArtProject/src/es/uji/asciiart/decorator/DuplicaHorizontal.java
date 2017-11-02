package es.uji.asciiart.decorator;

import es.uji.asciiart.domain.asciiart.AsciiArt;

public class DuplicaHorizontal extends AsciiArtDecorator{

	public DuplicaHorizontal(AsciiArt asciiArt){
			super(asciiArt);
		}

	@Override
	public String[] getLineas() {

		int ancho = super.getAncho();
		int alto = super.getAlto();
		
		String[] lineasDuplicadas = new String[alto];
		int i=0;
		for(String linea: super.getLineas()) {
			int diferencia = ancho-linea.length();
			lineasDuplicadas[i]=linea;
			for (int j=0;j<diferencia;j++) {
				lineasDuplicadas[i]+=" ";
			}
			lineasDuplicadas[i]+=" "+linea;
			i++;
		}
		return lineasDuplicadas;
	}

	@Override
	public int getAncho() {
		return super.getAncho() * 2 +1;
	}

}
