import java.util.EmptyStackException;

public class ArrayStack {
    private Employee[] stack;
    private int top;

    public ArrayStack(int capacity){
        stack = new Employee[capacity];
    }

    public void push(Employee employee){
        if(top == stack.length){
            //resize the backing array
            Employee[] newArray = new Employee[2* stack.length];
            System.arraycopy(stack, 0, newArray,0, stack.length );
            stack = newArray;
        }

        stack[top++] = employee;
    }

    public Employee pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        Employee employee = stack[--top];stack[top] = null;

        return  employee;
    }


    public Employee peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }

        //-1 because we want the element at index 0
        return  stack[top - 1];
    }


    public int size(){
        return top;
    }


    public void showAll(){
        for (int i = top - 1; i >= 0; i--){
            System.out.print(stack[i]);
        }

    }


    public boolean isEmpty(){
        return top ==0;
    }
}
