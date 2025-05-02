/**
 * Represents a student with a roll number, name, and address.
 */
public class Student {
    private int rollNo;
    private String name;
    private String address;

    /**
     * Constructs a valid Student object after checking all fields.
     * @throws IllegalArgumentException if rollNo is <= 0 or name/address is null or empty
     */
    public Student(int rollNo, String name, String address) {
        if (rollNo <= 0) {
            throw new IllegalArgumentException("Roll number must be positive.");
        }
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name must not be null or empty.");
        }
        if (address == null || address.isEmpty()) {
            throw new IllegalArgumentException("Address must not be null or empty.");
        }

        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
    }

    // Getter methods
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    // Converts a Student object to a readable string
    @Override
    public String toString() {
        return "Student [Roll No: " + rollNo + ", Name: " + name + ", Address: " + address + "]";
    }
}
