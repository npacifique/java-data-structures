import java.util.LinkedList;
import java.util.ListIterator;

//implement a stack using JDK's linkedList
public class LinkedStack {
    private LinkedList<Employee> stack;

    public LinkedStack(){
        stack = new LinkedList<Employee>();
    }

    public void push(Employee employee){
        stack.push(employee);
    }

    public void pop( ){
        stack.pop();
    }

    public Employee peek( ) {return stack.peek();}

    public boolean isEmpty(){
        return stack.isEmpty();
    }


    public void showAll(){
        ListIterator<Employee> iterator = stack.listIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
