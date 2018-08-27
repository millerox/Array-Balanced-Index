/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balancedindexoptimized;

import java.util.Scanner;

/**
 *
 * @author Oksana_Miller
 * Program is designed to find a balanced index in the array of integer values.
 * If the sum of elements from the right of an index is equal the sum of elements from the left, the index is balanced.
 * For example, in the array {3,4,1,5,2,0}, element "1" located at index 2, is the Balanced Index. 
 */
public class BalancedIndexOptimized {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Create an Array
        Scanner obScanner = new Scanner(System.in);
        
        System.out.print("Enter the number of array elements: ");
        int nArraySize = obScanner.nextInt();
        
        int[] myArray = new int[nArraySize];
        
        // Populate the array elements
        for (int nIndex = 0; nIndex < nArraySize; ++nIndex)
        {
            System.out.print("Enter the value for element #" + (nIndex + 1) + ": ");
            myArray[nIndex] = obScanner.nextInt();
        }
        
        int nBalancedIndex = 0;     
        int nRightSum=0;
        int nLeftSum=0;
        boolean bBalancedIndexExists = false; 
        //Calculate initial nRightSum
        for(int nIndex = nBalancedIndex+1; nIndex < nArraySize; nIndex++)
        {
            nRightSum += myArray[nIndex];
        } 
        //Check for a Balanced Index
        for(nBalancedIndex=0; nBalancedIndex < nArraySize; nBalancedIndex++)
        {
            if(nBalancedIndex > 0)
            {
                nLeftSum += myArray[nBalancedIndex-1];
                nRightSum -= myArray[nBalancedIndex];
            }
            //Compare the sums
            if(nLeftSum == nRightSum)
            {
                System.out.println("An array element at Index " + nBalancedIndex + " (which equals to " + myArray[nBalancedIndex] +")"+ " is a Balanced Index.");
                bBalancedIndexExists = true;
            }
        } 
        if(!bBalancedIndexExists)
        {
            System.out.println("The given array doesn't have a Balanced Index");  
        }
    }   
}
    

