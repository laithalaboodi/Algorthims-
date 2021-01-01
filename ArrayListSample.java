/*
 * By: Laith Alaboodi
 * */

import java.util.*; 
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSample {
  public static void main(String[] args) {
    //declaring array list 
    ArrayList<Integer> cars = new ArrayList<Integer>();
    //declaring the input object
    Scanner myObj = new Scanner(System.in); 
    int userInput = 0;
    System.err.println("-1 to exit");
    System.out.println("Inseret to ArrayList:" );
    while(true){
      userInput = myObj.nextInt();
      if(userInput == -1 ){
        break;
      }
      cars.add(userInput);
      Collections.sort(cars);
      System.out.println("not in revrse"+cars);
      int sum = 0;
      for(int  i = 0; i < cars.size(); i++){  
      sum += cars.get(i);
      }
      Collections.sort(cars);
      Collections.reverse(cars);
      System.out.println("In reverse"+cars);
      System.err.println("Sum: "+sum);
    }
    System.err.println("You Quit");
  }
}