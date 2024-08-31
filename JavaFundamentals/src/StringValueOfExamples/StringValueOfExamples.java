package StringValueOfExamples;

//The String.valueOf() method in Java is a versatile utility method
//that converts various types of data into their String representation. 
//It's overloaded to handle different data types, including primitives, objects,and arrays.
//Here’s a detailed explanation of what it does:
	
public class StringValueOfExamples {

    public static void main(String[] args) {

        // 1. String.valueOf(char c)
        // Purpose: Converts a single char to a String.
        char ch = 'A';
        String strChar = String.valueOf(ch);
        System.out.println("Char to String: " + strChar);  // Output: "A"

        // 2. String.valueOf(char[] data)
        // Purpose: Converts a char[] (array of characters) to a String.
        char[] dataArray = {'H', 'e', 'l', 'l', 'o'};
        String strCharArray = String.valueOf(dataArray);
        System.out.println("Char array to String: " + strCharArray);  // Output: "Hello"

        // 3. String.valueOf(int i)
        // Purpose: Converts an int to a String.
        int number = 123;
        String strInt = String.valueOf(number);
        System.out.println("Int to String: " + strInt);  // Output: "123"

        // 4. String.valueOf(long l)
        // Purpose: Converts a long to a String.
        long largeNumber = 123456789L;
        String strLong = String.valueOf(largeNumber);
        System.out.println("Long to String: " + strLong);  // Output: "123456789"

        // 5. String.valueOf(float f)
        // Purpose: Converts a float to a String.
        float floatNumber = 12.34f;
        String strFloat = String.valueOf(floatNumber);
        System.out.println("Float to String: " + strFloat);  // Output: "12.34"

        // 6. String.valueOf(double d)
        // Purpose: Converts a double to a String.
        double doubleNumber = 12.3456789;
        String strDouble = String.valueOf(doubleNumber);
        System.out.println("Double to String: " + strDouble);  // Output: "12.3456789"

        // 7. String.valueOf(boolean b)
        // Purpose: Converts a boolean to a String.
        boolean flag = true;
        String strBoolean = String.valueOf(flag);
        System.out.println("Boolean to String: " + strBoolean);  // Output: "true"

        // 8. String.valueOf(Object obj)
        // Purpose: Converts an Object to a String. If the object is null, it returns "null".
        Object obj = new Object();
        String strObject = String.valueOf(obj);
        System.out.println("Object to String: " + strObject);  // Output: "java.lang.Object@<hashcode>"

        Object nullObj = null;
        String strNullObject = String.valueOf(nullObj);
        System.out.println("Null object to String: " + strNullObject);  // Output: "null"

        // 9. String.valueOf(char[] data, int offset, int count)
        // Purpose: Converts a portion of a char[] array to a String.
        char[] dataPortion = {'H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd'};
        String strPortion = String.valueOf(dataPortion, 5, 5);
        System.out.println("Portion of char array to String: " + strPortion);  // Output: "World"
    }
}

