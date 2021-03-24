public class EmployeeDoublyList {
    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;


    public void addToFront(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        if(head == null){
            tail = null;
        }
        else {
            head.setPrevious(node);
        }

        head = node;
        size++;
    }


    public void addToEnd(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);


        if(tail == null){
            head = node;
        }
        else {
            tail.setNext(node);
            node.setPrevious(tail);
        }

        tail = node;
        size++;
    }

    public EmployeeNode removeFromFront(){
        if(isEmpty()){
            return null;
        }
        EmployeeNode removedNode = head;

        if(head.getNext() == null){
            tail = null;
        }else {
            head.getNext().setPrevious(null);
        }

        head = head.getNext();
        size--;

        removedNode.setNext(null);
        return removedNode;
    }

    public EmployeeNode removeFromEnd(){

        if (isEmpty()) {
            return null;
        }

        EmployeeNode removedNode = tail;

        if (tail.getPrevious() == null) {
            head = null;
        }
        else {
            tail.getPrevious().setNext(null);
        }

        tail = tail.getPrevious();
        size--;
        removedNode.setPrevious(null);
        return removedNode;

    }

    public void showALl(){
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" <=> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty(){
        return  head == null;
    }

}
