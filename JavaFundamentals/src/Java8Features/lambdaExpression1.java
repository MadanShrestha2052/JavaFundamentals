package Java8Features;



//Lambda expressions allow us to write functional-style code using anonymous methods.
//In Java, lambda expressions can only be used with
//functional interfaces (interfaces with a single abstract method).

@FunctionalInterface
interface Addition{
	int add (int a , int b);
}
public class lambdaExpression1 {

	public static void main(String[] args) {
		Addition addNumbers = ( x , y)->  x+y;
		
		System.out.println("The sum is: " + addNumbers.add(5, 6));
	}

}
