package musicArchiever;

import java.util.ArrayList;
import java.util.List;

public class Archiv {
	
	private String interpret;
	private String titel;
	
	
	public Archiv(String interpret, String titel)
	{
		this.interpret = interpret;
		this.titel = titel;
	}
	
	public String getInterpret() {
		return interpret;
	}
	public void setInterpret(String interpret) {
		this.interpret = interpret;
		//
	}
	public String getTitel() {
		return titel;
	}
	public void setTitel(String titel) {
		this.titel = titel;
	}
	
	
	
	

}
