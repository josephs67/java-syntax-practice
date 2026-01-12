import java.util.Arrays;
public class Inclass {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 2, 7, 15, 3, 5, 9, 89, 54, 23, 8, 67, 19, 10, 6, 7, 4, 1};
        Arrays.sort(numbers);
        if ((numbers.length % 2) == 1){
            System.out.println("median is: " + numbers[numbers.length / 2 + 1]);
        }
        else{
            System.out.println("median is: " + numbers[numbers.length / 2]);
        }
            
        }
    }