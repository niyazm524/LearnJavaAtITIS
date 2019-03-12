package ml.bimdev.lesson24.homework;

import ml.bimdev.lesson23.homework.Student;

import java.util.Comparator;

class Main {
    public static void main(String[] args) {
        Group g1 = new Group(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getFirstName().compareToIgnoreCase(o2.getFirstName());
            }
        });


        Group g2 = Group.randomGroup((o1, o2) -> Integer.compare(o1.getCourse(), o2.getCourse()));
        //g2.printList();
    }
}
