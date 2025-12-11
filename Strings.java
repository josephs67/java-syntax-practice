public class Strings { 
    public static void main(String[] args) {
        
        String nameObj = new String("Didi");

        // 0 1 2 3
        // D i d i

        String name1 = "Didi";
        String name2 = "Gogo";
        String name3 = "Gogo";

        System.out.println("name1 and name2: " + name1 == nameObj);
        System.out.println("name1 and name2: " + name1.equals(nameObj));
        System.out.println("name1.equals(name2): " + name1.equals(name2));
        System.out.println("name12 and name3: " + name2 == name3);


        //compareTo
        System.out.println("Compare: " + name1.compareTo(name2));

        //Helpful Built-in methods
        System.out.println("# of chars in string: " + name1.length());
        System.out.println("Index select: " + name2.indexOf("o"));
        System.out.println("Character select: " + name2.charAt(3));

        String quote = "Talk is cheap, show me the code.";
        String result1 = quote.substring(15);
        System.out.println("Substring 1: " + result1);
        String result2 = quote.substring(5, 13);
        System.out.println("Substring 1: " + result2);



    }

}
