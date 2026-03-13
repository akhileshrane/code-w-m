package arrays;

import java.util.HashMap;
import java.util.Map;

public class IntegerArray {

    private int[] array;
    private int capacity; //total capacity
    private int size; //length - current insert index

    public IntegerArray(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
        this.size = 0;
    }

    public int[] getArray() {
        int[] result = new int[size];
        System.arraycopy(array, 0, result, 0, size);
        return result;
    }

    public void insert(int integer) {
        if (size == capacity) {
            capacity = capacity * 2;
            int[] newArr = new int[capacity];
            System.arraycopy(array, 0, newArr, 0, size);
            array = newArr;
        }

        array[size] = integer;
        size++;

    }

    /*
        remove element from index
     */
    public void removeAt(int index) throws Exception {
        if (index < 0 || index >= size) {
            throw new Exception("Index OOB");
        }

        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        size--;
    }

    /* return index of integer
        else return -1
     */
    public int indexOf(int integer) {
        for (int i = 0; i < size; i++) {
            if (array[i] == integer) {
                return i;
            }
        }
        return -1;
    }

    /*
        return max
     */
    public int getMaxValue() {
        int max = array[0];
        for (int i = 0; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public int[] getIntersection(int[] compareTo) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < size; i++) {
            if (!map.containsKey(array[i])) {
                map.put(array[i], i);
            }
        }

        int[] intersection = new int[map.size()];
        int index = 0;

        for (int j : compareTo) {
            if (map.containsKey(j)) {
                intersection[index++] = j;
            }
        }

        int[] resultantIntersection = new int[index];
        System.arraycopy(intersection, 0, resultantIntersection, 0, index);
        return resultantIntersection;
    }

    public int[] reverse() {
        int[] reversed = new int[size];
        int index = 0;
        for (int i = size - 1; i >= 0; i--) {
            reversed[index++] = array[i];
        }
        return reversed;
    }

    public void insertAt(int element, int index) throws IllegalArgumentException {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Size dekh le");
        }

        array[index] = element;
    }
}


