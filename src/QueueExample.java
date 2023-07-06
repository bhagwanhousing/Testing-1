import java.util.Comparator;
import java.util.PriorityQueue;

public class QueueExample {
    public static void main(String[] args) {
        // Create a PriorityQueue of custom objects using a Comparator
        PriorityQueue<Student> priorityQueue = new PriorityQueue<>(new StudentComparator());

        // Add elements to the PriorityQueue
        priorityQueue.add(new Student("Alice", 20));
        priorityQueue.add(new Student("Bob", 18));
        priorityQueue.add(new Student("Charlie", 22));

        // Print the elements in the PriorityQueue
        System.out.println("PriorityQueue elements: " + priorityQueue);

        // Retrieve and remove the head of the PriorityQueue
        Student head = priorityQueue.poll();
        System.out.println("Head of the PriorityQueue: " + head);

        // Print the elements in the PriorityQueue after removal
        System.out.println("PriorityQueue elements after removal: " + priorityQueue);
    }

    static class Student {
        private String name;
        private int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    static class StudentComparator implements Comparator<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            return Integer.compare(s1.age, s2.age);
        }
    }
}
