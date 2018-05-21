import java.util.*;

public class JavaSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Plumber> plumberList = new ArrayList<Plumber>();
		plumberList.add(new Plumber(30, 8000, "Damodaran"));
		plumberList.add(new Plumber(35, 12000, "Vijayan"));
		plumberList.add(new Plumber(18, 6000, "Sahodaran"));
		plumberList.add(new Plumber(21, 6000, "Prakasan"));
		
		System.out.println(plumberList);
		
        Collections.sort(plumberList, new SalaryComparator());
        
		System.out.println("List of plumbers sorted based on their salary\n");
		System.out.println(" Name        Age  Salary   ");
        
        for (Plumber p: plumberList) {
        	System.out.println(p);
        }
        
        plumberList.add(new Plumber(32, 12000, "Anirudhan"));
        plumberList.add(new Plumber(22, 6000, "Abhilash"));
        
        Collections.sort(plumberList);
        
		System.out.println("List of plumbers sorted based on their Name\n");
		System.out.println(" Name        Age  Salary   ");
        
        for (Plumber p: plumberList) {
        	System.out.println(p);
        }
        
        
        HashMap<String, Integer> fruit = new HashMap<String, Integer>();
        fruit.put("apple", 10);
        fruit.put("orange", 20);
        fruit.put("mango", 10);
        fruit.put("mango", 12);
        for (String hashKey: fruit.keySet()) {
        	System.out.println(hashKey+" => "+fruit.get(hashKey));
        }
        
        LinkedList<String> processes = new LinkedList<String>();
        processes.add("Initiate");
        processes.add("Plan");
        processes.add("Estimate");
        processes.add("Develop");
        processes.add("Test");
        processes.add("Retrospect");
        processes.add("Release");
        
        System.out.println("\n**Iterator**\n");
        
        Collections.sort(processes);
        
        Iterator<String> processesIterator = processes.listIterator();
        while (processesIterator.hasNext()) {
        	System.out.println(processesIterator.next());
        }
        
        String[]  wordArray =  {"Love Yourself"  , "Alive is Awesome" , "Be in present"};
        ArrayList<String> wordList = new ArrayList<String>(Arrays.asList(wordArray));
        System.out.println(wordList);
        
	}

}

class Plumber implements Comparable<Plumber>{
    private int age;
    private int salary;
    private String name;
    
    public Plumber(int age, int salary, String name) {
    	this.age = age;
    	this.salary = salary;
    	this.name = name;
    }
    
    public int compareTo(Plumber p) {
    	return getName().compareTo(p.getName());
    }
    
    public void setAge(int age) {
    	this.age = age;
    }
    
    public int getAge() {
    	return age;
    }

    public void setSalary(int salary) {
    	this.salary = salary;
    }
    
    public int getSalary() {
    	return salary;
    }

    public void setName(String name) {
    	this.name = name;
    }
    
    public String getName() {
    	return name;
    }
    
    public String toString() {
    	String result = String.format("%-10s %4d %7d \n", name, age, salary);
    	return result;
    }
       
}

class SalaryComparator implements Comparator<Plumber> {
	public int compare(Plumber a, Plumber b) {
		int result = 0;
		if (a.getSalary() > b.getSalary()) {
			result = 1;
		} else if (a.getSalary() < b.getSalary()) {
			result = -1;
		}
		return result;
	}
}

class NameComparator implements Comparator<Plumber> {
	public int compare(Plumber a, Plumber b) {
		
		return a.getName().compareTo(b.getName());
	}
}

