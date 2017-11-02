package es.uji.asciiart.main;

import java.util.ArrayList;
import java.util.List;

import es.uji.asciiart.adapter.StringArt2AsciiArt;
import es.uji.asciiart.decorator.Marco;
import es.uji.asciiart.domain.asciiart.AsciiArt;
import es.uji.asciiart.domain.stringart.Murcielago;
import es.uji.asciiart.domain.stringart.Rana;
import es.uji.asciiart.domain.stringart.StringArt;

public class MainParte2 {

	public static void main(String[] args) {
		
		List<StringArt> animales = new ArrayList<StringArt>();
		animales.add(new Rana());
		animales.add(new Murcielago());
		
		for (StringArt animal : animales) {
			dibuja(new Marco(new StringArt2AsciiArt(animal), '#'));
		}
			
	}
	
	private static void dibuja(AsciiArt asciiArt) {
		for(String i: asciiArt.getLineas()) {
			System.out.println(i);
		}
	}
}
