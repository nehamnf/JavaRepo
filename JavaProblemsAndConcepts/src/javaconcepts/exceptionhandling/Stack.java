package javaconcepts.exceptionhandling;

public class Stack {

    private int size;
    private int top=-1;
    private int[] s;

    public Stack(int size){
        this.size=size;
        s= new int[size];
    }
    public void push(int value) throws StackOverFlow {
        if (top == size-1){
            throw new StackOverFlow();
        }
        top++;
        s[top]=value;
    }

    public int pop() throws StackUnderFlow {
        --top;
        if (top == -1){
            throw new StackUnderFlow();
        }
        return s[top];
    }


}
