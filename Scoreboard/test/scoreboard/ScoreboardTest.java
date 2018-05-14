/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scoreboard;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Vannak
 */
public class ScoreboardTest {
    
 
    /**
     * Test of findWinner method, of class Scoreboard.
     */
    @Test
    public void testFindWinner() {
        System.out.println("findWinner");
        // Prepare Stage
        int[] Score = new int[]{8,8,9,7,6};
        // Set Expection
        //Index of the Max Number 
        int expResult = 2;        
        // Execute the test ( Compare the expecation and the result)
        int result = Scoreboard.findWinner(Score);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of findChampion method, of class Scoreboard.
     */
    @Test
    public void testFindChampion() {
        
        System.out.println("findChampion");
        // Prepare Stage
        Player Player1 = new Player("JON","M",15,"KOR");
        Player Player2 = new Player("JAM","M",15,"AUS");
        Player Player3 = new Player("KIM","M",15,"CHI");
        
        Player[] players = new Player[3];
        players[0]= Player1;
        players[0].WiningCount =1;
        players[1]= Player2;
        players[1].WiningCount=3;
        players[2]= Player3;
        players[2].WiningCount=1;
        
        //Set Expectation result ( Indext of Chanpion)
        int expResult = 1;
        
        // Execute the test ( Compare the expecation and the result)
        int result= Scoreboard.findChampion(players);
        
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }


    
}
