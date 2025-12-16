import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        
        //Basic Booleans
        System.out.println("Double equals: " + (3 == 2));
        System.out.println("String equivalent: " + "Hello".equals("Helloz"));
        System.out.println("Not equals: " + (7 != 4));
        System.out.println("Greater than: " + (4 >= 5));
       
            int num = 13;
            System.out.println(num <= 12);
            if(num <= 12){
                System.out.println("num is less than or equal to 12");
            } else{
                System.out.println("num is less than or equal to 12");
            }


            //if else
                if(num <= 5){
                System.out.println("num is less than or equal to 5");
            } else{
                System.out.println("num is greater than 5");
            }

            //if... else if... else
                int temperature = 93;
            if(temperature >=85){
                System.out.println("It's hot!");
            }else if(temperature >= 60){
                System.out.println("it's nice!");
            }else if(temperature <= 40){
                System.out.println("It's cold!");
            }else{
                System.out.println("ERROR!");
            }

            // Logical 'and' operator: &&

            int age = 17;
            boolean hasPermit = true;

            if (age >= 17 && hasPermit){
                System.out.println("You can drive");
            }else{
                System.out.println("Can't drive yet");
            }

            // Using 'or' ||

            String day = "Taco";

            if (day.equals("Saturday") || day.equals("Sunday")){
                System.out.println("its the weekend!");
            }else if    (day.equals("Monday") || 
                        day.equals("Tuesday") || 
                        day.equals("Wednesday") || 
                        day.equals("Thurusday") || 
                        day.equals("Friday")){
                System.out.println("It's the weekday");
            }else{
                System.out.println("That is not a day");
            }

            int password = 123456;
            Scanner input = new Scanner(System.in);
            System.out.println("enter password: ");
            int passGuess = input.nextInt();
            if (passGuess == password){
                System.out.println("Access Granted");
            }else{
                System.out.println("Access Denied");
            }

            System.out.println("enter number: ");
            int numIn = input.nextInt();
            if ((numIn % 2) == 0){
                System.out.println("even");
            }else{
                System.out.println("odd");
            }

            System.out.println("what percent: ");
            grade = input.nextInt();
            if(grade >= 90){
                System.out.println("A");
            }else if(grade >= 80){
                System.out.println("B");
            }else if(grade >= 70){
                System.out.println("C");
            }else if(grade >= 64){
                System.out.println("D");
            }else{
                System.out.println("F");
            }

}
