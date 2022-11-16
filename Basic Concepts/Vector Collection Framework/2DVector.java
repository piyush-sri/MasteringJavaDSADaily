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
    
    Vector<Vector<Integer>> NestedVector= new Vector<Vector<Integer>>();
    for(int i=0; i<5;i++){
      NestedVector.add(new Vector<Integer>());
    }
    NestedVector.get(1).add(11);
    NestedVector.get(2).add(12);
    NestedVector.get(3).add(13);
    NestedVector.get(4).add(14);
    NestedVector.get(2).add(22);
    for(int j=0;j<5;j++){
        System.out.println("Each Nested Vector List");
        System.out.println(NestedVector.get(j));
        for(int k=0;k<NestedVector.get(j).size();k++){
            System.out.println("Elements inside the vector list: ");
            System.out.println(NestedVector.get(j).get(k));
        }
    }
	 
	}
}

/*
Each Nested Vector List
[]
Each Nested Vector List
[11]
Elements inside the vector list: 
11
Each Nested Vector List
[12, 22]
Elements inside the vector list: 
12
Elements inside the vector list: 
22
Each Nested Vector List
[13]
Elements inside the vector list: 
13
Each Nested Vector List
[14]
Elements inside the vector list: 
14

*/
