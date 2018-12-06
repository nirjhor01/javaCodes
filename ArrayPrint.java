import java.util.Scanner;

 public class ArrayPrint {
 public static void main (String [] args) {
   int NUM_VALS = 4;
  int [] grades = new int[NUM_VALS];
  int i = 0;

  grades[0] = 7;
  grades[1] = 9;
  grades[2] = 11;
  grades[3] = 10;

  /* Your solution goes here  */

  for(i=0; i<NUM_VALS; i++){
     System.out.print(grades[i] + " ");
  }
  
    System.out.println("&&");

  for(i=NUM_VALS -1; i>=0; i--){
     System.out.print(grades[i]+ " ");
     }

  return;
}
}
