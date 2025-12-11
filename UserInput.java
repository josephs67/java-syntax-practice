import java.util.Scanner;

public class UserInput {  
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);

    System.out.print("Enter your name:");
    String name = input.nextLine();
    System.out.println(name);

    System.out.print("Enter your age:");
    String age = input.nextLine();
    
    int ageConverted = Integer.parseInt(age);
    System.out.println("Next year " + name + " will be: " + (ageConverted + 1));

    System.out.println("What is your height in meters?");
    double height = Double.parseDouble(input.nextLine());
    System.out.println("You are: " + height + " meters tall");

    System.out.println("What is the first word?");
    String wrd1 = input.nextLine();
    System.out.println("What is the second word?");
    String wrd2 = input.nextLine();

    System.out.println("What is the first number?");
    int num1 = input.nextInt();
    System.out.println("What is the second number?");
    int num2 = input.nextInt();

    int numSum = 0;
    if (num1 + num2 < 100){
        numSum =  num1 + num2;
        System.out.println(wrd1 + wrd2 + numSum + "@gmail.com");
    }
    else{
        System.out.println("invalid numbers");
    }

    System.out.println("What is the first double?");
    double dub1 = Double.parseDouble(input.next());
    System.out.println("What is the second double?");
    double dub2 = Double.parseDouble(input.next());
    double dubbaWubba = dub1 / dub2;
    System.out.println("First number divided by second number is: " + dubbaWubba);

    System.out.println("What is the diameter of the circle: ");
    double diameter = input.nextDouble();
    double area = Math.pow((diameter / 2), 2) * Math.Pi;
    System.out.println("Diameter is: " + area);

    
    }
}

