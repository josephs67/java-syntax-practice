public class SortingClass{

    public static void swapNums(int[] ints, int j, int k) {
        int temp = ints[j];
        ints[j] = ints[k];
        ints[k] = temp;
    }

    public static void main(String[] args) {

        int[] ints = {47, 12, 83, 29, 61};
        int times = ints.length - 1;

        while(times > 0){
            for (int i = 0; i < ints.length - 1; i++){
                if (ints[i] > ints[i+1]){
                    swapNums(ints, i, i+1);

                }
            }
            times = times - 1;
        }
        System.out.println("Sorted: ");
        for (int l = 0; l < ints.length; l++){
            System.out.print(ints[l] + " ");
        }
    }
}
