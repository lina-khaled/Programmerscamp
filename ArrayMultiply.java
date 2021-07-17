
// Name : Lina Khaled
// Number : 93

package arraymultiply;

import java.util.Scanner;

/**
 *
 * @author st
 */
public class ArrayMultiply {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number and the length: ");
        int num = input.nextInt();
        int length = input.nextInt();
        int [] numbers = ArrayOfMultiplies(num,length);
        for( int i =0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        
        
        
    }
    public static int [] ArrayOfMultiplies(int num, int length){
        int [] numbers = new int [length];
        int count =0;
        for(int i=0;i<length;i++){
            while(true){
                count++;
                if(count%7==0){
                    numbers[i]=count;
                    break;
                }
            }
            
        }
        return numbers;
    }
}
