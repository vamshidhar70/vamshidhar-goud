import java.util.*;
class A
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int s=0,d=0,count=0;
int x=sc.nextInt();
int p=sc.nextInt();
while(x>0)
{
s=100-p;
d=(s*x)/100;
count++;
x=s;

}
System.out.println("to get free ,no of times requried is:"+count);
}
