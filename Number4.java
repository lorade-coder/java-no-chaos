import java.util.Scanner;
public class Number4 {
public static void main(String []args) { 
Scanner input = new Scanner(System.in);
System.out.println("enter a word");
String word =input.nextLine();
String letter=" ";
int length= word.length();
System.out.println(length);
int count=0;
while (length>=1){
char alphabet=word.charAt(count);
letter=alphabet+letter;
length--;
count++;}
System.out.println(letter);

}
}


