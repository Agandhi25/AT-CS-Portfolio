//Scanner was imported for user input
import java.util.Scanner;
class Main {
//The class runs the method ReferenceScriptV2 which holds all of the requirements 
  public static void main(String[] args) {
    ReferenceScriptV2();
    //Unsorted Array
    int[] arr1 = {9,14,3,2,43,11,58,22};    
    System.out.println("Before Insertion Sort");  
    //Spaces out the terms in the array
    for(int i:arr1){    
      System.out.print(i+" ");    
    }    
    System.out.println();    
            
    insertionSort(arr1);//sorting array using insertion sort    
    //Responsible or printing out the sorted algorithm  
    System.out.println("After Insertion Sort");    
    for(int i:arr1){    
      System.out.print(i+" ");
    }
  }
  //This function holds the two kinds of loops and while loop 
  public static void ReferenceScriptV2() {
    //Introduction to the program
    System.out.println("Hello,\n");
    System.out.println("Let's see how long it takes you to get to the end :) \n");
    //Declaring variable states
    int states = 0;
    //Asking the user to name a state
    Scanner scan = new Scanner(System.in);
    System.out.println("Name a US state: \n");
    String input = scan.nextLine();
    //Asking the user to name 4 more states
    while (states < 4) {
      System.out.println("");
      Scanner whilescan = new Scanner(System.in);
      System.out.println("Name another US state: \n");
      String whileinput = scan.nextLine();
      states++;
    }
    //This prints after the task is done 
    System.out.println("Congratulations! You named 5 US States \n");
    System.out.println("(Assuming you followed the instructions) \n");
    //This scanner asks the user to pick a number between 1 and 10
    Scanner number = new Scanner(System.in);
    System.out.println("Next Activity; Pick a number between 1-10: ");
    int numInput = number.nextInt();
    //This condition prints if the user follows instructions
    if (numInput<11 && numInput>0) {
      System.out.println("You listened to my instructions. Good Job.\n");
      int i;
      //This for loop increments by 1 and prints how many ever times the user said
      for (i=0; i<numInput; i++) {
        System.out.println("This prints " + numInput + " times\n");
      }
    }
    //This condition is applied if the user doesn't follow directions
    else {
      System.out.println("I can't believe you didn't listen to my instructions \n"); 
      System.out.println("Jokes on you, you don't get to see how the rest of the program works \n");
      //The program self exits
      System.exit(0);
    }
    //This is my second type of for loop which decrements by 1 five times
    System.out.println("In 5 seconds, you'll be presented with the last objective of this program: the sorting algorithm\n");
    for(int i=5; i<0; i--) {
      System.out.println(i);
    }
    
    
    }
  //Another method created to determine the order of the array given earlier
    public static void insertionSort(int array[]) {
      //prints the number ammount of array
      int n = array.length;
      for (int j=1; j<n;j++) {
        int key = array[j];  
        int i = j-1;  
        while ( (i > -1) && ( array [i] > key ) ) {  
          array [i+1] = array [i];  
          i--;  
      }
      array[i+1] = key;  
    }
  }
}