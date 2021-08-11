package Array;

public class Array_Teste {

    //Terminar código big-O. Video: https://www.youtube.com/watch?v=V6mKVRU1evU


    private int[] theArray;
    private int arraySize;
    private int itemInArray;
    static long startTime;
    static long endTime;

    public static void main(String[] args) {
    }

    public void addItemToArray(int newItem){
        theArray[itemInArray++] = newItem;
    }

    public void generateRandomArray(){
        for(int i = 0; i < arraySize; i++){
            theArray[i] = (int) (Math.random() * 1000) + 10;
        }

        itemInArray = arraySize -1;
    }

}
