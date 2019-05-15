package week1.Les1.P1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReizigerOracleDaoImpl implements ReizigerDao {
	public ArrayList<Reiziger> alleReizigers;
	
	public ReizigerOracleDaoImpl() {
		alleReizigers = new ArrayList<>();
	}

	@Override
	public List<Reiziger> findAll() {
		return Collections.unmodifiableList(alleReizigers);
	}
	
	@Override
	public List<Reiziger> findByGBdatum(String GBdatum) {
		
		List<Reiziger> resultaat = new ArrayList<>();
		
		for (Reiziger reiziger : this.alleReizigers) {
			if (reiziger.getGBdatum().equals(GBdatum)) {
				resultaat.add(reiziger);
				System.out.println("Reiziger met deze geboortedatum: ");
			} 
		}
		
		for (Reiziger reiziger : resultaat) {
			System.out.println(reiziger);
		}
		
		return resultaat;
		
	}

	@Override
	public Reiziger save(Reiziger reiziger) {
		if (reiziger == null) 
			throw new IllegalArgumentException("Reiziger mag niet null zijn!");
		
		if (!alleReizigers.contains(reiziger)) {
			alleReizigers.add(reiziger);
		}
		return null;
	}

	@Override
	public Reiziger update(int i, Reiziger reiziger) {

        if (reiziger == null)
            throw new IllegalArgumentException("Reiziger mag niet null zijn!");

        alleReizigers.set(i, reiziger);
        return reiziger;
    }

	@Override
	public boolean delete(Reiziger reiziger) {
		boolean Resultaat = false;
		if (reiziger == null)
			throw new IllegalArgumentException("Reiziger mag niet null zijn!");
		
		if (alleReizigers.contains(reiziger)) {
			alleReizigers.remove(reiziger);
			Resultaat = true;
		}
		
		System.out.println("Verwijderen van reiziger is succesvol gelukt: " + Resultaat);
		return Resultaat;
	}
	
	

}
