package es.uji.asciiart.domain;

public abstract class AsciiArt {

	protected String[]	lineas	=	{"XX",	"XX"};	
	public	int getAncho()	{	return	lineas[0].length();	}
	public	int getAlto()	{	return lineas.length;	}	
	public	String[]	getLineas()	{	return lineas;	}
}
