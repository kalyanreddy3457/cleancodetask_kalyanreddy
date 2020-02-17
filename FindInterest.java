import java.util.*;

import java.lang.Math;

import java.io.*;

class InterestRate
{
   

    public float simpleInterest(float rate,float amount,float time) 
   
    {
        
      return amount*rate*time;
    
    }
    
    public double compoundInterest(double rate,double amount,double time,double n)
    
    {
        
     return ((amount*Math.pow((1+(rate/n)),n*time))-amount);
    
    }

}

class FindInterest

{
	
  public static void main (String[] args) throws java.lang.Exception
	
  {
		
    System.out.println("What Type Of Amount Do You Want To Calculate ?        \n1.Simple Interest\n2.Compound Interest");
		
    int t;
		
    Scanner in=new Scanner(System.in);
		
    t=in.nextInt();
		
    InterestRate Obj=new InterestRate();
		
    if(t==1)
		
    {
		    
     System.out.println("Enter the rate and amount values:");

     float rate=in.nextFloat();
		       
     float amount=in.nextFloat();

     rate=rate/100;
     System.out.println("Select the time in\n1.Years\n2.Months");
     int s=in.nextInt();
     int time;
     if(s==1)   		    
     time=in.nextInt();

     else{
     time=in.nextInt();
     time=time/12; 
     } 		   
     float value=Obj.simpleInterest(rate,amount,time);
		             System.out.println("The simple interest for given values="+value);
		    }
		
    else if(t==2)
		
    {
		   
     System.out.println("Enter the rate,amount and n values:");
		       double rate=in.nextDouble();
	   	   
     double amount=in.nextDouble();
     double n=in.nextDouble();

     rate=rate/100;
     System.out.println("Select the time in\n1.Years\n2.Months");
     int s=in.nextInt();
     double time1;
     if(s==1)   		    
     time1=in.nextDouble();

     else{
     time1=in.nextDouble();
     time1=time1/12; 
     } 			   	       		   
     double value=Obj.compoundInterest(rate,amount,time1,n);
		       System.out.println("The compound interest for given values="+value);
	    }
		
	
  }

}
