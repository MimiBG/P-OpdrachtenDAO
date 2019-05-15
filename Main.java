package week1.Les1.P1;


public class Main {
	public static void main(String[] args) {
		Reiziger r1 = new Reiziger("Stef", "01-01-1996");
		Reiziger r2 = new Reiziger("Lisa", "01-02-1995");
		Reiziger r3 = new Reiziger("Tess", "01-04-1994");

		//Voeg Reiziger Object toe aan het lijst
		ReizigerOracleDaoImpl t1 = new ReizigerOracleDaoImpl();
		t1.alleReizigers.add(r1);
		t1.alleReizigers.add(r2);
		t1.alleReizigers.add(r3);

		System.out.println("Reiziger toegevoegd aan het lijst: ");
		System.out.println(t1.findAll());

		//Verwijder Reiziger Object uit het lijst
		System.out.println();
		System.out.println("Reiziger verwijderd: ");
		t1.delete(r1);
		System.out.println(t1.findAll());
		System.out.println();
		
		//Maak nieuw Reiziger Object aan en voeg het toe aan lijst met methode save();
		System.out.println("Methode Save voegt nieuw reiziger toe aan lijst.");
		Reiziger r4 = new Reiziger("Mirjam", "04-05-1993");
		t1.save(r4);
		System.out.println(t1.findAll());
		
		//Zoek iemand op zijn/haar geboortedatum
		System.out.println();
		System.out.println("Zoek iemand op met geboortedatum: ");
		t1.findByGBdatum("01-02-1995");
		
		System.out.println();
		System.out.println("Wijzig de gegevens van de Reiziger:");
		Reiziger r5 = new Reiziger("Thijs", "01-01-1996");
        	t1.update(0, r5);
        	System.out.print(t1.findAll());
        
		
	}
}