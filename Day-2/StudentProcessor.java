import java.util.*;
import java.util.stream.Collectors;

class Student {
    private int sid;
    private String sname;
    private int marks;

    // Constructor with validation
    public Student(int sid, String sname, int marks) {
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Marks should be between 0 and 100");
        }
        this.sid = sid;
        this.sname = sname;
        this.marks = marks;
    }

    // Getter methods (moved outside the constructor)
    public int getId() { return sid; }
    public String getName() { return sname; }
    public int getMarks() { return marks; }

    @Override
    public String toString() {
        return "Student {ID=" + sid + ", Name='" + sname + "', Marks=" + marks + "}";
    }
}

class StudentProcessor {
    public static void main(String[] args) {
        List<Student> l = new ArrayList<>();

        try {
            l.add(new Student(1, "Rahul", 97));
            l.add(new Student(2, "Khushal", 67));
            l.add(new Student(3, "Vishal", 78));
            l.add(new Student(4, "Suraj", 96));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Step 2: Sort students by marks using Lambda expression
        l.sort(Comparator.comparingInt(Student::getMarks));
        System.out.println("\nSorted Students by Marks:");
        l.forEach(System.out::println);

        // Step 3: Use Streams API to filter students with marks > 50
        List<Student> filteredStudents = l.stream()
                .filter(s -> s.getMarks() > 50)
                .collect(Collectors.toList());

        System.out.println("\nStudents with Marks > 50:");
        filteredStudents.forEach(System.out::println);

        // Step 4: Use forEach() to print student details
        System.out.println("\nAll Students:");
        l.forEach(System.out::println);

        // Step 6: Use Multithreading to process student list asynchronously
        Runnable task = () -> {
            System.out.println("\nProcessing students in a separate thread:");
            l.forEach(s -> System.out.println("Processing: " + s));
        };

        Thread thread = new Thread(task);
        thread.start();
    }
}
