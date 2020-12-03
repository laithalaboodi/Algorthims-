/*
 * By: Laith Alaboodi
 * 
 * My routines to get inputs v2 using class 
 * */

import java.util.Scanner;

public class RoutinesClass {
 //--------------------------------------------------------------------------------------------------------------
  //Calling this method in your class will allow you to get integer value with range low - high
 public static int getIntWithinRange(String prompt, int min, int max) {
  Scanner keyboard = new Scanner(System.in);
  System.out.println(prompt);
  String number = keyboard.nextLine();
  
  while(!isInteger(number) || Integer.valueOf(number) < min || Integer.valueOf(number) > max) {
   System.out.println("Sorry, '"+number+"' is not a value between "+min+" and "+max+".");
   System.out.println(prompt);
   number = keyboard.nextLine();
  }
  return Integer.valueOf(number);
 }
 //--------------------------------------------------------------------------------------------------------------
 //Calling this method in your class will alow you to get double values 
 public static double getDouble(String prompt){
   Scanner keyboard = new Scanner(System.in);
   System.out.println(prompt);
   String number = keyboard.nextLine();
   
   while(!isDouble(number)){
     System.out.println("Sorry, '" +number+"' is not a double.");
     System.out.println(prompt);
     number = keyboard.nextLine();    
   }
   return Double.valueOf(number);
 }
 //--------------------------------------------------------------------------------------------------------------
 //validating if integer
 private static boolean isInteger(String testCase) {
  try {Integer.parseInt(testCase); return true;}
  catch(Exception e) {return false;}
 }
 //--------------------------------------------------------------------------------------------------------------
 //validating if doube 
 private static boolean isDouble(String testCase) {
  try {Double.parseDouble(testCase); return true;}
  catch(Exception e) {return false;}
 } 
 //--------------------------------------------------------------------------------------------------------------
}
