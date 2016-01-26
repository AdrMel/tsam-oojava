package melillo.adriano.commercialista;


public class Main {

	public static void main(String[] args) {
		Dipendente d = new Dipendente("Gino", "Sbrullino", "ssdg32dgs7781235");
		LiberoProfessionista l = new LiberoProfessionista("Pino", "Pastrucchi", "bsdg32dgs7781235", "20", 6);
		Imprenditore i1 = new Imprenditore("Cirillo", "Testo", "ssdg32dgsvb81235", "20", "Azienda con meno di 100 fatture", 78);
		//Imprenditore i2 = new Imprenditore("Pollo", "Palo", "ssds23dgsvb81235", "21", "Azienda con più di 100 fatture", 104);
		Commercialista c = new Commercialista();
		Cliente[] clienti = new Cliente[] { d, i1, l };
		c.setClienti(clienti);

		System.out.println(c.calcoloIncassoTotale());
	}

}
