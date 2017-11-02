package es.uji.asciiart.main;

import java.util.ArrayList;
import java.util.List;

import es.uji.asciiart.domain.AsciiArt;
import es.uji.asciiart.domain.Cuadrado;
import es.uji.asciiart.domain.DuplicaHorizontal;
import es.uji.asciiart.domain.Marco;
import es.uji.asciiart.domain.Triangulo;

public class Main {

	public static void main(String[] args) {
		
		List<AsciiArt>  cosas =	new	ArrayList<AsciiArt>();	
		cosas.add(new	Cuadrado(3, 'o'));	
		cosas.add(new	Triangulo(5, 't'));	
		
		for	(AsciiArt cosa : cosas)	
			dibuja(new	Marco(new	DuplicaHorizontal(cosa),	'·'));
//			dibuja(cosa);
//			dibuja(new Marco(new Marco(cosa, '.'), '-'));
			
	}
	
	private static void dibuja(AsciiArt asciiArt) {
		for(String i: asciiArt.getLineas()) {
			System.out.println(i);
		}
	}
}