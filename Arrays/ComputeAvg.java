package Arrays;
import java.util.Scanner;

public class ComputeAvg{
    public static void main(String[] args) {
    
        double avg = 0.0, total = 0.0;
        Scanner input = new Scanner(System.in);

        double[] inputs = {0, 0, 0, 0, 0 };

        for(int i = 0; i < inputs.length; i++){
            System.out.println("input a number: ");
            inputs[i] = input.nextDouble();
            total = total + inputs[i];
        }
        avg = total / inputs.length;
        System.out.println("the average is: " + avg);

    }
}