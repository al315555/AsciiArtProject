package es.uji.asciiart.adapter;

import es.uji.asciiart.domain.asciiart.AsciiArt;
import es.uji.asciiart.domain.stringart.StringArt;

public class StringArt2AsciiArt extends AsciiArt{
	
	private StringArt stringArt;
	private final String separador;
	
	public StringArt2AsciiArt(StringArt str){
		this.stringArt=str;
		String aux = str.dibujo();
		this.separador=aux.substring(aux.length()-1);
	}
	
	@Override
	public String[] getLineas(){
		return stringArt.dibujo().split(separador);
	}
	
	@Override
	public int getAlto(){
		return stringArt.dibujo().split(separador).length;
	}
	
	@Override
	public int getAncho(){
		String[] strList = stringArt.dibujo().split(separador);
		int max=0;
		for(String linea:strList)
			max=linea.length()>max?linea.length():max;
		return max;
	}
}
