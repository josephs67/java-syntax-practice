public class Loops {
    
    public static void main(String[] args) {
        

        // break
        //continue
        //return
        for (int i = 0; i < 5; i += 1) {
            for (int j = 0; j < 5; j ++){
            System.out.println(j);
            if (j == 2){
                System.out.println(j);
            }
            }
            
        }
        System.out.println("/n");




        int i = 0;
        while (i < 5){

            System.out.println(i);

            i++;

        }

        boolean isContinuing = true;
        int z = 0;
        while(isContinuing){
            z++;
            if ( z == 20){
                isContinuing = false;
            }
            System.out.println(z);

        }


        //Foobar
        //1 to 100
        //i % 3 foo,
        //if i is divisible by 5 bar
        // if divisible by 3 and 5 print foobar

        for (int k = 0; k < 101; k++){

            if (k % 3 == 0){
                System.out.println("foo");
            }
            if (k % 5 == 0){
                System.out.println("bar");
            }
            if ((k % 5 == 0) && (k % 3 == 0)){
                System.out.println("foobar");
            }

        }

    }

}
