/*
import java.io.*;
import java.lang.*;
class StrAll
 {
 public static void main(String args[])
  {
    String s1 = "C Programming";
    String s2 = "CPP(Object Oriented Programming)";
    String s3 = "Java";

    System.out.println(s1);   
    System.out.println(s2);  
    System.out.println(s3);  
  }
}
*/
#Get length of a String
import java.io.*;
import java.lang.*;
class StrAll 
{
  public static void main(String args[])
  {
    String s1="I Am Learning Java";
    System.out.println("String: " +s1);
    int len=s1.length();
    System.out.println("Length: " +len);
  }
}



//Join Two Java Strings-concat
import java.io.*;
import java.lang.*;
class StrAll 
{
public static void main(String args[])
{
String s1="VED";
System.out.println("First String: "+s1);
String s2 ="TIRTH";
System.out.println("Second String:"+s2);
String s3 = s1.concat(s2);
System.out.println("Joined String:"+s3);
  }
}

//Compare two Strings-equals()
import java.io.*;
import java.lang.*;
class StrAll 
{
 public static void main(String args[]) 
 {
String s1 ="VedTirth";
String s2 ="VedTirth";
String s3 ="JAIN";
boolean ans1=s1.equals(s2);
System.out.println("Strings s1 and s2 are equal: "+ans1);

boolean ans2=s1.equals(s3);
System.out.println("Strings s1 and s3 are equal: "+ans2);
  }
}

// create a string using the new keyword
import java.io.*;
import java.lang.*;
class StrAll 
{
 public static void main(String args[]) 
 {
 String nm=new String("VED-TIRTH-JAIN");
 System.out.println(nm); 
  }
}


*/

/*
//String to int
class StrAll
{
   public static void main(String args[])
   {
	String str="908";
	int n1=100;
	int n2=Integer.parseInt(str);
		
	int add=n1+n2;
	System.out.println("Add : "+add);
   }
}


*/
class StrAll
{
   public static void main(String args[])
   {
	String str="-1108";
	int n1=100;
	int n2=Integer.valueOf(str);
	int add=n1+n2;
	System.out.println("Add : "+add);
   }
}



/*
Methods			Description
contains()		checks whether the string contains a substring
substring()		returns the substring of the string
join()			join the given strings using the delimiter
replace()		replaces the specified old character with the specified new character
replaceAll()	replaces all substrings matching the regex pattern
replaceFirst()	replace the s1 matching substring
charAt()		returns the character present in the specified location
getBytes()		converts the string to an array of bytes
indexOf()		returns the position of the specified character in the string
compareTo()		compares two strings in the dictionary order
trim()			removes any leading and trailing whitespaces
format()		returns a formatted string
split()			breaks the string into an array of strings
toLowerCase()	converts the string to lowercase
toUpperCase()	converts the string to uppercase
valueOf()		returns the string representation of the specified argument
toCharArray()	converts the string to a char array
matches()		checks whether the string matches the given regex
startsWith()	checks if the string begins with the given string
endsWith()		checks if the string ends with the given string
isEmpty()		checks whether a string is empty of not
intern() 		returns the canonical representation of the string
contentEquals()	checks whether the string is equal to charSequence
hashCode()		returns a hash code for the string
subSequence()	returns a subsequence from the string
compareToIgnoreCase()	compares two strings ignoring case differences

*/