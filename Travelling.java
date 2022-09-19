import java.io.*;
import java.lang.*;
class Travelling
{
 public static void main(String ar[])
 {
	 int ch,a,b,t,c,d,bs,km,bill,p;
	 String cp,dp;
	 try
	  {
		  do
		  {
BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));		  
System.out.print("\n\t\t\5 M E N U \5") ;
System.out.print("\n\t--------------------------------------") ;
System.out.print("\n\t 1]Bus ") ;
System.out.print("\n\t 2]Train") ;
System.out.print("\n\t 3]Car") ;
System.out.print("\n\t 4]Aeroplane") ;
System.out.print("\n\t---------------------------------------") ; 
System.out.print("\n\t Enter Ur Choice [1-4]: ") ;
ch=Integer.parseInt(ob.readLine());

switch(ch)
{
case 1:
       System.out.print("\n\tFor Private Bus enter: '1'\n\tFor Government Bus enter: '2'");
	   System.out.print("\n\t Enter Ur Choice [1 or 2]: ") ;
	   b=Integer.parseInt(ob.readLine());
	   if(b==1)
	   {
		System.out.print("\n\t\t\5 Facilities in Private Bus \5") ;
        System.out.print("\n\t--------------------------------------");
        System.out.print("\n\t 1]AC ") ;
        System.out.print("\n\t 2]Sleeper") ;
	    System.out.print("\n\t 3]General") ;
		System.out.print("\n\t Enter Ur Choice [1-3]: ") ;
		bs=Integer.parseInt(ob.readLine());
		if(bs==1)
		{
			System.out.print("\n\t for AC 300rs extra") ;
			System.out.print("\n\t Enter current Place: ") ;
			cp=(ob.readLine());
		    System.out.print("\n\t Enter Destination Place: ") ;
			dp=(ob.readLine());
		    System.out.print("\n\t Enter travelling distance in kilometers: ") ;
			km=Integer.parseInt(ob.readLine());
			System.out.print("\n\t Enter passengers: ") ;
			p=Integer.parseInt(ob.readLine());
		    bill=16*km*p;
			bill=300+bill;
			System.out.print("\n\t--------------------------------------");
			System.out.print("\n\t Your bill amount is: "+bill+" rs") ;
		}if(bs==2)
		{
		    System.out.print("\n\t For sleeper 150rs extra") ;
			System.out.print("\n\t Enter current Place: ") ;
			cp=(ob.readLine());
		    System.out.print("\n\t Enter Destination Place: ") ;
			dp=(ob.readLine());
		    System.out.print("\n\t Enter travelling distance in kilometers: ") ;
			km=Integer.parseInt(ob.readLine());
			System.out.print("\n\t Enter passengers: ") ;
			p=Integer.parseInt(ob.readLine());
		    bill=16*km*p;
			bill=150+bill;
			System.out.print("\n\t--------------------------------------");
			System.out.print("\n\tYour bill amount is: "+bill+" rs") ;
		}if(bs==3)
		{
			System.out.print("\n\t Enter current Place: ") ;
			cp=(ob.readLine());
		    System.out.print("\n\t Enter Destination Place: ") ;
			dp=(ob.readLine());
		    System.out.print("\n\t Enter travelling distance in kilometers: ") ;
			km=Integer.parseInt(ob.readLine());
			System.out.print("\n\t Enter passengers: ") ;
			p=Integer.parseInt(ob.readLine());
		    bill=16*km*p;
			System.out.print("\n\t--------------------------------------");
			System.out.print("\n\tYour bill amount is: "+bill+" rs") ;
		}
	    /*S=
        D=
         k=
pkm=16;
bill=k*pkm;
s.o.p(bill);*/		 
	   }
	   else if(b==2)
	   {
		 
		
			System.out.print("\n\t Enter current Place: ") ;
			cp=(ob.readLine());
		    System.out.print("\n\t Enter Destination Place: ") ;
			dp=(ob.readLine());
		    System.out.print("\n\t Enter travelling distance in kilometers: ") ;
			km=Integer.parseInt(ob.readLine());
			System.out.print("\n\t Enter passengers: ") ;
			p=Integer.parseInt(ob.readLine());
		    bill=12*km*p;
			System.out.print("\n\t--------------------------------------");
			System.out.print("\n\tYour bill amount is: "+bill+" rs") ;
		
	   }
	   else
	   {
		System.out.print("\n\t Wrong choice");   
	   }
       break;	
case 2:
       System.out.print("\n\tFor General Coach enter: '1'\n\tFor Sleeper Class enter: '2'\n\tFor AC Three-Tier Class(3AC) enter: '3'\n\tFor AC Second-Tier Class(2AC) enter: '4'\n\tFor AC First-Tier Class(1AC) enter: '5'");
	   System.out.print("\n\t Enter Ur Choice [1 - 5]: ") ;
	   t=Integer.parseInt(ob.readLine());
	   if(t==1)
	   {
		    System.out.print("\n\tYou have choosen General Coach") ;
			System.out.print("\n\t Enter current Place: ") ;
			cp=(ob.readLine());
		    System.out.print("\n\t Enter Destination Place: ") ;
			dp=(ob.readLine());
		    System.out.print("\n\t Enter travelling distance in kilometers: ") ;
			km=Integer.parseInt(ob.readLine());
			System.out.print("\n\t Enter passengers: ") ;
			p=Integer.parseInt(ob.readLine());
		    bill=5*km*p;
			System.out.print("\n\t--------------------------------------");
			System.out.print("\n\t Your bill amount is: "+bill+" rs") ;
        
	   }
	   else if(t==2)
	   {
		    System.out.print("\n\tYou have choosen sleeper Coach") ;
			System.out.print("\n\t enter current Place: ") ;
			cp=(ob.readLine());
		    System.out.print("\n\t Enter Destination Place: ") ;
			dp=(ob.readLine());
		    System.out.print("\n\t Enter travelling distance in kilometers: ") ;
			km=Integer.parseInt(ob.readLine());
			System.out.print("\n\t Enter passengers: ") ;
			p=Integer.parseInt(ob.readLine());
		    bill=6*km*p;
			bill=50+bill;
			System.out.print("\n\t--------------------------------------");
			System.out.print("\n\t Your bill amount is: "+bill+" rs") ;
	   }
	   else if(t==3)
	   {
		    System.out.print("\n\tYou have choosen AC Three-Tier Class(3AC)") ;
			System.out.print("\n\t Enter current Place: ") ;
			cp=(ob.readLine());
		    System.out.print("\n\t Enter Destination Place: ") ;
			dp=(ob.readLine());
		    System.out.print("\n\t Enter travelling distance in kilometers: ") ;
			km=Integer.parseInt(ob.readLine());
			System.out.print("\n\t Enter passengers: ") ;
			p=Integer.parseInt(ob.readLine());
		    bill=6*km*p;
			bill=300+bill;
			System.out.print("\n\t--------------------------------------");
			System.out.print("\n\t Your bill amount is: "+bill+" rs") ;
	   }
	   else if(t==4)
	   {
		    System.out.print("\n\tYou have choosen AC second-Tier Class(2AC)") ;
			System.out.print("\n\t Enter current Place: ") ;
			cp=(ob.readLine());
		    System.out.print("\n\t Enter Destination Place: ") ;
			dp=(ob.readLine());
		    System.out.print("\n\t Enter travelling distance in kilometers: ") ;
			km=Integer.parseInt(ob.readLine());
			System.out.print("\n\t Enter passengers: ") ;
			p=Integer.parseInt(ob.readLine());
		    bill=6*km*p;
			bill=400+bill;
			System.out.print("\n\t--------------------------------------");
			System.out.print("\n\t Your bill amount is: "+bill+" rs") ;
	   }
	   else if(t==5)
	   {
		    System.out.print("\n\tYou have choosen AC First-Tier Class(1AC)") ;
			System.out.print("\n\t Enter current Place: ") ;
			cp=(ob.readLine());
		    System.out.print("\n\t Enter Destination Place: ") ;
			dp=(ob.readLine());
		    System.out.print("\n\t Enter travelling distance in kilometers: ") ;
			km=Integer.parseInt(ob.readLine());
			System.out.print("\n\t Enter passengers: ") ;
			p=Integer.parseInt(ob.readLine());
		    bill=6*km*p;
			bill=600+bill;
		    System.out.print("\n\t--------------------------------------");
			System.out.print("\n\t Your bill amount is: "+bill+" rs") ;
	   }
	   else
	   {
		System.out.print("\n\t Wrong choice.....") ;
	   }
       
       break;	
case 3:
System.out.print("\n\tFor AC Car enter: '1'\n\tFor Non-AC Car enter: '2'");
System.out.print("\n\t Enter  Ur Choice [1-2]: ") ;
	   c=Integer.parseInt(ob.readLine());
	   if(c==1)
	   {
		System.out.print("\n\tyou have choosen AC Car") ;
		System.out.print("\n\tEnter Travelling distance in km: ") ;
	    km=Integer.parseInt(ob.readLine());
		bill=50*km;
		System.out.print("\n\t--------------------------------------");
	    System.out.print("\n\tyour bill amount is : "+bill+" rs") ;
	   }
	   else if(c==2)
	   {
		System.out.print("\n\tyou have choosen Non-AC Car") ;
		System.out.print("\n\tEnter travelling distance in km: ") ;
	    km=Integer.parseInt(ob.readLine());
		bill=30*km;
		System.out.print("\n\t--------------------------------------");
	    System.out.print("\n\tyour bill amount is : "+bill+" rs") ;		
	   }
	   else
	   {
		System.out.print("\n\t Wrong choice");
      
	   }
	   break;		
case 4:
System.out.print("\n\tFor First Class enter: '1'\n\tFor Ecomomy Class enter: '2'\n\tFor Business Class enter: '3'\n\tFor Basic Economy enter: '4'");
   System.out.print("\n\t Enter Ur Choice [1 - 4]: ") ;
	   a=Integer.parseInt(ob.readLine());
	   if(a==1)
	   {
		    System.out.print("\n\tYou have choosen First class") ;
		    System.out.print("\n\t For First Class: 10000rs per person") ;
			System.out.print("\n\t Enter current Place:") ;
			cp=(ob.readLine());
		    System.out.print("\n\t Enter Destination Place:") ;
			dp=(ob.readLine());
			System.out.print("\n\t Enter passengers:") ;
			p=Integer.parseInt(ob.readLine());
		    bill=10000*p;
			System.out.print("\n\t--------------------------------------");
			System.out.print("\n\t Your bill amount is: "+bill+" rs") ;
        
	   }
	   else if(a==2)
	   {
		    System.out.print("\n\tYou have choosen Economy class") ;
		    System.out.print("\n\t For Economy Class: 4000rs per person") ;
			System.out.print("\n\t Enter current Place:") ;
			cp=(ob.readLine());
		    System.out.print("\n\t Enter Destination Place:") ;
			dp=(ob.readLine());
			System.out.print("\n\t Enter passengers:") ;
			p=Integer.parseInt(ob.readLine());
		    bill=4000*p;
			System.out.print("\n\t--------------------------------------");
			System.out.print("\n\t Your bill amount is: "+bill+" rs") ;
	   }
	   else if(a==3)
	   {
		    System.out.print("\n\tYou have choosen Business class") ;
		    System.out.print("\n\t For Business Class: 8000rs per person") ;
			System.out.print("\n\t Enter current Place:") ;
			cp=(ob.readLine());
		    System.out.print("\n\t Enter Destination Place:") ;
			dp=(ob.readLine());
			System.out.print("\n\t Enter passengers:") ;
			p=Integer.parseInt(ob.readLine());
		    bill=8000*p;
			System.out.print("\n\t--------------------------------------");
			System.out.print("\n\t Your bill amount is: "+bill+" rs") ;
	   }
	   else if(a==4)
	   {
			System.out.print("\n\tYou have choosen Basic Economy class") ;
		    System.out.print("\n\t For Basic Economy Class: 3000rs per person") ;
			System.out.print("\n\t Enter current Place:") ;
			cp=(ob.readLine());
		    System.out.print("\n\t Enter Destination Place:") ;
			dp=(ob.readLine());
			System.out.print("\n\t Enter passengers:") ;
			p=Integer.parseInt(ob.readLine());
		    bill=3000*p;
			System.out.print("\n\t--------------------------------------");
			System.out.print("\n\t Your bill amount is: "+bill+" rs") ;
	   }
	   else
	   {
		System.out.print("\n\t Wrong choice.....") ;
	   }
       
       break;	
	
	default:
	System.out.print("\n\tWrong Choice");
}
System.out.print("\n\tDo u Want To Continue...[y=1/n=0] : ");
d=Integer.parseInt(ob.readLine());
	  }while(d==1);



	 }catch(IOException e){}
 }
}