package week1.Les1.P1;

import java.util.List;

public interface ReizigerDao {
	public List<Reiziger> findAll();
	public List<Reiziger> findByGBdatum(String DBdatum);
	public Reiziger save(Reiziger reiziger);
	public Reiziger update(int i, Reiziger reiziger);
	public boolean delete(Reiziger reiziger);
}
