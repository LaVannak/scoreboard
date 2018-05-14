/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scoreboard;

/**
 *
 * @author Vannak
 */
import java.util.Scanner;
public class Scoreboard {

    /**
     * @param args the command line arguments
     */
    
//    public static int findWinner(Player[] Score, int Round){
//        int maxIndex=0;
//        int Max =Score[maxIndex].Score[Round];
//        
//        for(int i=1; i<Score.length;i++){
//            if(Score[i].Score[Round]>Max){
//                Max =Score[i].Score[Round];
//                maxIndex=i;
//            }
//        }
//        return maxIndex;
//    }
    public static int findWinner(int[] Score){
        int maxIndex =0;
        int Max = Score[maxIndex];
        for(int i=1; i<Score.length; i++){
            if(Score[i]>Max){
                Max = Score[i];
                maxIndex=i;
            }
        }
        
        return maxIndex;
    }
    
    public static int findChampion(Player[] player){
               int[] winningLst = new int[player.length];
        for(int i=0; i<player.length;i++){
            winningLst[i]=player[i].WiningCount;
        }
        int chamInd = findWinner(winningLst);
        return chamInd;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Create Pleayer
        
        Player Player1 = new Player("JON","M",15,"KOR");
        Player Player2 = new Player("JAM","M",15,"AUS");
        Player Player3 = new Player("KIM","M",15,"CHI");
        
        // Generater List of Pleayers
        
        Player[] playerLst = new Player[3];
        playerLst[0]= Player1;
        playerLst[1]= Player2;
        playerLst[2]= Player3;
        
        //User Input the scope for the each playerL
        int NumOfRound =5;
        Scanner reader = new Scanner(System.in);
        int Round=0;
        while(Round<NumOfRound){
            System.out.println("Round "+(Round+1));
            //Temporary List of Score of each player at each round;
            // Records for finding winner at each round
            int[] tmpScore= new int[playerLst.length];
            for(int i=0;i<playerLst.length;i++){
                System.out.println("Score for: "+playerLst[i].getName()+" @Round"+(Round+1));
                playerLst[i].Score[Round]=reader.nextInt();
                tmpScore[i]=playerLst[i].Score[Round];
            }
            // Find Winder
            //int winInd = findWinner(playerLst, Round);
             int winInd = findWinner(tmpScore);
            System.out.println("The Winner in Round " +(Round+1) +" is "+ playerLst[winInd].getName());
            playerLst[winInd].WiningCount++;
            Round++;
        }
        
        //Display Player to Score Board
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("         Round1      Round2      Round3      Round4      Round5       Win");
        System.out.println("-------------------------------------------------------------------------");
        //Loop to diplay the player
        for(int i=0; i<playerLst.length;i++){
            System.out.print(playerLst[i].getCountry()+"       ");
            //Display the score
            for(int j=0; j<playerLst[i].Score.length;j++){
                System.out.print(playerLst[i].Score[j]+"           ");
            }
            // Display Total Winning Aount of each Player 
            System.out.print( playerLst[i].WiningCount);
            System.out.println();
        }
        System.out.println("-------------------------------------------------------------------------");
        
        // Find Champion of the game.
        
       
        int chamInd = findChampion(playerLst);
        
        System.out.println("The champion of the match is : "+ playerLst[chamInd].getName()+
                " from "+playerLst[chamInd].getCountry());
    }
}
