public class Main {
    public static void main (String[] args){

        //ArrayStack stack = new ArrayStack(10);
        LinkedStack stack = new LinkedStack();

        Employee Johnson = new Employee("Johnson", "Brown", 1);
        Employee Mathias = new Employee("Mathias", "Lee", 2);
        Employee Jane = new Employee("Jane", "Johnson", 3);

        stack.push(Johnson);
        stack.push(Mathias);
        stack.push(Jane);

        stack.pop();

        stack.peek();

        stack.showAll();

    }
}
