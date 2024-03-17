/*PARAMETERS:
*RESULT:  first implement a queue using two stacks. 
*         Then process  queries, where each query is 
          one of the following  types:
            1 x:Enqueue element x into the end of the queue.
            2: Dequeue the element at the front of the queue.
            3: Print the element at the front of the queue.
 */



import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTests = scanner.nextInt();
                
        for (int test = 0; test < numberOfTests; test++) {
            int current = scanner.nextInt();
            if (current == 1) {
                enqueue(scanner.nextInt());
            } else if (current == 2) {
                dequeue();
            } else {
                int peeked = peek();
                System.out.println(peeked);
            }       
        }
        scanner.close();  
    }
    
        static Stack<Integer> enqueueStack = new Stack<>();
        static Stack<Integer> dequeueStack = new Stack<>();
        
        public static void enqueue(int value) {
            enqueueStack.push(value);
        }
        
        private static void refillDequeue() {
            if (dequeueStack.isEmpty()) {
                while(!enqueueStack.isEmpty()) {
                    dequeueStack.push(enqueueStack.pop());
                }
            }
        }
        
        public static int dequeue() {
            refillDequeue();
            return dequeueStack.pop();  
        }
        
        public static int peek() {
            refillDequeue();
            return dequeueStack.peek();
        }
}
