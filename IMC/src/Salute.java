
public class Salute {
	
	Salute(){
	}
	
	String calcoloIMC(Persona persona) {
		String statoPers = null;
		
		double altM = persona.altezza / 100;
		double risIMC = persona.peso / (altM * altM);
		System.out.println(risIMC);
		System.out.println(altM);
		System.out.println(risIMC);
			if(risIMC < 18.5) {
				statoPers = "sottopeso";
				
			} else {
				if(risIMC >= 18.5 && risIMC < 25) {
					statoPers = "normale";
					
				} else {
					if(risIMC >= 25 && risIMC < 30) {
							statoPers = "sovrappeso";
							
					} else {
						if(risIMC >= 30) {
							statoPers = "obeso";
							
						}
					}
				}
			}
	
		
			System.out.println(statoPers);
			return statoPers;
	}

}
