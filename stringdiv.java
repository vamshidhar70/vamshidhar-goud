import java.util.*;
class A
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=new String();
int k=0,l=0,count=0;
s=sc.nextLine();
String str=s;
//System.out.println("str:"+str);
StringBuilder sb=new StringBuilder(s);
int n=sc.nextInt();
for(int i=0;i<sb.length();i++)
{
sb.deleteCharAt(i);
k=Integer.parseInt(sb.toString());
if(k%n==0){
System.out.println(k+"%"+n);
count++;
sb.setLength(0);
sb.append(str);

}
}
sb.setLength(0);
sb.append(str.charAt(0));
k=Integer.parseInt(sb.toString());
System.out.println("k:"+k);
if(count!=0)
System.out.println("count:"+count);
else{ if(k%n==0)
System.out.println(++count);
else
System.out.println("-1");
}
}
}