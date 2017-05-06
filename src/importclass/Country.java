package importclass;

public class Country {
	   String name;
	   String population;
	   String[] states;
	   City best_city;
	   Country(String name, String population, String[] states, City best_city) {
		   this.name = name;
		   this.population = population;
		   this.states = states;
		   this.best_city = best_city;
	   }
}

class City {
	String name;
	String population;
	City(String name, String population) {
		this.name = name;
		this.population = population;
	}
}
