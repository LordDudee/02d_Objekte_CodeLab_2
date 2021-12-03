package com.cc.java;

public class App {

	public static void main(String[] args) {
		
		Staff staff1 = new Staff("firstName", "familyName", "role", "yearOfEntry");

		output("Vorname: " + staff1.getInfo("#first"));
        output("Nachname: " + staff1.getInfo("#family"));
		output("Funktion im Betrieb: " + staff1.getInfo("#role"));
		output("Eintrittsjahr: " + staff1.getInfo("#entry"));
	}


	
	private static void output(String outStr) {
		System.out.println(outStr);
	}

};
