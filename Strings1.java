import java.util.Scanner;

public class Strings1 {

  public static String letterGradeToNumber(String s){
    String x = null;
    switch (s) {
        case "A", "a":
        x = "" + 4;
        System.out.println(4);
        break;
        case "B", "b":
        x = "" + 3;
        System.out.println(3);
        break;
        case "C", "c":
        x = "" + 2;
        System.out.println(2);
        break;
        case "D", "d":
        System.out.println(1);
        break;
        case "F", "f":
        x = "" + 0;
        System.out.println(0);
        break;
        default:
        System.out.println("invalid input");
    } return x;
    

  }


  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a letter grade:");
    String s = input.nextLine();
    letterGradeToNumber(s);
  }

}
