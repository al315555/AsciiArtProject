package es.uji.asciiart.decorator;

import es.uji.asciiart.domain.AsciiArt;

public abstract class AsciiArtDecorator extends AsciiArt {

	private AsciiArt asciiArt;
	
	public AsciiArtDecorator(AsciiArt asciiArt) {
		this.asciiArt = asciiArt;
	}
	
	@Override
	public String[] getLineas() {
		return asciiArt.getLineas();
	}
	
	@Override
	public int getAncho() {
		return asciiArt.getAncho();
	}
	
	@Override
	public int getAlto() {
		return asciiArt.getAlto();
	}
}