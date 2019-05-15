package week1.Les1.P1;


public class Reiziger {
	private String naam;
	private String gbdatum;
	
	public Reiziger(String nm, String gbdtm) {
		this.naam = nm;
		this.gbdatum = gbdtm;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String getGBdatum() {
		return gbdatum;
	}

	public void setGBdatum(String gbdatum) {
		this.gbdatum = gbdatum;
	}
	
	public String toString() {
		return naam + gbdatum;
	}
	
	

}
