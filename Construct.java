import java.util.Scanner;
class Implement
{
public int size(int area,int type)
{
if(type==1)
return(area*1200); 
else if(type==2)
return(area*1500); 
else if(type==3)
return(area*1800); 
else if(type==4)
return(area*2500);
return 0; 
}
}
class Construct 
{
public static void main(String k[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the type of material do want to use");
System.out.println("1.Standard materials\n2.Above Standard materials\n3.High Standard material\n4.High standard material and fully automated home");
int type=s.nextInt();
System.out.println("Area of the house to be construct");
int area=s.nextInt();
Implement obj=new Implement();
int total=obj.size(area,type);
System.out.println("The total cost to construct the house is= "+total);
}
}