public class RecursionPractice {
    public static void main(String[] args) {
        
        //tester class

        recursionAlgs r = new recursionAlgs();
        r.countDown(5);

    }
}
 class recursionAlgs{

    public void infinite(){
        infinite();
    }

    public void countDown(int n){

        if(n <= 0){
            System.out.println("Hit base case");
            return;
        }
    System.out.println("Stacking up n: " + n);
    countDown(n - 1);

    System.out.println("Unstacking!: " + n);

    }

 }