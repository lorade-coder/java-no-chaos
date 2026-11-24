import java.util.Scanner;
public class Number2 {
public static void main(String []args) { 
Scanner input = new Scanner(System.in);

int sum=0;
int count=1;
int counter=0;

while(counter!=-1){
System.out.println("enter number to calculate average ");
int number=input.nextInt();
 sum+=number;

 double average= (double)sum/count;
 
  System.out.println(average);
   count++;
 System.out.println("enter -1 to quit");
 counter=input.nextInt();}
 }
 }
