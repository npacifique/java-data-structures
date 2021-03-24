public class Main {
    public static void main(String[] args){
        /**
         *
         */
        EmployeeList list = new EmployeeList();
        System.out.println("is Empty " + list.isEmpty());

        Employee Johnson = new Employee("Johnson", "Brown", 1);
        Employee Mathias = new Employee("Mathias", "Lee", 2);
        Employee Jane = new Employee("Jane", "Johnson", 3);

        list.addToFront(Johnson);
        list.addToFront(Mathias);
        list.addToFront(Jane);

        list.removeFromFront();

        System.out.println("Get size " + list.getSize());
        list.showALl();




    }
}
