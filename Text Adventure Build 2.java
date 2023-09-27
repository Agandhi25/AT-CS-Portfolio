//importing Java's scanner for user input
import java.util.Scanner; 
//Importing arrays and io print the map in the intro 
import java.util.Arrays; 
import java.io.*;
//This class holds all of the methods for the program to execute
public class Main {
  public static void main (String[]args) 
    throws IOException
  {
    //this string array is the map layout of the futuristic warehouse
    //In future builds users will go through this using WASD
    String warehouseLayout[][] = {
        {"_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_"},
        {"|", " ", " ", "*", "|", " ", " ", " ", "|", " ", " ", " ", " ", " ", "|", " ", "|", "F", "|"},
        {"|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|", "―", "|", " ", "|", " ", "|", " ", "|"},
        {"|", " ", "|", " ", "|", " ", "|", "*", "|", " ", "|", "*", "|", " ", "|", " ", "|", " ", "|"},
        {"|", " ", "|", " ", "|", " ", "|", "_", "|", " ", "|", " ", "|", " ", " ", " ", "|", " ", "|"},
        {"|", " ", "|", " ", "|", " ", " ", " ", " ", " ", "|", " ", "|", "―", " ", " ", "|", " ", "|"},
        {"|", " ", "|", " ", " ", " ", " ", " ", " ", " ", "|", " ", " ", " ", " ", " ", "|", " ", "|"},
        {"|", " ", "|", "―", "|", " ", "|", " ", " ", "―", "|", "―", "―", "―", " ", " ", "|", " ", "|"},
        {"|", " ", "|", "*", "|", " ", "|", "―", " ", " ", "|", " ", "*", "|", " ", " ", "|", " ", "|"},
        {"|", "O", "|", " ", "|", " ", "|", " ", " ", " ", "|", " ", "―", "―", " ", " ", "|", " ", "|"},
        {"|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|"},
        {"_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "|"},
      };
    //Calling all of the class' methods 
    introANDrules(warehouseLayout);
    firstGameScenario();
    secondGameScenario(); 
    thirdGameScenario(); 
    fourthGameScenario();
    fifthGameScenario();
  }
  //This series of print statements explain to the user the background of the game 
  public static void introANDrules(String warehouseLayout[][]) {
    System.out.println("The year is 2023 and time travel has just been invited\n");
    System.out.println("You've been invited to an exhibition and witness the machine first hand\n"); 
    System.out.println("The scientist presenting the machine wanted you to throw a frisbee into the portal. Instead, you tripped and ended up in a futuristic warehouse in 2077.\n");
    System.out.println("Don't worry. Here's a map to get out and find your way back to 2023.\n");
    //This statement prints the list as a string
    for ( String[] row : warehouseLayout) {
      System.out.println(Arrays.toString(row));
    }
    System.out.println("");
    System.out.println("Here are the rules: \n");
    System.out.println("In future builds, you will go through the maze using WASD\n");
    System.out.println("For now, you will be transported to each checkpoint and the end\n");
    System.out.println("At each checkpoint write 1 or 2 to make your choice for each scenario. A wrong choice will make you lose.\n");
  }
  public static void firstGameScenario() {
    //These 2 print statements give the scenario to the user and they have to pick between the first and second
    System.out.println("Congratulations! You've made it to the first checkpoint\n");
    System.out.println("When you're looking inside the corner for supplies, you see a sleeping guard with a ray gun and a health serum at a safe distance away from him. Do you go for the gun or the serum (1/2): ");
    //these 2 lines of code implements the scanner which reads what the user inputs
    Scanner Main = new Scanner(System.in);
    int choice = Main.nextInt();
    //This if statement prints if the user picks the first choice 
    if (choice == 1) {
      System.out.println("You were able to sneakily acquire the ray gun. This will be useful later.\n");
      System.out.println("When exiting the corner, you think another guard noticed you. Do you take no chances and eliminate him or hope for the best and hide (1/2): \n"); 
      //Since the user picked this choice, another scenario pops up and this line of code lets the user make a second choice
      Scanner notMain = new Scanner(System.in);
      //This if statement prints if the user picks the first option for the second part of the original scenario
      int secondChoice = notMain.nextInt();
      if (secondChoice == 1) {
        System.out.println("Since you were in an enclosed space, other guards heard you and elimnated you. \n");
        System.out.println("YOU LOSE");
      //the program exits since the user chose the incorrect option
        System.exit(0);
      }
      //This else if statement prints if the user chooses second option of second part of the OG scenario
      else if (secondChoice == 2) {
        System.out.println("You were lucky the other didn't see you as you safely made it to the next checkpoint \n"); 
      }
      // The else statement executes if the user makes an invalid input
      else {
        System.out.println("By choosing an invalid option, you took to long to react and were eliminated.\n"); 
        System.out.println("YOU LOSE");
        System.exit(0);
      }
    }
    //This executes if the user chose the second option for the original question
    else if (choice == 2) {
      System.out.println("I see you went for the cowardly option. But this will still be useful");
    }
    //This executes is the user makes an invalid input on the very first question
    else {
      System.out.println("By choosing an invalid choice, you took too long and the guard woke up and eliminated you");
      System.out.println("YOU LOSE");
      System.exit(0);
    }
  }
  //This method holds all of the conditions and print statements for the second scenario/checkpoint
  public static void secondGameScenario() {
    //These print statements introduce the user to the scenario
    System.out.println("Congratulations! You've made it to the second checkpoint. \n");
    System.out.println("You're in an exposed corner of the warehouse. There's a security guard in front of you and to the left of you. \n"); 
    System.out.println("A ray gun would be useful in this situation. A health serum on the other hand, not so much.\n"); 
    //These two lines of code import scanner and depend on the same choice made in the last scenario
    Scanner Main = new Scanner(System.in); 
    int choice = Main.nextInt(); 
    //Based on what the user picked previously (they will have to retype it), these statements and conditions run
    if (choice == 1) {
      System.out.println("Since you chose a ray gun, do you choose to eliminate the guard in front of you or to the left of you (1/2): ");
      int weaponChoice = Main.nextInt(); 
      //The program exits and gives a message if 1st choice was picked
      if (weaponChoice == 1) {
        System.out.println("Trying to go for the guard in front of you exposed you to other guards later in the maze. \n");
        System.out.println("YOU LOSE"); 
        System.exit(0);
      }
      //The else if statement prints if the user chose to the left instead of front
      else if (weaponChoice == 2) {
        System.out.println("You made the right decision. From here, you lured the other security guard and were able to eliminate him. \n");
      }
      //The else statement executes if the usrr makes an invalid input
      else {
        System.out.println("In such a high pressure situation, invalid input led to you getting eliminated. \n");
        System.out.println("YOU LOSE");
        System.exit(0);
      }
    }
    //The else if statement prints if the user chose to take health potion over ray gun
    else if (choice == 2) {
      System.out.println("Since you don't have a weapon, you've been hit by a security guard. \n");
      System.out.println("Do you use your health serum or not (1/2): ");
      int healthChoice = Main.nextInt(); 
      //Regardless of what the user chooses the program automatically exits for explaind reasons
      if (healthChoice == 1) {
        System.out.println("You survived the attack of the first guard but then the second guard struck you. You've been eliminated. YOU LOST\n");
        System.exit(0);
      }
      //This statement executes if the user decides to not use their health serum
      else if (healthChoice == 2) {
        System.out.println("Bad choice. The attack from the first guard eliminated you. \n");
        System.out.println("YOU LOSE"); 
        System.exit(0);
      }
      //This statement executes if the user makes an invalid input
      else {
        System.out.println("Invalid input in such a high pressure situation led you to getting eliminated.");
        System.out.println("YOU LOSE");
        System.exit(0); 
      }
    }
    //This statement ececutes if the user makes an invalid input to the original question of scenario
    else {
      System.out.println("Invalid input in such a high pressure situation led you to getting eliminated.");
      System.out.println("YOU LOSE");
      System.exit(0);
    }
  }
  //This method holds all of the conditions and print statements for the third checkpoint
  public static void thirdGameScenario(){
    //These 3 lines explain to the user what's happening in the third scenario
    System.out.println("Congratulations! You've made it to the third checkpoint\n"); 
    System.out.println("As you were checking this corner for resources, you stumble upon a guard and he takes your holographic map.\n");
    System.out.println("You're going to have to fight him. Will you attack or defend (1/2): \n");
    //These 2 lines import scanner to this method and used to read user input
    Scanner Main = new Scanner(System.in);
    int fightchoice = Main.nextInt();
    //If the user chose option 1, the following prints and the program exits
    if (fightchoice == 1) {
      System.out.println("You tried to whip out your ray gun in time but the guard beat you to it. YOU LOST\n"); 
      System.exit(0);
    }
    //This condition runs if the user picks the second choice
    else if (fightchoice == 2) {
      System.out.println("The security guard immediately whipped out his weapon but his shot ricocheted off a metal wall\n");
      System.out.println("Since you decided to defend, his own shot hit him. Ironic.\n"); 
      System.out.println("When you get your holographic map back, the guard had a health serum and another ray gun. Choose one (1/2): ");
    //Since the user picked this choice there's a second in-built scenario the user has to make the right decision for
      Scanner notMain = new Scanner(System.in);
      int guardchoice = notMain.nextInt();
    //Regardless of what choice the user made, it will affect them in the next checkpoint
      if (guardchoice == 1){
        System.out.println("You have acquired the health serum. We'll see how this turns out\n");
      }
    //Regardless of what choice the user made, it affects them in the next checkpoint
      else if (guardchoice == 2){
        System.out.println("It's always good to have a backup weapon. We'll see how this turns out\n");
      }
    //This executes if the user makes an invalid input. The program exits
      else {
        System.out.println("Invalid input results in a loss. YOU LOSE");
        System.exit(0);
      }
    }
    //This executes if the user makes an invalid input to the first question of scenario. The program exits
    else {
      System.out.println("Due to invalid input, you didn't make a decision in time and the guard eliminated you. ");
      System.out.println("YOU LOSE");
      System.exit(0);
    }
  }
  //This method holds the print statements and conditions for the fourth checkpoint
  public static void fourthGameScenario(){
  //This set of print statements introduces the user to the fourth scenario and makes them make a choice
    System.out.println("Congratulations! You've made it to the fourth checkpoint\n");
    System.out.println("While looking through this corner, you notice a guard deeper in the corner and another approaching\n");
    System.out.println("Once again, you're cornered with a tighter space this time\n");;
    System.out.println("Do you try to go in guns blazing or hide (1/2): ");
  //This line of code initializes scanner in the method
    Scanner Main = new Scanner(System.in);
    int guardchoice = Main.nextInt();
  //If the user picked the first choice, the following prints
    if (guardchoice == 1){
      System.out.println("It somehow worked. However it wasn't that easy, you were hit and a health serum would be helpful right now\n");
      if (guardchoice == 1){
        System.out.println("You applied the health serum and it worked spendidly");
      }
 //If the user picked the second choice, the following prints and the program exits 
      else if (guardchoice == 2) {
        System.out.println("Why would you ever think a second gun was needed?\n");
        System.out.println("Without a health serum, another guard eventually spotted you. YOU LOST");
        System.exit(0);
      }
    //this is executed if the user makes an invalid input. The program is exited 
      else {
        System.out.println("By choosing an invalid option, the guard eliminated you without hesitance.");
        System.out.println("YOU LOSE");
        System.exit(0);
      }
    }
//If the user pickes the second choice, the following prints and the program exits 
    else if (guardchoice == 2){
      System.out.println("Did you think hiding would work again? WRONG!\n");
      System.out.println("You decided to hide behind a cargo box and that fooled no one. YOU LOST");
      System.exit(0);
    }
//This executes if the user makes an invalid user input to the original question. The program exits 
    else {
      System.out.println("By choosing an invalid option, the guard eliminated you without hesitance.");
      System.out.println("YOU LOSE");
      System.exit(0);
    }
  }
//This method holds the print statements and conditions for the fifth checkpoint 
  public static void fifthGameScenario() {
//This set of print statements and user input question set up the user for the fifth scenario
    System.out.println("Congratulations! You've made it to the final checkpoint. Now you just have to make it to the end\n");
    System.out.println("While checking this corner, you see a new gun labeled as the pulse rifle at the end of a laser maze along with a key card to access it.\n");
    System.out.println("Pick a number between 1 and 5 to successfully make it across the maze: ");
//This line of code initializes scanner and allows user input in the method
    Scanner Main = new Scanner(System.in);
    int randomchoice = Main.nextInt();
//If the user picks the right assortment of numbers the following prints
    if (randomchoice >= 1 && randomchoice <=3) {
      System.out.println("You had a 60% chance to make it through the laser maze and you did.\n");
      System.out.println("However, it's not that easy. When you decided to go for the pulse rifle, you forgot to use the keycard\n");
      System.out.println("3 security guards entered. To get rid of them quickly, do you use the pulse rifle or the ray gun (1/2): ");;
      Scanner notMain = new Scanner (System.in);
      int gunchoice = notMain.nextInt();
//ince the user picked the right number, this built-in scenario runs
      if (gunchoice == 1) {
        System.out.println("This new weapon worked out like a charm. Do you take the keycard this time or not (1/2): ");
//This line of code allows the user to respond to the previous statement
        Scanner possiblyMain = new Scanner (System.in);
        int keychoice = possiblyMain.nextInt();
//This if statement runs if the user picks the first choice to the previous question
        if (keychoice == 1) {
          System.out.println("Smart choice. You'll need this to get out of the warehouse");
        }
//this else if statement runs if the user picks the second choice to the previous question
        else if (keychoice == 2) {
          System.out.println("That might've been a bad choice because you'll need it for the end. Oh well, what's done is done. YOU LOST");;
          System.exit(0);
        }
      }
    }
  //this statement runs if the user doesn't pick a number in the correct set of numbers
  //This also works for our else condition 
    else {
      System.out.println("You had a 60% chance and still couldn't make it past the laser maze. YOU LOST");;
      System.exit(0);
    }
  }
  //This method holds 2 print statements displaying that the user reached the end of the game
  public static void TheEnd () {
    System.out.println("Congratulations! You've made it to the end of the game.");
    System.out.println("You were able to find help to get you back to 2023.");
  }
}