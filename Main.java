import java.util.ArrayList;

/**
 * Demonstrates sorting of Student objects by name and roll number.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        // Creating student objects with valid input
        students.add(new Student(5, "Alice", "New York"));
        students.add(new Student(2, "Bob", "California"));
        students.add(new Student(8, "Charlie", "Nevada"));
        students.add(new Student(1, "David", "Texas"));
        students.add(new Student(6, "Eve", "Florida"));
        students.add(new Student(4, "Frank", "Arizona"));
        students.add(new Student(9, "Grace", "Washington"));
        students.add(new Student(3, "Heidi", "Oregon"));
        students.add(new Student(7, "Ivan", "Colorado"));
        students.add(new Student(10, "Judy", "Alaska"));

        System.out.println("Original List:");
        printStudents(students);

        // Sort by name
        System.out.println("\nSorted by Name:");
        SelectionSorter.selectionSort(students, new NameComparator());
        printStudents(students);

        // Sort by roll number
        System.out.println("\nSorted by Roll Number:");
        SelectionSorter.selectionSort(students, new RollnoComparator());
        printStudents(students);
    }

    /**
     * Prints each student in the list using toString.
     */
    private static void printStudents(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
