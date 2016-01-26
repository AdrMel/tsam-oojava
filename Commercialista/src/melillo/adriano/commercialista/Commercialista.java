package melillo.adriano.commercialista;

public class Commercialista {

	private Cliente[] clienti;
	
	public Cliente[] getClienti() {
		return clienti;
	}

	public void setClienti(Cliente[] clienti) {
		this.clienti = clienti;
	}
	
	public int calcoloIncassoTotale() {
		
		int tot = 0;
		
		for(Cliente c: clienti) {
			tot += c.calcolaParcella();
		}
		
		return tot;
		
	}
}
