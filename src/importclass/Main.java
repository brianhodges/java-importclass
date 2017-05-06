package importclass;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) {
		City a1 = new City("Los Angeles", "4 million");
		String[] b1 = {"New York", "Virginia", "California", "Florida", "Hawaii"};
		Country c1 = new Country("USA", "350 million", b1, a1);
		
		City a2 = new City("Cancun", "700,000");
		String[] b2 = {"Durango", "Puebla", "Guerrero", "Quintana Roo"};
		Country c2 = new Country("Mexico", "127 million", b2, a2);
		
		Country[] countries = {c1, c2};

		try (PrintWriter out = new PrintWriter("log.txt")) {
			out.println();
			for (int x = 0; x < countries.length; x++) {
			    out.println("Name: " + countries[x].name);
			    out.println("Population: " + countries[x].population);
			    out.println("Best States: " + String.join(", ", countries[x].states));
			    out.println("Top State Count: " + countries[x].states.length);
			    out.println("Best City: " + countries[x].best_city.name);
			    out.println(countries[x].best_city.name + " Population: " + countries[x].best_city.population);
			    out.println();
			}
		    out.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
