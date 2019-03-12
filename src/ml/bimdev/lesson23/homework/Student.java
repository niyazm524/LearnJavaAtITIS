package ml.bimdev.lesson23.homework;

import java.util.Comparator;
import java.util.Objects;
import java.util.Random;

public class Student implements Comparable<Student> {
    private static Random rnd = new Random();
    private int course;
    private String firstName;
    private String lastName;

    public Student(int course, String name) {
        this.course = course;
        String[] n = name.split(" ", 2);
        firstName = n[0];
        if (n.length == 2)
            lastName = n[1];
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (course != student.course) return false;
        if (!firstName.equals(student.firstName)) return false;
        return Objects.equals(lastName, student.lastName);
    }

    @Override
    public int hashCode() {
        int result = course;
        result = 31 * result + firstName.hashCode();
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return String.format("Student %s (%s course)", lastName == null ? firstName : firstName + " " + lastName, course);
    }

    @Override
    public int compareTo(Student o) {
        if (this.course == o.course) {
            int firstNameCmp = firstName.compareToIgnoreCase(o.firstName);
            if (firstNameCmp == 0) {
                if (lastName == null) return 1;
                if (o.lastName == null) return -1;
                return lastName.compareToIgnoreCase(o.lastName);
            } else return firstNameCmp;
        }
        return o.course - this.course;
    }

    public static Student random() {
        Student s = new Student(rnd.nextInt(7) + 1, Character.toString((char) ('a' + rnd.nextInt((int) 'z' - 'a'))));
        if (rnd.nextBoolean())
            s.setLastName(Character.toString((char) ('a' + rnd.nextInt((int) 'z' - 'a'))));
        return s;
    }
}
