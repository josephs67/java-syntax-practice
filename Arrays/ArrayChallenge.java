import java.util.Random;
public class ArrayChallenge {
    
    public static void main(String[] args) {

        Random rand = new Random();
        
        char board[][] = new char[3][3];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                int randNum = rand.nextInt(2);
                if(randNum == 1){
                    board[i][j] = 'X';

                }else{

                    board[i][j] = 'O';
                }
                
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
            
        }
            if(board[0][0] == board[0][1] && board[0][1] == board[0][2]){
                System.out.println(board[0][0] + " wins");
            }else if(board[1][0] == board[1][1] && board[1][1] == board[1][2]){
                System.out.println(board[1][0] + " wins");
            }else if(board[2][0] == board[2][1] && board[2][1] == board[2][2]){
                System.out.println(board[2][0] + " wins");
            }
            if(board[0][0] == board[1][0] && board[1][0] == board[2][0]){
                System.out.println(board[1][0] + " wins");
            }else if(board[0][1] == board[1][1] && board[1][1] == board[2][1]){
                System.out.println(board[0][1] + " wins");
            }else if(board[0][2] == board[1][2] && board[1][2] == board[2][2]){
                System.out.println(board[0][2] + " wins");
            }


}

}
