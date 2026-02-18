import java.util.Scanner;

public class GetSetTester {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //create a new object for my GetSet class
        GetSet player1 = new GetSet();
        GetSet player2 = new GetSet();

        System.out.println(player1.getUsername()); //displays default username value of null
        player1.setUsername("pineappleghost333"); //sets (or mutates) username to new value
        System.out.println(player1.getUsername()); //displays new username 

        System.out.println(player2.getUsername()); //displays default username value of null
        player2.setUsername("ironmouse6741"); //sets (or mutates) username to new value
        System.out.println(player2.getUsername()); //displays new username 

        GetSet player3 = new GetSet();
        System.out.print("Enter a username: ");
        String user = input.nextLine();
        player3.setUsername(user);
        System.out.println(player3.getUsername());
       
        System.out.print("Enter a rank: ");
        String userID = input.nextLine();
        player3.setRank(userID);
        System.out.println(player3.getRank());

        if (player3.getRank().equals("noob")) {
            System.out.println("Everyone starts somewhere!");
        } else if (player3.getRank().equals("pro")) {
            System.out.println("Getting better!");
        }else if (player3.getRank().equals("Hacker")) {
            System.out.println("You're among the best now!");
        }else if (player3.getRank().equals("God")) {
            System.out.println("You inspire others with your skill!");
        }else if (player3.getRank().equals("OneNOnly")) {
            System.out.println("You stand above the rest, the pinnacle of them all!");
        }


        GetSet player4 = new GetSet();
        System.out.print("Enter a username: ");
        String userN = input.nextLine();
        player4.setUsername(userN);
        System.out.println(player4.getUsername());
      
        System.out.print("Enter a rank: ");
        String userNRank = input.nextLine();
        player4.setRank(userNRank);
        System.out.println(player4.getRank());
        System.out.print("Enter ID: ");
        String userNID = input.nextLine();
        player4.setRank(userNID);
        System.out.println(player4.getRank());
        
        
    }
}

class GetSet{
    //instance variables; attributes; making the instance 'private' enforces ENCAPSULATION
    private String username = "No user name";

    private String rank = "N/A";

    private String ID = "N/A";

    //accesor methods aka GETTERS:
    public String getUsername(){
        return username;
    }
    
     public String getRank(){
        return rank;
    }

    public String getID(){
        return ID;
    }
    
    //mutator methods aka SETTERS
    public void setUsername(String newUsername){
        this.username = newUsername;
    }

    public void setRank(String newRank){
        this.rank = newRank;
    }

     public void setID(String newID){
        this.ID = newID;
    }

}