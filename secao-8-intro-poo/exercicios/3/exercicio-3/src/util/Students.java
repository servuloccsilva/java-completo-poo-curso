package util;

import java.util.Locale;

public class Students {
	
	public String nome;
	public double grade1;
	public double grade2;
	public double grade3;
	
	public String result() {
		Locale.setDefault(Locale.US);
		
		double finalGrade = grade1 + grade2 + grade3;
		
		if(finalGrade >= 60) {
			return ("FINAL GRADE = " + String.format("%.2f", finalGrade)+ "\n" + "PASS");
		} 
		else {
			double missing = 60.00 - finalGrade;
			return ("FINAL GRADE = " + String.format("%.2f", finalGrade)+ "%n" 
		+ "FAILED"
		+ "\n"
		+ "MISSING "
		+ String.format("%.2f", missing)
		+ " POINS"
		);
		}
						
	}
	

}
