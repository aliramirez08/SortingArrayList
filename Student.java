/**
 * Represents a student with a roll number, name, and address.
 */
public class Student {
    private int rollno;
    private String name;
    private String address;

    /**
     * Constructs a Student object with the given roll number, name, and address.
     * @param rollno the student's roll number (must be positive)
     * @param name the student's name
     * @param address the student's address
     * @throws IllegalArgumentException if roll number is zero or negative
     */
    public Student(int rollno, String name, String address) {
        if (rollno <= 0) {
            throw new IllegalArgumentException("Roll number must be positive.");
        }
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    /**
     * Returns the student's roll number.
     * @return the roll number
     */
    public int getRollno() {
        return rollno;
    }

    /**
     * Returns the student's name.
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the student's address.
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Student [Roll No: " + rollno + ", Name: " + name + ", Address: " + address + "]";
    }
}
