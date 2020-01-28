import java.io.*;
import java.util.Scanner;
import java.lang.*;
class Palindrome{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int n2=n;
String s=Integer.toString(n);
String s1=new StringBuffer(s).reverse().toString();
int n1=Integer.parseInt(s1);
if(n2==n1)
{
System.out.print(n+"is a Palindrome");
}
else
{
System.out.print(n+"is a not Palindrome");
}
}
}
