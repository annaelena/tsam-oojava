
public class Student {
	
	String name;
	String surname;
	int age;
	int[] marks;
	
	//Default constructor
	//necessario perchè ho definito il costruttore con 
	//due parametri che segue;
	
	Student() {
		
	}
	
	Student(String n, String surname) {
		name = n; //univoke
		this.surname = surname;
	}
	
	int marksAverage() {
		float tot = 0;
		for(int x: this.marks){// marks === this.marks
			tot += x;
		}
		float avg = tot / marks.length;
		
		return Math.round(avg);
		
	}

}
