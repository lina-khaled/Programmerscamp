/*
Name: Lina Khaled
Number : 93
 */
package lina93task5;

import java.util.Scanner;

/**
 *
 * @author st
 */
public class Lina93Task5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        
        System.out.println("--------------------------------------------");
        System.out.println("               W E L C O M E                ");
        System.out.println("--------------------------------------------\n");
        
        // ask the user about the target and how many numbers he/she wants to enter
        System.out.print("How many numbers do want to enter? ");
        int num = input.nextInt();
        
        System.out.print("What is your target? ");
        int target = input.nextInt();
        
        // fill the array
        int [] array = new int [num];
        System.out.print("Please enter the "+num+" numbers: ");
        for(int i = 0 ; i<array.length;i++){
            array[i]= input.nextInt();
        }
        
        // call the method to check if there is any pait sums to the target and print the result
        checkTheSum(array, target);
        
    }
    public static void checkTheSum(int [] array, int target){
        int count =0;
        boolean flag = true;
        int size =array.length;
        while (flag){
        for(int i=count+1; (i)<size;i++){
            if(array[count]+array[i] == target){
                System.out.println("True! Because the pair ( "+ array[count]+","+array[i]+" )"+" sums to "+ target);
                System.exit(0);
            }
        }
        count++;
        if(count == size -1){
            System.out.println("False! Because there is no pair sums to "+ target);
            break;
        }
        }
      
    }
}
