package OOPs;

public class objectsAndClassesPractice {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		myCar.SetColor("Black");
		System.out.println(myCar.getColor());

	}

}

class Car{
	
	int model;
	String color;
	
	String SetColor(String color) {
		return this.color= color;
	}
	
	String getColor() {
		return this.color;
	}
	
}
