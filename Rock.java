import java.util.Scanner;
import java.util.Locale;

public class Rock {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in).useLocale(Locale.ENGLISH);
    
    System.out.println("Let's play Rock Paper Scissors !");
    System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.");
    System.out.println("Are you ready ? Write 'yes' if you are.");

    String ready = scan.nextLine();

    if (ready.equals("yes")) {
      System.out.println("Great !");
      System.out.println("rock--paper--scissors, shot !");
      String userChoice = scan.nextLine();
      String computerChoice = computerChoice();
      System.out.println(computerChoice);
      play(userChoice, computerChoice);

    } else {
      System.out.println("Darn, some other time...!");
      System.exit(0);
    }

    scan.close();
  }
 
  public static void play(String userChoice, String computerChoice) {
    if(userChoice.equals("rock") && computerChoice.equals("scissors")) {
      System.out.println("You win !");
    } else if(userChoice.equals("rock") && computerChoice.equals("paper"))  {
      System.out.println("You loose !");
    } else if(userChoice.equals("paper") && computerChoice.equals("rock")) {
      System.out.println("You win !");
    } else if(userChoice.equals("paper") && computerChoice.equals("scissors")) {
      System.out.println("You loose !");
    } else if(userChoice.equals("scissors") && computerChoice.equals("paper")) {
      System.out.println("You win !");
    } else if(userChoice.equals("scissors") && computerChoice.equals("rock")) {
      System.out.println("You loose !");
    } else if(userChoice.equals(computerChoice)) {
      System.out.println("No one wins...");
    }
  }

  public static String computerChoice() {
  
    int randomNum = (int)Math.random() * 3;
    System.out.println("random: " + randomNum);
     
    switch(randomNum) {
      case 0: return "rock";
      case 1: return "paper";
      case 2: return "scissors";
      default: return "";
    }
     
  } 


}