import java.util.Scanner;

public class Strings1 {

  public static String letterGradeToNumber(String s){
    String x = null;
    switch (s) {
        case "A":
        x = "" + 4;
        System.out.println(4);
        break;
        case "B":
        x = "" + 3;
        System.out.println(3);
        break;
        case "C":
        x = "" + 2;
        System.out.println(2);
        break;
        case "D":
        x = "" + 1;
        System.out.println(1);
        break;
        case "F":
        x = "" + 0;
        System.out.println(0);
        break;
        case "a":
        x = "" + 4;
        System.out.println(4);
        break;
        case "b":
        x = "" + 3;
        System.out.println(3);
        break;
        case "c":
        x = "" + 2;
        System.out.println(2);
        break;
        case "d":
        System.out.println(1);
        break;
        case "f":
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
