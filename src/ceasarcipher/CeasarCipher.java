
// Name : Lina Khaled
// Number : 93

package ceasarcipher;

import java.util.Scanner;

/**
 *
 * @author st
 */
public class CeasarCipher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // -------------------------------------------
     //  Welcome to Java Programming Camp!
     // -------------------------------------------
     
        Scanner input = new Scanner(System.in);
    char [] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int keyOfShifting = 5;
        System.out.print("Enter your message: ");
        String beforeCipher = input.nextLine();
        char space = ' ';
        String afterCipher="";
        for(int i =0 ; i< beforeCipher.length(); i++){
        
        int index = findIndex(beforeCipher.charAt(i),alphabet);
            switch (index) {
                case -2:
                    // the letter doesn't exist (for ex: $ # % ...)
                    System.out.println("Sorry the letter in index "+i+" not found");
                    System.exit(0);
                case -1:
                    // the letter is empty space
                    space = ' ';
                    break;
                default:
                    // the letter is found
                    
                    // the new letter after shifting
                    int newIndex = index+ keyOfShifting;
                    // check the limits of alphabets
                    if(newIndex >=26){
                        newIndex-= 26;
                        
                        space =  (Character.isLowerCase(beforeCipher.charAt(i)))? alphabet[newIndex] : Character.toUpperCase(alphabet[newIndex]);
                        
                    }
                    else{
                        
                        space =  (Character.isLowerCase(beforeCipher.charAt(i)))? alphabet[newIndex] : Character.toUpperCase(alphabet[newIndex]);
                    }       break;
            }
        afterCipher+=space ;
}
        // display the result 
        System.out.println("Coded message: " + afterCipher);
    }
    public static int findIndex(char letter,char [] alphabets){
        for(int i =0;i<alphabets.length;i++){
            // if the letter is an English alphabet
            if(Character.toLowerCase(letter) == alphabets[i]){
                return i;
            }
            // if the letter is a space
            else if(letter == ' '){
                return -1;
            }
        }
        // if the letter is a symbol or number
        return -2;
    }
}
