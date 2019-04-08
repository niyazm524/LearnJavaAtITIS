package ml.bimdev.lesson34;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Random;

class ReflectionAPI {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Student student = new Student("Igor");
        forceSetAgeExample(student, 90);

        System.out.println(isFieldStatic(Student.class.getDeclaredField("course")));
    }

    private static boolean isFieldStatic(Field field) {
        return Modifier.isStatic(field.getModifiers());
    }

    static void forceSetAgeExample(Student student, int age) throws NoSuchFieldException, IllegalAccessException {
        Class klass = student.getClass();
        Field f = klass.getDeclaredField("age");
        f.setAccessible(true);
        f.set(student, age);
    }
}

class Student {
    static int course = 1;
    public String name;
    private int age = 0;

    public Student() {
    }

    Student(String name) {
        this.name = name;
    }

    Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    boolean passExams(int fuckingCasino) {
        return fuckingCasino % 3 == (new Random()).nextInt(4);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}