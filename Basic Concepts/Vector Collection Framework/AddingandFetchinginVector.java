 

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
        //Fetching values from the Vector using get() method
        String s1=SecondVector.get(1);//fetch the element at index two and position 3
        String s2=SecondVector.get(0);//fetch the element at index 0 and position1
        System.out.println("S1= "+s1+" S2= "+s2);
	}
}
