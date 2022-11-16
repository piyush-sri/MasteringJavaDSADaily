 import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Iterator;
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
        //Iterating over the vector elements using Iterator
        Iterator<String>it=SecondVector.iterator();
        System.out.println("Vector elements are:= ");
        while(it.hasNext()){
            System.out.println(it.next());
            }
        
	}
}

/*output:
The Vector is = [Mr., Piyush, Learning, Vector]
Vector elements are:= 
Mr.
Piyush
Learning
Vector
*/
