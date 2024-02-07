import java.util.Random;

/**
 * We say that an array A is k-sorted if it has the property that for every element i in array A, i’s position in array A is at most k away from i’s position in a sorted array of the same data. For example, the array: [1, 4, 2, 3, 5, 7, 6, 8] is 2-sorted because every element is within 2 positions of its “correct” position in a sorted array.
 * Any array that is k-sorted is also j-sorted for all j > k.
 * In this part of the assignment, you will study the question of whether it is faster to sort k-sorted data than fully random data. You will need to write a method generateKSorted(my_array) that fills the array that is passed as an argument with 10-sorted data (each element is within 10 positions of its correct position in the array).
 * Repeat the performance experiments from problem 5, this time with 10-sorted data instead of random data. Hint: You can use shell sort to get an approximation of this by doing an iteration of k-sort with k =10.
 */
public class Main {

    public void generateKSorted(int[] my_array) {
        Random rand = new Random();
        int size = my_array.length;
        int num;
        int t;
        for (int i = size -1; i > 0; i--) {
            num = my_array[i];
            t = i - 1;

            while (t >= 0 && my_array[t] > num) {
                my_array[t + 1] = my_array[t];
                t = t - 1;

            }
            my_array[t + 1] = num;

        }

    }

    public static void main(String[] args) {

    }
}