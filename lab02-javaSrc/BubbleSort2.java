import java.util.ArrayList;


/**
 * Early Termination bubble sort.
 *
 * @author jkcchan
 */
public class BubbleSort2
{
    /**
     * Sorts the input array.
     *
     * @param array ArrayList<Integer> array of integers.
     */
    public void sort(ArrayList<Integer> array) {

        boolean swapped = false;
        int remainingLen = array.size();

        do {
            swapped = false;
            for (int i = 0; i < remainingLen - 1; i++) {
                // check if we need to swap
                if (array.get(i) > array.get(i+1)) {
                    Integer temp = array.get(i);
                    array.set(i, array.get(i+1));
                    array.set(i+1, temp);
                    swapped = true;
                }
            }

            remainingLen--;

        } while (swapped);

    } // end of sort()


    public static void main(String[] args) {

		//init startTime to current system time
		long startTime = System.nanoTime();

        // construct the sorter we will be using
        BubbleSort2 sorter = new BubbleSort2();

        // read in input
        ArrayList<Integer> array = BubbleSortUtils.getInput();

        // sort
        sorter.sort(array);

        // print out sorted array
        BubbleSortUtils.print(array);

		//init startTime to current system time
		long endTime = System.nanoTime();

		//init estimated time and set to converted long calc
		double estimatedTime = ((double)(endTime - startTime))/Math.pow(10,9);

		System.out.println("time taken = " + estimatedTime + "secs");
    }  // end of main()

} // end of class BubbleSort1
