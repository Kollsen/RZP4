
package javaapplication1;


public class JavaApplication1 {

    
    public static void main(String[] args) {
       StackedQueue q = new StackedQueue();

        q.enqueue(2);
        q.enqueue(5);
        q.enqueue(7);
        q.enqueue(10);
        q.enqueue(12);
        System.out.println(q.min());
        q.dequeue();
        q.enqueue(0);
        System.out.println(q.peek());
        System.out.println(q.min());

        
    }

    /**
     *
     */
    public interface Queue {
        void enqueue(int a);
        int peek();
        int dequeue();
        int getSize();
        boolean isEmpty();
        boolean isFull();
}
 public interface Stack {
        void push(int a);
        int peek();
        int pop();
        int getSize();
        boolean isEmpty();
        boolean isFull();
    }
} 