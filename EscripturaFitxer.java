import java.io.FileWriter;

public class EscripturaFitxer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] linies = { "En un lugar de la Mancha, de cuyo nombre no quiero acordarme",
			"no ha mucho tiempo que vivía un hidalgo de los de lanza en astillero",
	    		"adarga antigua, rocín flaco y galgo corredor.", 
	    		"Una olla de algo más vaca que carnero, salpicón las más noches",
	    		"duelos y quebrantos los sábados, lantejas los viernes, algún palomino",
	    		"de añadidura los domingos, consumían las tres partes de su hacienda."};
		FileWriter fitxer = null;
		
		try {
			fitxer = new FileWriter("lib/fitxerAEscriure.txt");
			// Escribim les línies al fitxer
			// for (String linea : linies) {
			String linea;  							 // AQUESTA 
 			for (int i = 0; i<linies.length; i++ ) { // AQUESTA 
				linea = linies[i]; 					 // AQUESTA 
				fitxer.write(linea + "\n");
			}
			fitxer.close();
		} catch (Exception ex) {
			System.out.println("Missatge: " + ex.getMessage());
		}
		System.out.println("Final!");
	}
}
