import java.io.*;
import java.lang.Math;
import java.util.Scanner;
class Prime{
   public static void main(String[]args)
    {
int flag=0;
 Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=2;i<=Math.ceil(Math.sqrt(n));i++)
{
if(n%i==0)
{
flag=1;
break;
}
}
if(n<=1)
{
System.out.print(n+" is neither prime nor composite");
}
else if(flag==0 || n==2)
{
System.out.print(n+" is a prime");
}
else
{
System.out.print(n+" is not a prime");
}
}
}
