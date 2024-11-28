import java.util.Random;
import java.util.Scanner;
public class rps{
  public static void main(String[] args) {
    Random r=new Random();
    System.out.println("Rock-Paper-Scissor");
    System.out.println("     Rock-1");
    System.out.println("    Paper-2");
    System.out.println("   Scissor-3");
    Scanner sc=new Scanner(System.in);
    int score=0;
    for(int i=0;i<5;i++)
    {
      System.out.println("Enter your choice:");
      int x=sc.nextInt();
      int y=r.nextInt(3)+1;
      if(y==1){
        if(x==1){
             System.out.println("It's a tie.");
        }
        if(x==2){
          System.out.println("You lose");
        }
        if(x==3){
          System.out.println("You win");
          score++;
        }

      }
      if(y==2){
        if(x==1){
          System.out.println("You win");
          score++;
        }
        if(x==2){
          System.out.println("It's a tie.");
        }
        if(x==3){
          System.out.println("You lose");
        }
        
      }
      if(y==3){
        if(x==1){
          System.out.println("You lose");
        }
        if(x==2){
          System.out.println("You win");
          score++;
        }
        if(x==3){
          System.out.println("It's a tie.");
        }
        
      }
    }
    System.out.println("Your Score : "+score+"/"+"5");
    
    
  }
}
