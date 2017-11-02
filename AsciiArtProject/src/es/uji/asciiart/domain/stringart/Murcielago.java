package es.uji.asciiart.domain.stringart;

import java.util.ArrayList;
import java.util.List;

public class Murcielago extends StringArt
{
 public String dibujo()
	 {
		List<String> mur = new ArrayList<String>();
		mur.add(" ) \\     / (");
		mur.add(")_  \\_V_/  _(");
		mur.add("  )__   __(");
		mur.add("     `-'");
		String murString = "";
		for (String s : mur)
		murString += s + "\t";
		return murString;
	 }
}
