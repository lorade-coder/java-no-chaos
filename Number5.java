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
int counter=0;
while (length>=1){
String vowel="a,e,i,o,u";
char alphabet=word.charAt(count);

letter=alphabet+letter;
if (letter==vowel){
counter++;
System.out.println(counter);}
length--;
count++;}
System.out.println(letter);

}
}


