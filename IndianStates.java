import java.util.*;

public class IndianStates {

	public static void main(String[] args) {
		HashMap<String, State> indianStates = new HashMap<String, State>();
		indianStates.put("Karnataka", new State("Karnataka", new String[] {"Bengaluru","Mysuru"} ));
		indianStates.put("Kerala", new State("Kerala", new String[] {"Trivandrum","Trichur", "Calicut", "Kannur"} ));
		indianStates.put("Tamilnadu", new State("Tamilnadu", new String[] {"Chennai","Coimbatore", "Madurai"} ));
		for (String hashKey: indianStates.keySet()) {
        	System.out.println(hashKey+" => ");
        	indianStates.get(hashKey).printCities();
        }
	}

}

class State {
	private String name;
	private HashSet<String> cities;
	
	public State(String name, String[] cityArray) {
		this.name = name;
		this.cities = new HashSet<String>();
		for (String cityName:cityArray) {
			cities.add(cityName);
		}
	}
	
	public void printCities() {		
		System.out.println(cities);
	}
}
