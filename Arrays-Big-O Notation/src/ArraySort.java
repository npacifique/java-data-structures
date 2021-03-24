public class ArraySort<T> {

    /**
        Bubble sort
        O(n2) time complexity - quadratic
        it will take 100 steps to sort 10 element array, 10,000 for 100 items
        this sorting technic degrades quickly
    */


    public void bubbleSort(T[] array){
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            for (int i = 0; i < lastUnsortedIndex; i++){

                if((int)array[i] > (int)array[i + 1]){
                    swap(array, i, i + 1);
                }
            }
        }

    }


    public void bubbleSortString(T[] array){
        for (int j = 0; j < array.length; j++) {
            for (int i = j + 1; i < array.length; i++) {
                swapString(array, i,j);

            }
        }

    }


    public void swap (T [] array, int i, int j){
        if(i == j) {return;}
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }

    public void swapString (T [] array, int i, int j){

        if (array[i].toString().compareTo(array[j].toString()) < 0) {
            T temp = array[j];
            array[j] = array[i];
            array[i] = temp;
        }

    }
}


/**
 * here are additional resources for Java arrays : https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html
 */