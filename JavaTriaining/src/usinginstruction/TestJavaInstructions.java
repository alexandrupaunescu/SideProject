/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usinginstruction;

import java.util.LinkedList;

/**
 *
 * @author Dinamo
 */
public class TestJavaInstructions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               // test if instructions
        String intersection = "left";   
        if("Left".equals(intersection)){
            System.out.println("Go left!");
       }
        else{
            System.out.println("Go right!");
                }
        // test switch intructions
        int value = 4;
        int otherValue = 2;
        switch(value+otherValue){ 
            case 3:
                System.out.println("value+otherValue = 3");
                break;
            case 6:
                 System.out.println("value+othervalue = 6");
                break;
            default:
                System.out.println("value+othervalue is not 3 or 6");
             }
        // test do-while intructions
        int counter = 0 ;
        do{
            System.out.println("counter = "+counter);
            counter = counter + 1; //could be wrinten also conter++
        
        }while(counter < 5);
        // test while instructions
        int decreaser = 5;
        while(decreaser > 0){
            System.out.println("decreaser = "+decreaser);
            decreaser = decreaser -1; //in can be whriten also decreaser--
                    }   
           // test four instructions
           for (int numberOfLoops = 0;numberOfLoops<5;numberOfLoops++){
        System.out.println("Loop number: "+numberOfLoops);
     }
           // test for instuctions for collections
               LinkedList<Integer> listOfIntegers = new LinkedList<>();
           // add elements to new created collection -list of Integers   
           listOfIntegers.add(10);
           listOfIntegers.add(-2);
           listOfIntegers.add(4);
         // display all ements of collection
         for(Integer currentElements:listOfIntegers){
         System.out.println("Element value is "+currentElements.intValue());
         }
           
    }
    
}
