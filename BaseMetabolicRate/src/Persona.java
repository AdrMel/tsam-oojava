public class Persona {

	int altezza;
	int peso;
	int age;
	String attivFis = ""; //"sedentario", "moderatamente attivo", "attivo", "molto attivo"
	char sex; // 'm', 'f'
	
		Persona() {
		}
		
		Persona(int alt, int peso, int age, String att, char sex) {
			altezza = alt;
			this.peso = peso;
			this.age = age;
			attivFis = att;
			this.sex = sex;
		}
	
}
