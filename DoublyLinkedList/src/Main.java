import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args){
        /**
         * node in doubly linked List element have reference to each other.
         * Big-O notation O(1)
         */

//        EmployeeDoublyList list = new EmployeeDoublyList();
//        System.out.println("is Empty " + list.isEmpty());

        Employee Johnson = new Employee("Johnson", "Brown", 1);
        Employee Mathias = new Employee("Mathias", "Lee", 2);
        Employee Jane = new Employee("Jane", "Johnson", 3);
        Employee Bill = new Employee("Bill", "Net", 4);

        LinkedList<Employee> list = new LinkedList<>();

        list.addFirst(Johnson);
        list.addFirst(Mathias);
        list.addFirst(Jane);
        //list.add(Bill); //this add the item at the end
        list.addLast(Bill);
        list.removeFirst();
//
//
//
//
//        System.out.println("Get size " + list.getSize());
//        list.showALl();
//
//        list.removeFromFront();

        //list.addToEnd(Bill);

        //System.out.println("Get size " + list.getSize());
        //list.showALl();

        Iterator item = list.iterator();
        System.out.print("HEAD->");
        while (item.hasNext()){
            System.out.print(item.next());
            System.out.print(" <--> ");
        }

        System.out.print("null");






    }
}
