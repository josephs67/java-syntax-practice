public class WrapperClassesTester {
    public static void main(String[] args) {
        

        Wrapper
    }

class Wrapper{

    public static void demoInteger() {
        int primitiveInt = 10;
        Integer myInt = 5;

        System.out.println("primitive int: " + primitiveInt);
        System.out.println("Wrapper integer: " + myInt);

        System.out.println("max int val: " + Integer.MAX_VALUE);
        System.out.println("min int val: " + Integer.MIN_VALUE);

    }


        int parsed = Integer.parseInt("25");
        int add = parsed + 5;
        System.out.println("Parsed from String: " + parsed);
        System.out.println("Added from String: " + add);

    }

    public static void demoBooleans() {

        boolean primitiveBool = true;
        Boolean wrapperBool = Boolean.valueOf(true);

        System.out.println("Primitive boolean: " + primitiveBool);
        System.out.println("Wrapper Boolean: " + wrapperBool);

        public static void autoBoxingDemo(){

        Integer num = 5; 

        int value = num;

        System.out.println("Autoboxed Integer: " + num);
        System.out.println("Unboxed int: " + value);

    }
}
