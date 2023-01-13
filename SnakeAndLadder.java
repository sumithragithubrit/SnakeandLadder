package com.snakeandladder;
import java.util.Random;

public class SnakeAndLadder {
	static  int initialPosition = 0;
	static final  int ladder=2;
    static final int snake=1;
    static final int noPlay=0;
    static public final int Starting_Position_Of_Player = 0;
    static public final int Ending_Position_Of_Player = 100;
    static int count = 0;
    
    
    static int rollDice(){
    	int dieValue =(int)Math.floor(Math.random()*10)%6+1;
    	count++;
        return dieValue;
    }
	
	public static void main(String[] args) {
		System.out.println("Welcome in snake ladder program");
		Random random = new Random();
		int diceRoll = random.nextInt(7);
		System.out.println("current position "+diceRoll);
		int rollDice=rollDice();
		
       
        int presentPlayerPosition = 0;
        while (presentPlayerPosition < Ending_Position_Of_Player) {
            int currentPosition = 0;
            int checkPosition = (int) (Math.random() * 10) % 3;
            System.out.println(checkPosition);
            
            switch (checkPosition) {
                case snake:
                    currentPosition =  rollDice();
                    if ((presentPlayerPosition-currentPosition)>=0 ) {
                    	presentPlayerPosition -= currentPosition;
                    	System.out.println("player is on snake " +presentPlayerPosition);
                    }
                    break;
                case ladder:
                    currentPosition =  rollDice();
                    if((presentPlayerPosition+currentPosition)<=100 ) {
                    presentPlayerPosition += currentPosition;
                    System.out.println("player is on Ladder " +presentPlayerPosition);
                    }
                    System.out.println("Number of time rollDie  "+count);
                    
                    break;
                default:
                    System.out.println("player is not play ");
                                     }
    

                   }



    
	}
}
