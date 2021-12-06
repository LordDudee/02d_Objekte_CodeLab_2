package com.cc.java;

public class App {

	public static void main(String[] args) {
		
		Staff staff1 = new Staff("Michael", "Runschke", "Boss", 2017);

		output("Vorname: " + staff1.getInfo("#first"));
        output("Nachname: " + staff1.getInfo("#family"));
		output("Funktion im Betrieb: " + staff1.getInfo("#role"));
		output("Eintrittsjahr: " + staff1.getInfo("#entry"));

		output("-------------------------------------------------------------");

		Staff staff2 = new Staff("Patrick", "Barkow", "Anwendungsentwickler", 2019);

		output("Vorname: " + staff2.getInfo("#first"));
        output("Nachname: " + staff2.getInfo("#family"));
		output("Funktion im Betrieb: " + staff2.getInfo("#role"));
		output("Eintrittsjahr: " + staff2.getInfo("#entry"));

		output("-------------------------------------------------------------");

		Staff staff3 = new Staff("Mohamed", "Soliman", "Systemintegrator", 2019);

		output("Vorname: " + staff3.getInfo("#first"));
        output("Nachname: " + staff3.getInfo("#family"));
		output("Funktion im Betrieb: " + staff3.getInfo("#role"));
		output("Eintrittsjahr: " + staff3.getInfo("#entry"));

	}

		

	
	private static void output(String outStr) {
		System.out.println(outStr);
	}

};
