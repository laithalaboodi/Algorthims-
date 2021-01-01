/*
 * By: Laith Alaboodi
 * */
import java.util.*; 
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListSample {
  public static void main(String[] args) {
    LinkedList<Integer> cars = new LinkedList<Integer>();
    Scanner myObj = new Scanner(System.in); 
    int userInput = 0;
    while(userInput != -1){
      userInput = myObj.nextInt();
      cars.add(userInput);
      Collections.sort(cars);
      System.out.println("not in revrse"+cars);
      
      Collections.sort(cars);
      Collections.reverse(cars);
      System.out.println("In reverse"+cars);
    }
    System.out.println(cars);
  }
}