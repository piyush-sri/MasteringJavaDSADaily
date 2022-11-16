/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 
    //	Creating a vector instance which is type safe
    // This can contain only String elements.
    //If any other type of element is added, it will result in compile //time error.
    Vector<String> SecondVector= new Vector<String>();
		//to add something in your vector use add()  Method
        SecondVector.add("Mr.");
        SecondVector.add("Piyush");
        SecondVector.add("Learning");
        SecondVector.add("Vector");
        System.out.println("The Vector is = "+ SecondVector);
        SecondVector.add(2,"Inserted");//add piyush at index 2 in the vector
        System.out.println("The Vector is = "+ SecondVector);
        //Checking wheather a value is present in Vector or not using contains() method returns boolean value
        System.out.println(SecondVector.contains("Piyush"));
        //checking wheather my vector is empty or not using isEmpty() method
        System.out.println(SecondVector.isEmpty());
        //removing a element from the vector using remove() method
        SecondVector.remove(2);//remove element present at index 2
        System.out.println("Updated Vector is: "+SecondVector);
        //removing all the element present in the vector using clear() method
        SecondVector.clear();
        System.out.println("Empty vector: "+SecondVector);
        System.out.println("Vector is Empty: "+SecondVector.isEmpty());
        
	}
}


/*
Output:
The Vector is = [Mr., Piyush, Learning, Vector]
The Vector is = [Mr., Piyush, Inserted, Learning, Vector]
true
false
Updated Vector is: [Mr., Piyush, Learning, Vector]
Empty vector: []
Vector is Empty: true

*/
