import java.io.*;
import java.lang.*;
import java.util.LinkedList;
class DArrayList1 
{
  public static void main(String clsargs[]) 
  {
    LinkedList ob = new LinkedList();
    ob.add("Apple");
    ob.add("Banana");
    ob.add("Custerddpple");
    ob.add("DragaonFruit");
    System.out.println(ob);
  }
}

/*
import java.io.*;
import java.lang.*;
import java.util.ArrayList;

class DArrayList1 
{
  public static void main(String args[]) 
  {
    ArrayList ob = new ArrayList();
    ob.add("Apple");
    ob.add("Banana");
    ob.add("Custerddpple");
    ob.add("DragaonFruit");
    System.out.println(ob);
  }
}


/*
1]Access an Item= get() method and refer to the index number:ob.get(0);
2]Change an Item=To modify an element,->set() : ob.set(0, "ABC");
3]Remove an Item=To remove an element,->remove()ob.remove(0);
4]To remove all elements =clear() ->ob.clear();
5]ArrayList Size=To find out how many elements ->ob.size();
6]

/*
//for loop

import java.io.*;
import java.lang.*;
import java.util.ArrayList;

class DArrayList1 
{
 public static void main(String args[]) 
 {
 int i;
 ArrayList ob = new ArrayList();
 ob.add("Apple");
 ob.add("Banana");
 ob.add("Custerddpple");
 ob.add("DragaonFruit");
  for (i=0;i<ob.size();i++) 
  {
  System.out.print(ob.get(i));
  }
  
 }
}

/*
// for-each loop:


import java.io.*;
import java.lang.*;
import java.util.ArrayList;

class DArrayList1 
{
 public static void main(String args[]) 
 {
    ArrayList<String> ob = new ArrayList<String>();
    ob.add("Apple");
    ob.add("Banana");
    ob.add("Custerddpple");
    ob.add("DragaonFruit");
    for (String i:ob) 
	{
      System.out.println(i);
    }
	
  }
}



//Create an ArrayList to store numbers (add elements of type Integer):
/*
import java.io.*;
import java.lang.*;
import java.util.ArrayList;

class DArrayList1 
{
  public static void main(String args[]) 
  {
    
    ArrayList<Integer> no = new ArrayList<Integer>();
    no.add(10);
    no.add(15);
    no.add(20);
    no.add(25);
    for(int i:no) {
      System.out.println(i);
    }
	
	
  }
}

/*
//Sort :Collection 

import java.io.*;
import java.lang.*;
import java.util.ArrayList;
import java.util.Collections; 

class DArrayList1 
{
 public static void main(String args[]) 
 {
  ArrayList<String> ob = new ArrayList<String>();
  ob.add("Apple");
  ob.add("Custerddpple");
  ob.add("DragaonFruit");
  ob.add("Banana");
    Collections.sort(ob);  
    for( String i:ob) 
	{
      System.out.println(i);
    }
	
  }
}


/*
import java.io.*;
import java.lang.*;
import java.util.ArrayList;
import java.util.Collections; 

class DArrayList1 
{
  public static void main(String args[]) 
  {
    ArrayList<Integer> no = new ArrayList<Integer>();
    no.add(76);
    no.add(43);
    no.add(43);
    no.add(77);
    no.add(82);
    no.add(25);

    Collections.sort(no);  
    for (int i : no)
		{
      System.out.println(i);
        }
  }
}*/
