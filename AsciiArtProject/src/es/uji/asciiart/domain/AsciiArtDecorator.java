package es.uji.asciiart.domain;

public abstract class AsciiArtDecorator extends AsciiArt {

	private AsciiArt asciiArt;
	
	public AsciiArtDecorator(AsciiArt asciiArt) {
		this.asciiArt = asciiArt;
	}
	
	@Override
	public String[] getLineas() {
		return asciiArt.getLineas();
	}
}
