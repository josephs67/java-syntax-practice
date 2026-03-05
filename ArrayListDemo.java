import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.random.*;

public class ArrayListDemo {
    
public static void main(String[] args) {
    
    ArrayList<Integer> list = new ArrayList<Integer>(5);
    System.out.println(list);


    ArrayList<Integer> list2 = new ArrayList<Integer>();
    System.out.println(list);
    System.out.println(list.size());


    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    System.out.println(list);
    System.out.println(list.size());


    list.add(1, 5);
    System.out.println(list);



    System.out.println(list.get(1));

    list.remove(1);
    System.out.println(list);

    list.add(1, 5);
    list.add(2, 5);

    list.remove(Integer.valueOf(5));
    System.out.println(list);


    System.out.println("Contains 5: " + list.contains(5));



    Collections.sort(list);
    System.out.println(list);



    Integer[] arr = list.toArray(new Integer[0]);
    for (int val : arr) {
        System.out.print(val + " ");
    }



    ArrayList<Integer> splitList = new ArrayList<Integer>(list.subList(3, list.size()));
    System.out.println(splitList);
    



    list.clear();
    System.out.println(list);




    ArrayList<Integer> k = new ArrayList<Integer>(10);
public class RandomNumbers {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            numbers.add(rand.nextInt(100));
        }

        System.out.println("original list: " + numbers);

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 != 0) {
                numbers.remove(i);
            }
        }

        System.out.println("after removing odd numbers: " + numbers);
    
}




        Scanner input = new Scanner(System.in);
        ArrayList<String> guests = new ArrayList<String>();

        guests.add("Alice");
        guests.add("Bob");
        guests.add("Charlie");
        guests.add("David");

        while (true) {

            System.out.print("Enter a name (or exit): ");
            String name = input.nextLine();

            if (name.equals("exit")) {
                break;
            }

            if (guests.contains(name)) {
                System.out.println("This person is invited!");
            } else {
                System.out.println("This person is NOT on the guest list.");
            }
        
    }



        ArrayList<String> groceries = new ArrayList<String>();
        groceries.add("milk");
        groceries.add("bread");
        groceries.add("eggs");

        while (true) {

            System.out.print("Enter a food (or exit): ");
            String food = input.nextLine();

            if (food.equalsIgnoreCase("exit")) {
                break;
            }

            int index = groceries.indexOf(food);

            if (index != -1) {
                System.out.println(food + " is at index " + index);
            } else {
                System.out.println("Not Found. Adding to the list.");
                groceries.add(food);
            }
        }

        input.close();
    }
}
}



}

}
