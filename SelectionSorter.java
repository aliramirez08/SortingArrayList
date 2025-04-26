import java.util.ArrayList;
import java.util.Comparator;

/**
 * Provides a static method to perform selection sort on a list using a comparator.
 */
public class SelectionSorter {

    /**
     * Sorts the given list using the selection sort algorithm.
     * @param list the list to sort
     * @param comparator the comparator to determine the order
     * @param <T> the type of elements in the list
     */
    public static <T> void selectionSort(ArrayList<T> list, Comparator<? super T> comparator) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (comparator.compare(list.get(j), list.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                T temp = list.get(i);
                list.set(i, list.get(minIndex));
                list.set(minIndex, temp);
            }
        }
    }
}
