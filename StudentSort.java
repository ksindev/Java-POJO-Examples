import java.util.*;

public class StudentSort {

	public static void main(String[] args) {
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		studentList.add(new Student("Alex", "XI-B", 172));
		studentList.add(new Student("Bob", "XI-A", 176));
		studentList.add(new Student("Catherine", "XII-A", 161));
		studentList.add(new Student("Dolly", "XII-A", 163));
		
		Collections.sort(studentList, new HeightComparator());
        
		System.out.println("List of students sorted based on their height\n");
		System.out.println(" Name       Class  Salary   ");
        
        for (Student stud: studentList) {
        	System.out.println(stud);
        }
	}

}

class Student {
	private String name;
	private String division;
    private int height;
    
    public Student(String name, String division, int height) {
    	this.name = name;
    	this.division = division;
    	this.height = height;
    }
    
    public int getHeight() {
    	return height;
    }
    
    public String getDivision() {
    	return division;
    }
    
    public String getName() {
    	return name;
    }
    
    public String toString() {
    	String result = String.format("%-10s %4s %7d \n", name, division, height);
    	return result;
    }
       
}

class HeightComparator implements Comparator<Student> {
	public int compare(Student a, Student b) {
		int result = 0;
		if (a.getHeight() > b.getHeight()) {
			result = 1;
		} else if (a.getHeight() < b.getHeight()) {
			result = -1;
		}
		return result;
	}
}


