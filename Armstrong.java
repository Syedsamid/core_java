//121 =1*1*1 +2*2*2+1*1*1 =1+8+1=10
//135=1*1*1+3*3*3+5*5*5=1+27+125 =153
//153=1*1*1+3*3*3+5*5*5=1+27+125=153

//Armstrong number
import java.io.*;
import java.lang.*;
class PQR
{
public static void main(String vt[])
{
 int no,d,arm=0,a;
 no=Integer.parseInt(vt[0]);

 d=no;
 while(no>0)
 {
	 a=no%10;
	 arm=arm+(a*a*a);
	 no=no/10;
 }
 System.out.print("\n\t Givien Num 	="+d);
 System.out.print("\n\t Cal Num 	="+arm);
 if(arm==d)
 {
	 System.out.print("\n\t" +arm + " is Armstrong");
 }
 else
 {
System.out.print("\n\t" +arm + " is Not Armstrong");
 }
}
}
 