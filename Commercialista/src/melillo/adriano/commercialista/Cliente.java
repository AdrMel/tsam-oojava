package melillo.adriano.commercialista;

public class Cliente {
	
	private String nome;
	private String cognome;
	private String cf;

	public Cliente(String nome, String cognome, String cf) {
		this.nome = nome;
		this.cognome = cognome;
		this.cf = cf;
	}
	
	public Cliente(){
		nome = null;
		cognome = null;
		cf = null;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getCf() {
		return cf;
	}

	public void setCf(String cf) {
		if(cf.length() != 16) {
			return;
		}
		this.cf = cf;
	}
	
	public int calcolaParcella() {
		return 0;
	}
	
	
}
