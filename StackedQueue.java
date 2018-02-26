
package javaapplication1;


public class StackedQueue implements JavaApplication1.Queue {
    ArrayStack Stack1;
    ArrayStack Stack2;
    int Size;
    int Min;

   public StackedQueue() {
        Stack1 = new ArrayStack(10);
        Stack2 = new ArrayStack(10);
    }

    @Override
    public void enqueue(int a) {
        if(isEmpty()){
            Min=a;
        }
        Stack1.push(a);

        if(Min > a){
            Min=a;
        }
        Size+=1;
    }


    @Override
    public int peek() {
        if (this.isEmpty())
            return 0;

        if (Stack2.isEmpty()) {
            while (!Stack1.isEmpty()) {
                Stack2.push(Stack1.pop());
            }
        }
        return Stack2.peek();
    }

    @Override
    public int dequeue() {
        int x=-1;
        while(!Stack1.isEmpty()){
            Stack2.push(Stack1.pop());
        }
        if(!Stack2.isEmpty()){
            x=(int)Stack2.pop();
        }
        while(!Stack2.isEmpty()){
            Stack1.push(Stack2.pop());
        }
        return x;

    }


    @Override
    public int getSize() {
        return Stack1.getSize()+Stack2.getSize();
    }

    @Override
    public boolean isEmpty(){
        return Size==0;
    }

    @Override
    public boolean isFull() {
        return Stack1.isFull()&&Stack2.isFull();
    }

    public boolean empty() {
        return Stack1.isEmpty() && Stack2.isEmpty();
    }
    public int min(){
        return Stack1.getMin();
    }
    
    
}
