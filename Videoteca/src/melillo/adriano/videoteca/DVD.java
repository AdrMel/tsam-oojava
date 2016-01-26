package melillo.adriano.videoteca;

public class DVD extends Film {

	public DVD(String titolo, String regista, int annoProd, String attori, int giorni) {
		super(titolo, regista, annoProd, attori, giorni);
	}
	
	public DVD() {
		super();
	}
	
	public int getPreventivo() {
		int tot = 0;
		
		if(giorni > 2) {
			tot = ((giorni - 2) * 200) + 300;
		} else {
			tot = giorni * 150;
		}
		return tot;
	}
}
