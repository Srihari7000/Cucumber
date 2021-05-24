package org.lang;

public class  StateDetails {
	public void southIndia() {
		System.out.println("South india");
	}
	public void northIndia() {
		System.out.println("North india");
	}
	public static void main(String[] args) {
		LanguageInfo LI = new LanguageInfo();
		StateDetails Sd = new StateDetails ();
		LI.tamilLanguage();
		LI.englishLanguage();
		LI.hindiLanguage();
			Sd.southIndia ();
			Sd.northIndia();
			
	}
}
