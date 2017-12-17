//CS 1301
//Summer 
//Ryan Cipullo
//Dr. North
//Assignment 1
import java.util.Scanner;
public class HelloWorld
{
  public static void main(String args[])
  {
    Scanner s= new Scanner(System.in);
    System.out.print("Please enter your name:k");
    String name= s.nextLine();
    System.out.println("Hello "+ name + "!");
  }
}