import java.util.Comparator;

/**
 * Comparator for sorting Student objects by roll number numerically.
 */
public class RollnoComparator implements Comparator<Student> {
    /**
     * Compares two Student objects based on their roll numbers.
     * @param s1 the first student
     * @param s2 the second student
     * @return a negative, zero, or positive integer if the first roll number is less than,
     *         equal to, or greater than the second roll number
     */
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getRollno(), s2.getRollno());
    }
}
