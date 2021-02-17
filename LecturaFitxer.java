import java.io.File;
import java.util.Scanner;

public class LecturaFitxer {

	public static void main(String[] args) {

		// Fitxer que volem llegir
		File fitxer = new File("lib/fitxer_llegir.txt");
		Scanner s = null;

		try {
			// Llegim el contingut del fitxer
			System.out.println("... llegim el contingut del fitxer ...");
			s = new Scanner(fitxer);

			// Llegim linea a línia fitxer
			while (s.hasNextLine()) {
				String linia = s.nextLine(); 	// Salvem la línia a un String
				System.out.println(linia);      // Mostrem la línia
			}

		} catch (Exception ex) {
			System.out.println("Missatge: " + ex.getMessage());
		} finally {
			// Tamquem el fitxer tant si la lectura ha estat correcta com si no
			try {
				if (s != null)
					s.close();
			} catch (Exception ex2) {
				System.out.println("Missatge 2: " + ex2.getMessage());
			}
		}
	}
}
