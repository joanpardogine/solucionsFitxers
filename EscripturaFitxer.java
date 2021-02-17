import java.io.FileWriter;

public class EscripturaFitxer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] linies = { "1a linidasfasfa","2a asdfasdfd",
				"3a linasdfadsfia", "4a linasdfasdfia"};
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