import java.util.Scanner;
import java.util.Random;
public class saikoro {
public static void main(String[] args) {
    Random rand = new Random();
    Scanner scanner = new Scanner(System.in);
    System.out.println("what is your name?");
String name=scanner.next();
System.out.println("Hello, "+name+"!");
System.out.println("Rolling the dice");
int val1=rand.nextInt(6)+1;
System.out.println("Die1:" + val1);
int val2=rand.nextInt(6)+1;
System.out.println("Die2:" + val2);
int goukei=val1+val2;
System.out.println("Total value:" + goukei);
if(goukei>7){
    System.out.println("you won.");
};
if(goukei<=7){
    System.out.println("you lost.");
}
}
}

