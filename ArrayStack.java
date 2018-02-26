
package javaapplication1;


public class ArrayStack {
    int size;
    int[] array;
    int top;
    int min;
    public ArrayStack(int s){
        size=s;
        array= new int [size];
        top=-1;
      
    }
    public int getMin () {
        return min;
    }
    public int peek(){
        return array[size-1];
    }
    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return (top==-1);
    } 
     public boolean isFull () {
        return size==top;
    }
    public void push (int a){
        int i =++top;
        array[i] = a;
    }
    public int pop(){
    if (isEmpty()){
        System.out.println("Stack is empty");
        return 0;
        
    }
    else{
        return array[top--];
    }
    
}
}
