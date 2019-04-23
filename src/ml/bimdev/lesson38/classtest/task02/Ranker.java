package ml.bimdev.lesson38.classtest.task02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ranker<T> {
    private List<T> rankList = new ArrayList<>();

    public void addOne(T obj) {
        rankList.add(obj);
    }

    public void addMore(List<T> objects) {
        rankList.addAll(objects);
    }

    public List<T> topN(int N, Comparator<T> comparator) {
        return rankList
                .stream()
                .sorted(comparator)
                .limit(N)
                .collect(Collectors.toList());
    }

    public List<T> top10(Comparator<T> comparator) {
        return topN(10, comparator);
    }
}
