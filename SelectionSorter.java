import java.util.ArrayList;
import java.util.Comparator;

/**
 * A utility class to sort any list using the selection sort algorithm.
 */
public class SelectionSorter {

    /**
     * Generic method to sort a list using selection sort and a provided comparator.
     */
    public static <T> void selectionSort(ArrayList<T> list, Comparator<? super T> comparator) {
        int n = list.size();

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find index of smallest item using the comparator
            for (int j = i + 1; j < n; j++) {
                if (comparator.compare(list.get(j), list.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }

            // Swap if a smaller item was found
            if (minIndex != i) {
                T temp = list.get(i);
                list.set(i, list.get(minIndex));
                list.set(minIndex, temp);
            }
        }
    }
}
