import java.util.*;
public class hareesh{
public static void main(String[]args){
Scanner attendance= new Scanner(System.in);
System.out.println("enter no.of students");
int n=attendance.nextInt();
for(int i=1;i<=n;i++){
System.out.println("enetr attendance of student"+ i + ":");
int a= attendance.nextInt();
if(a<75)
System.out.println("not eligible");
else
System.out.println("eligible");
}
}
}