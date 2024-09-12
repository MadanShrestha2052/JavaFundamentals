package OOPs;

public class ClassesAndObjects {

	public static void main(String[] args) {
		/**
		Objects are entities in the real world and group of these entities are Classes.
		Classes are the blueprint of the object.
		Classes has attributes/properties as well as functions(Behaviour)
		
		All objects are created in heap memory, not in stack memory
		
		Summary
This code effectively demonstrates fundamental OOP concepts in Java:

Classes: Blueprints for creating objects with attributes and behaviors.
Objects: Instances of classes created in heap memory.
Encapsulation: Protecting data by controlling access via public methods.
this Keyword: Refers to the current object instance.
Mutable Objects: Objects whose state (attributes) can be changed after creation.
		
		 * 
		 */
		Pen p1= new Pen(); //Constructor //Created  a pen object with p1 
		p1.setColor("blue");
		System.out.println(p1.color);
		
		p1.setTip(5);
		System.out.println(p1.tip);
		
		p1.color = "Yellow";
		System.out.println(p1.color);
		
		System.out.println(p1.getColor());
		
		//creating bank Account object
		BankAccount myAcc = new BankAccount();
		myAcc.username = "Manu";
		myAcc.setPassword("shree");
		
		
	}
	
	

}

//  this : this keyword is used to refer to the current object
//   Get: to return the value
//   Set: to modify the value

 // whichever objects call the function , it replaces the this.

	class Pen{
		 String color;  //If we change it to private then color will not be accessed directly.
		int tip;
		
		void setColor(String newColor) {
			color= newColor;
		}
		
		void setTip(int newTip) {
			tip = newTip;
		}
		
		String getColor() {
			return this.color;
			
		}
	
}
	

	
	class Student{
		String name;
		int age;
		float percentage;
		
		
		void calcPercentage(int phy, int chem, int math) {
			percentage= (phy+ chem+ math)/3;
		}
		
	}
	
	class BankAccount{
		public String username;
		private String password;
		
		public void setPassword(String pwd) {
			password = pwd;
		}
	}
