package es.uji.asciiart.adapter;

import java.util.ArrayList;
import es.uji.asciiart.domain.asciiart.AsciiArt;
import es.uji.asciiart.domain.stringart.StringArt;

public class StringArt2AsciiArt extends AsciiArt{
	
	private StringArt stringArt;
	
	public StringArt2AsciiArt(StringArt str){
		this.stringArt=str;
		System.out.println();
	}
	
	@Override
	public String[] getLineas(){
		String strDibujo = stringArt.dibujo();
		ArrayList<String> lista = new ArrayList<String>();
		String linea = "";
		for(int i = 0; i<strDibujo.length(); i++){
			linea += strDibujo.charAt(i);
			if(linea.endsWith("\n") || linea.endsWith("\t")){
				lista.add(linea.substring(0, linea.length()-2));
				linea="";
			}
		}
		
		String[] listaResultante= new String[lista.size()];
		for(int i = 0; i<lista.size();i++){
			listaResultante[i]=lista.get(i);
		}
		
		return listaResultante;
	}
	
	@Override
	public int getAlto(){
		return this.getLineas().length;
	}
	
	@Override
	public int getAncho(){
		String strDibujo = stringArt.dibujo();
		int max = 0;
		String linea="";
		for(int i = 0; i<strDibujo.length(); i++){
			linea += strDibujo.charAt(i);
			if(linea.endsWith("\n") || linea.endsWith("\t")){
				max=linea.length()>max?linea.length():max;
				linea="";
			}
		}
		return max;
	}
}
