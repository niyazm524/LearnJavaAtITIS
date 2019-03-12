package ml.bimdev.lesson24.homework;

import ml.bimdev.lesson21.binsearch.SortedList;
import ml.bimdev.lesson23.homework.Student;

import java.util.Comparator;
import java.util.Random;

class Group extends SortedLinkedList<Student> {
    private Comparator<Student> comparator;

    public Group(Comparator<Student> comparator) {
        super();
        this.comparator = comparator;
    }

    public Group() {
        super();
        this.comparator = Student::compareTo;
    }

    public static Group randomGroup() {
        Group g = new Group();
        g.addRandomStudents((new Random()).nextInt(15) + 5);
        return g;
    }

    public static Group randomGroup(Comparator<Student> comparator) {
        Group g = new Group(comparator);
        g.addRandomStudents((new Random()).nextInt(15) + 5);
        return g;
    }

    public void addRandomStudents(int count) {
        System.out.println("Adding " + count + " students..");
        for (int i = 0; i < count; i++) {
            this.add(Student.random());
        }
    }

}
