// program for one two three
import java.io.*;
import java.lang.*;
class d37
{
public static void main(String args[])
{
 try
 {
   int no=Integer.parseInt(args[0]);
   int n=no;
   int rev=0,rem;
   while(no>0)
   {
    rem=no%10;
    rev=rev*10+rem;
    no=no/10;
   }
  String ans="";
  while(rev>0)
  {
   rem=rev%10;
   rev=rev/10;
switch(rem)
   {
    case 0:
            ans=ans+"Zero";
            break;
    case 1:
            ans=ans+"One";
            break;
    case 2:
            ans=ans+"Two";
            break;
    case 3:
              ans=ans+"Three";
            break;
    case 4:
            ans=ans+"Four";
            break;
    case 5:
            ans=ans+"Five";
            break;
    case 6:
            ans=ans+"Six";
            break;
    case 7:
            ans=ans+"Seven";
            break;
    case 8:
            ans=ans+"Eight";
            break;
    case 9:
            ans=ans+"Nine";
            break;
    default:
            ans="";
  }
}
    System.out.println(ans);
}catch(Exception e){
System.out.println("Invalid Number Format");}


}
}








