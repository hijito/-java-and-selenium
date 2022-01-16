package org.lang;

public class StateDetails {
	private void southIndia() {
		
		System.out.println("tamilnadu");
	   
    }
	private void northIndia() {
		System.out.println("uttarpradesh");

	}
	public static void main(String[] args) {
		LanguageInfo l = new LanguageInfo();
		l.tamilLanguage();
		l.englishLanguage();
		l.hinidiLanguage();
		
		StateDetails s = new StateDetails();
		s.northIndia();
		s.southIndia();
	}

}
