import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Johnson", "Brown", 1));
        employeeList.add(new Employee("Mathias", "Lee", 2));
        employeeList.add(new Employee("Jane", "Johnson", 3));

        System.out.println(employeeList.isEmpty());
        System.out.println(employeeList.size());
        employeeList.set(1, new Employee("Math", "Lee", 2));
        //employeeList.remove(2);
        //System.out.println(employeeList.get(1));


        employeeList.forEach(employee ->  System.out.println(employee));


    }
}
