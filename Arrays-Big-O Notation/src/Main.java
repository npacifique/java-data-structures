public class Main {
    public static  void main(String[] args){
        //array capacity is 5
        Integer[] intArray = new Integer [5];

        intArray[0] = 14;
        intArray[1] = 8;
        intArray[2] = -1;
        intArray[3] = 23;
        intArray[4] = 15;


        /**
            array memory  | x + i * y
            x = memory address
            i = index of element
            y = size of element

            finding the memory address an element
            address of array[0] = 12 + (0 * 4) = 12
            address of array[1] = 12 + (1 * 4) = 16
            address of array[2] = 12 + (2 * 4) = 20
            ...
            address of array[5] = 12 + (5 * 4) = 32
            note: the advantage of using arrays comes when the index is know and which provide a performance advantage
            the Big-O notation O(1) / the retrieval happen in constant time

         */

        //searching throughout the array
        int index = -1;
        for (int i = 0; i < intArray.length; i++){
            if(intArray[i] == 23){
                index = i;
                break;
            }

        }

        //System.out.println("index = "+ index);

        /**
            For Big-O notation we always consider the worse case
            - in our example the worse case will be if 23 was at the end of the array which mean the search the whole array
            - n = number of element
            - Big-O O(n) / Linear time
         */

        System.out.println("Bubble sort");
        //ArraySort.bubbleSort(intArray);
        var bubbleSort = new ArraySort<Integer>();
        bubbleSort.bubbleSort(intArray);


        String[] arrayString = { "Z", "C", "B" , "A" };
        var bubbleSortString = new ArraySort<String>();
        bubbleSortString.bubbleSortString(arrayString);


        System.out.println("\nBubble sort int");
        for (int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }

        System.out.println("\nBubble sort string");
        for (int i = 0; i < arrayString.length; i++){
            System.out.println(arrayString[i]);
        }

    }
}
