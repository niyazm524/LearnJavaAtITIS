package ml.bimdev.lesson34;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

class Main {
    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        // printConstructors(Student.class);
//        Student s = new Student("Alex");
//        Method m = Student.class.getDeclaredMethod("passExams", int.class);
//        m.setAccessible(true);
//        System.out.println("Student " + ((boolean) m.invoke(s, 4) ? "passed" : "failed") + " exam");

        List<Student> students = AwesomeFramework.getManyWithParams(Student.class, 20, "John", 19);
        students.forEach(System.out::println);
    }

    static void printConstructors(Class c) {
        Arrays.stream(c.getDeclaredConstructors())
                .map(Constructor::getParameterTypes)
                .forEach(types -> System.out.println(Arrays.toString(types)));
    }


}
