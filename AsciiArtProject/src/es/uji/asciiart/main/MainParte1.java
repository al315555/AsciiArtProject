package es.uji.asciiart.main;

import java.util.ArrayList;
import java.util.List;

import es.uji.asciiart.decorator.DuplicaHorizontal;
import es.uji.asciiart.decorator.Marco;
import es.uji.asciiart.domain.asciiart.AsciiArt;
import es.uji.asciiart.domain.asciiart.Cuadrado;
import es.uji.asciiart.domain.asciiart.Triangulo;

public class MainParte1 {

	public static void main(String[] args) {
		
		List<AsciiArt>  cosas =	new	ArrayList<AsciiArt>();	
		cosas.add(new	Cuadrado(3, 'o'));	
		cosas.add(new	Triangulo(5, 't'));	
		
		for	(AsciiArt cosa : cosas)	
			dibuja(new Marco(
					new DuplicaHorizontal(
							new	Marco(
									new	DuplicaHorizontal(cosa),	'·')
							)
					,'?'));
//			dibuja(cosa);
//			dibuja(new Marco(new Marco(cosa, '.'), '-'));
			
	}
	
	private static void dibuja(AsciiArt asciiArt) {
		for(String i: asciiArt.getLineas()) {
			System.out.println(i);
		}
		System.out.println();
	}
}