import java.util.Comparator;

/**
 * Comparator for sorting Student objects by name alphabetically.
 */
public class NameComparator implements Comparator<Student> {
    /**
     * Compares two Student objects based on their names.
     * @param s1 the first student
     * @param s2 the second student
     * @return a negative, zero, or positive integer if the first name is less than,
     *         equal to, or greater than the second name
     */
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareToIgnoreCase(s2.getName());
    }
}
