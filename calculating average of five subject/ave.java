import java.util.*;
public class ave {

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Welcome to average machine");
    System.out.println("Input 5 subjects mark: ");
    float sum=0;
    float phy=sc.nextInt();
    float mth=sc.nextInt();
    float bio=sc.nextInt();
    float che=sc.nextInt();
    float eng=sc.nextInt();
    sum=phy+mth+bio+che+eng;
    System.out.println("Your avarage mark is : "+sum/5);


  }
}
