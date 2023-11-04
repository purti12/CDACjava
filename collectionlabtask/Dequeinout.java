//Q5. Write a java program to perform insertion at first and at last position in array Dequeue.
package collectionlabtask;

import java.util.*;
public class Dequeinout {
    public static void main(String[] args) {

        // Create an ArrayDeque
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        // Insert elements at the first and last positions
        arrayDeque.addFirst(1);
        arrayDeque.addLast(2);
        arrayDeque.addFirst(0);
        arrayDeque.addLast(3);

        // Display the elements in the ArrayDeque
        System.out.println("Elements in the ArrayDeque: " + arrayDeque);

        // Perform insertions at the first and last positions again
        arrayDeque.addFirst(-1);
        arrayDeque.addLast(4);

        // Display the modified elements
        System.out.println("Modified elements in the ArrayDeque: " + arrayDeque);
    }
}

    
 

