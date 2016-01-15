
public class Salute {
	
	Salute(){
	}
	
	double calcolaBMR(Persona persona) {
		double valMB = 0;
		
			if(persona.sex == 'f'){
				valMB = 655 + (9.6 * persona.peso) + (1.8 * persona.altezza) - (4.7 * persona.age);
			} else {
				valMB = 655 + (13.8 * persona.peso) + (1.8 * persona.altezza) - (4.7 * persona.age);
			}
			
		
			switch(persona.attivFis) {
				case "sedentario":
					valMB += (valMB / 100) * 20;
					break;
				case "moderatamente attivo":
					valMB += (valMB / 100) * 30;
					break;
				case "attivo":
					valMB += (valMB / 100) * 40;
					break;
				case "molto attivo":
					valMB += (valMB / 100) * 50;
					break;
			} 
		
		return valMB;
	}

}
