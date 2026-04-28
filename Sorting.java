import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        
        int[] swapNumbers = {9, 3};

        SortingAlgorithms swap = new SortingAlgorithms(swapNumbers);

        System.out.println("Before Swap:" + Arrays.toString(swapNumbers));
        swap.swapNumbers();
        System.out.println("After Swap:" + Arrays.toString(swapNumbers));

        int selectionNumbers[] = {9, 3, 1, 5, 10, 2, 8, 7, 6};

        SortingAlgorithms selection = new SortingAlgorithms(selectionNumbers);

        selection.SelectionSort();

        System.out.println("Selecction sort: " + Arrays.toString(selectionNumbers));
    }
}

class SortingAlgorithms{

    //data or attributes
    private int[] list;

    //constructor
    public SortingAlgorithms(int[] newList){
        this.list = newList;
    }

    //behavior

    public void swapNumbers(){
        int temp = list[0];
        list[0] = list[1];
        list[1] = temp;
    }

    public void SelectionSort(){

        int n = list.length;
        System.out.println();

        //out loop
        for(int i = 0; i < n; i++){

            int minIndex = i;
            for(int j = i + 1; j < n; j++){

                if (list[i] < list[j]){

                    minIndex = j;
                    
                }

            }

            int temp = list[i];
            list[i] = list[minIndex];
            list[minIndex] = temp;

        }

    }


}