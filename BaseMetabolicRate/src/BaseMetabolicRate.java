public class BaseMetabolicRate {

	public static void main(String[] args) {
		
	    Persona maleSed = new Persona(175, 74, 21, "sedentario", 'm');
		Salute maleSedMB = new Salute();
		double valMS = maleSedMB.calcolaBMR(maleSed);
		System.out.println(valMS);
		
		Persona femModAct = new Persona(175, 74, 21, "moderatamente attivo", 'f');
		Salute femModActMB = new Salute();
		double valFMA = femModActMB.calcolaBMR(femModAct);
		System.out.println(valFMA);
		
		Persona maleAct = new Persona(175, 74, 21, "attivo", 'm');
		Salute maleActMB = new Salute();
		double valMA = maleActMB.calcolaBMR(maleAct);
		System.out.println(valMA);
		
		Persona femVerAct = new Persona(175, 74, 21, "molto attivo", 'f');
		Salute femVerActMB = new Salute();
		double valFVA = femVerActMB.calcolaBMR(femVerAct);
		System.out.println(valFVA);
		
		/*System.out.println("-----MASCHI-----");
		Persona Jack = new Persona(180 , 100 , 19 , "sedentario" , 'm');  //int altezza, int peso, int eta, String attivitaFisica, char sesso
		Salute salute = new Salute();
		System.out.println(salute.calcolaBMR(Jack));
		
		Persona Nick = new Persona(180 , 100 , 19 , "moderatamente attivo" , 'm');  //int altezza, int peso, int eta, String attivitaFisica, char sesso
		System.out.println(salute.calcolaBMR(Nick));
		
		Persona Mel = new Persona(180 , 100 , 19 , "attivo" , 'm');  //int altezza, int peso, int eta, String attivitaFisica, char sesso
		System.out.println(salute.calcolaBMR(Mel));
		
		Persona Piero = new Persona(180 , 100 , 19 , "molto attivo" , 'm');  //int altezza, int peso, int eta, String attivitaFisica, char sesso
		System.out.println(salute.calcolaBMR(Piero));
		
		System.out.println("-----DONNE-----");
		Persona Anna = new Persona(180 , 100 , 19 , "sedentario" , 'f');  //int altezza, int peso, int eta, String attivitaFisica, char sesso
		System.out.println(salute.calcolaBMR(Anna));
		
		Persona Giada = new Persona(180 , 100 , 19 , "moderatamente attivo" , 'f');  //int altezza, int peso, int eta, String attivitaFisica, char sesso
		System.out.println(salute.calcolaBMR(Giada));
		
		Persona Carol = new Persona(180 , 100 , 19 , "attivo" , 'f');  //int altezza, int peso, int eta, String attivitaFisica, char sesso
		System.out.println(salute.calcolaBMR(Carol));
		
		Persona Nicole = new Persona(180 , 100 , 19 , "molto attivo" , 'f');  //int altezza, int peso, int eta, String attivitaFisica, char sesso
		System.out.println(salute.calcolaBMR(Nicole));
*/	}

	}


