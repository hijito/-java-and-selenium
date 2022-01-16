package org.all;

import org.english.English;

public class LanguageClass extends English{
	private void allLanguage() {
		System.out.println("Tamil,English,Telgu");

	}
	public static void main(String[] args) {
		LanguageClass l = new LanguageClass();
		l.allLanguage();
		l.englishLanguage();
		l.tamilLanguage();
		l.telguLanguage();
				
	}

}
