
// Name : Lina Khaled
// Number : 93

package tictactoegame;

import java.util.Scanner;

/**
 *
 * @author st
 */
public class TicTacToeGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
         
        System.out.println("Welcome to 3x3 Tic Tac Toe.");
        String game = "|---|---|---|\n| 1 | 2 | 3 |\n|-----------|\n| 4 | 5 | 6 |\n|-----------|\n| 7 | 8 | 9 |\n|---|---|---|";
        System.out.println(game+"\n");
        
        int count =0;
        char number =' ';
        String afterPlay = game;
        
        while(true){
             
           if(count ==0){
               System.out.println("X will play first. Enter a slot number to place X in:");
               number = input.next().charAt(0);
               afterPlay = game.replace(number, 'X');
               System.out.println(afterPlay);
           }
           else if( count %2==0){
               System.out.println("x's turn; enter a slot number to place x in:");
               number = input.next().charAt(0);
               afterPlay = afterPlay.replace(number, 'X');
               System.out.println(afterPlay);
           }
           
           else {
               System.out.println("0's turn; enter a slot number to place 0 in:");
               number = input.next().charAt(0);
               afterPlay = afterPlay.replace(number, '0');
               System.out.println(afterPlay);
           }
           if(((afterPlay.charAt(game.indexOf("1"))=='X')&&(afterPlay.charAt(game.indexOf("2"))=='X'&&afterPlay.charAt(game.indexOf("3"))=='X'))||
                   ((afterPlay.charAt(game.indexOf("4"))=='X'&&afterPlay.charAt(game.indexOf("5"))=='X'&&afterPlay.charAt(game.indexOf("6"))=='X'))||
           (afterPlay.charAt(game.indexOf("7"))=='X'&&afterPlay.charAt(game.indexOf("8"))=='X'&&afterPlay.charAt(game.indexOf("9"))=='X')||
                   ((afterPlay.charAt(game.indexOf("1"))=='X'&&afterPlay.charAt(game.indexOf("4"))=='X'&&afterPlay.charAt(game.indexOf("7"))=='X'))||
           (afterPlay.charAt(game.indexOf("2"))=='X'&&afterPlay.charAt(game.indexOf("5"))=='X'&&afterPlay.charAt(game.indexOf("8"))=='X')||
                   ((afterPlay.charAt(game.indexOf("3"))=='X')&&(afterPlay.charAt(game.indexOf("6"))=='X'&&afterPlay.charAt(game.indexOf("9"))=='X'))||
                   ((afterPlay.charAt(game.indexOf("1"))=='X'&&afterPlay.charAt(game.indexOf("5"))=='X'&&afterPlay.charAt(game.indexOf("9"))=='X'))||
           (afterPlay.charAt(game.indexOf("3"))=='X'&&afterPlay.charAt(game.indexOf("5"))=='X'&&afterPlay.charAt(game.indexOf("7"))=='X')){
                  
                   System.out.println("Congratulations! X's have won! Thanks for playing.");
                   break;
        }
                  else if(((afterPlay.charAt(game.indexOf("1"))=='0')&&(afterPlay.charAt(game.indexOf("2"))=='0'&&afterPlay.charAt(game.indexOf("3"))=='0'))||
                   ((afterPlay.charAt(game.indexOf("4"))=='0'&&afterPlay.charAt(game.indexOf("5"))=='0'&&afterPlay.charAt(game.indexOf("6"))=='0'))||
           (afterPlay.charAt(game.indexOf("7"))=='0'&&afterPlay.charAt(game.indexOf("8"))=='0'&&afterPlay.charAt(game.indexOf("9"))=='0')||
                   ((afterPlay.charAt(game.indexOf("1"))=='0'&&afterPlay.charAt(game.indexOf("4"))=='0'&&afterPlay.charAt(game.indexOf("7"))=='0'))||
           (afterPlay.charAt(game.indexOf("2"))=='0'&&afterPlay.charAt(game.indexOf("5"))=='0'&&afterPlay.charAt(game.indexOf("8"))=='0')||
                   ((afterPlay.charAt(game.indexOf("3"))=='0')&&(afterPlay.charAt(game.indexOf("6"))=='0'&&afterPlay.charAt(game.indexOf("9"))=='0'))||
                   ((afterPlay.charAt(game.indexOf("1"))=='0'&&afterPlay.charAt(game.indexOf("5"))=='0'&&afterPlay.charAt(game.indexOf("9"))=='0'))||
           (afterPlay.charAt(game.indexOf("3"))=='0'&&afterPlay.charAt(game.indexOf("5"))=='0'&&afterPlay.charAt(game.indexOf("7"))=='0')){
                   
                   System.out.println("Congratulations! 0's have won! Thanks for playing.");
                   break;
                  }
          
            count++;   
        }
        
        }           
    }
    
