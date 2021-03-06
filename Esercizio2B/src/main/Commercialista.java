package main;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Gestisce le parcelle dei propri Clienti.
 *
 */
public class Commercialista {
	
	public ArrayList<Cliente> clienti = new ArrayList<>();
	public HashMap<String, Integer> parc = new HashMap<>();
	
	public Commercialista() {
		clienti = null;
		parc = null;
	}
	
	public Commercialista(ArrayList<Cliente> clienti, HashMap<String, Integer> parc) {
		this.clienti = clienti;
		this.parc = parc;
		
	}

	/**
	 * Calcola il totale delle parcelle di tutti i clienti univoci (ovvero NON
	 * vengono considerati le parcelle di eventuali clienti duplicati). 
	 * @return il totale delle parcelle
	 */
	public int totaleParcelle() {
		// TODO: da implementare
		int tot = 0;
			
		for(Cliente c: clienti) {
			tot += c.calcolaParcella();
		}
		return tot;
	}
	
	/**
	 * Inserisce un nuovo cliente, verificando che
	 * non sia già stato inserito.
	 * @param d dipendente
	 */
	public void addCliente(Cliente d) {
		// TODO: da implementare
		
		
	}
	
	
	/**
	 * Restituisce il numero di volte che all'atto dell'inserimento di
	 * un cliente, il cliente era già stato inserito. 
	 * @return
	 */
	public int clientiDuplicati() {
		// TODO: da implementare
		Integer cont = 0;
		
		for(Cliente c: clienti) {
			if(parc.containsKey(c.getCF())) {
				parc.put(c.getCF(), cont + 1);
			} else {
				parc.put(c.getCF(), 1);
			}
			
			return cont;
		}
	}
	
	/**
	 * Dato un cliente, restituisce il numero di volte che lo stesso
	 * cliente è stato inserito tramite le funzione addCliente.
	 * Nel caso che un dato cliente sia stato inserito una sola volta,
	 * restituisce il valore 1. 
	 * @param d cliente da verificare
	 * @return numero di ripetizioni.
	 */
	public int numeroRipetizioni(Cliente d) {
		// TODO: da implementare
	}

}
