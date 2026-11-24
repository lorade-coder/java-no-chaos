import java.util.Scanner;
public class Number1 {
public static void main(String []args) { 
Scanner input = new Scanner(System.in);
System.out.println("enter any 3 digit number");
int number=input.nextInt();
int count=0;
int sum=0;
int compare=number;
while(number>=1){
int separate=number%10;
number/=10;
int square=separate*separate;
sum+=square;
count++;}
if (sum==compare){
System.out.println("sum of digit is equal to number");
}
else{System.out.println("it is not"); }
}

}




