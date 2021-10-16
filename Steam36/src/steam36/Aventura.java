package steam36;

import java.util.*;

public class Aventura {
	
	
	private ArrayList <Game> lista = new ArrayList <>();
	
	public Aventura () {	
		this.lista.add(new Game("Mario", 1, 300));
		this.lista.add(new Game("Crash", 1, 179.90));
	}

	public ArrayList<Game> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Game> lista) {
		this.lista = lista;
	}
}
	
