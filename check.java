import java.io.*;
import java.util.*;
public class check
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
if(n>0)
{
System.out.println("the number is positive");
}
else if(n==0)
{
System.out.println("the number is zero");
}
else
{
System.out.println("the number is negative");
}
}
