package ml.bimdev.lesson34;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AwesomeFramework {
    public static <T> List<T> getManyWithParams(Class<T> klass, int count, Object... params) {
        List<T> list = new ArrayList<>();
        try {
            Constructor<T> constructor = klass.getDeclaredConstructor(
                    Arrays.stream(params).map(Object::getClass).toArray(Class[]::new));

            for (int i = 0; i < count; i++) {
                list.add(constructor.newInstance(params));
            }

        } catch (NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new IllegalStateException(e);
        }
        return list;
    }
}
