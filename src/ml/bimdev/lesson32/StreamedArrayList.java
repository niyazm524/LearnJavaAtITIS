package ml.bimdev.lesson32;

import ml.bimdev.lists.linkedlist.MyLinkedList;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

class StreamedArrayList<T> extends MyLinkedList<T> {
    public Stream<T> stream() {
        return new MyStream<>(this);
    }

    private class MyStream<E> implements Stream<E> {
        MyLinkedList<E> list;

        public MyStream(MyLinkedList<E> list) {
            super();
            this.list = list;
        }

        @Override
        public Stream<E> filter(Predicate<? super E> predicate) {
            MyLinkedList<E> newList = new MyLinkedList<>();
            for (E item : list) {
                if (predicate.test(item)) {
                    newList.add(item);
                }
            }
            return new MyStream<E>(newList);
        }

        @Override
        public <R> Stream<R> map(Function<? super E, ? extends R> mapper) {
            MyLinkedList<R> newList = new MyLinkedList<>();
            for (E item : list)
                newList.add(mapper.apply(item));
            return new MyStream<R>(newList);
        }

        @Override
        public IntStream mapToInt(ToIntFunction<? super E> mapper) {
            return null;
        }

        @Override
        public LongStream mapToLong(ToLongFunction<? super E> mapper) {
            return null;
        }

        @Override
        public DoubleStream mapToDouble(ToDoubleFunction<? super E> mapper) {
            return null;
        }

        @Override
        public <R> Stream<R> flatMap(Function<? super E, ? extends Stream<? extends R>> mapper) {
            return null;
        }

        @Override
        public IntStream flatMapToInt(Function<? super E, ? extends IntStream> mapper) {
            return null;
        }

        @Override
        public LongStream flatMapToLong(Function<? super E, ? extends LongStream> mapper) {
            return null;
        }

        @Override
        public DoubleStream flatMapToDouble(Function<? super E, ? extends DoubleStream> mapper) {
            return null;
        }

        @Override
        public Stream<E> distinct() {
            return null;
        }

        @Override
        public Stream<E> sorted() {
            return null;
        }

        @Override
        public Stream<E> sorted(Comparator<? super E> comparator) {
            return null;
        }

        @Override
        public Stream<E> peek(Consumer<? super E> action) {
            return null;
        }

        @Override
        public Stream<E> limit(long maxSize) {
            return null;
        }

        @Override
        public Stream<E> skip(long n) {
            return null;
        }

        @Override
        public void forEach(Consumer<? super E> action) {
            for (E item : list) {
                action.accept(item);
            }
        }

        @Override
        public void forEachOrdered(Consumer<? super E> action) {

        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <A> A[] toArray(IntFunction<A[]> generator) {
            return null;
        }

        @Override
        public E reduce(E identity, BinaryOperator<E> accumulator) {
            return null;
        }

        @Override
        public Optional<E> reduce(BinaryOperator<E> accumulator) {
            return Optional.empty();
        }

        @Override
        public <U> U reduce(U identity, BiFunction<U, ? super E, U> accumulator, BinaryOperator<U> combiner) {
            return null;
        }

        @Override
        public <R> R collect(Supplier<R> supplier, BiConsumer<R, ? super E> accumulator, BiConsumer<R, R> combiner) {
            return null;
        }

        @Override
        public <R, A> R collect(Collector<? super E, A, R> collector) {
            return null;
        }

        @Override
        public Optional<E> min(Comparator<? super E> comparator) {
            return Optional.empty();
        }

        @Override
        public Optional<E> max(Comparator<? super E> comparator) {
            return Optional.empty();
        }

        @Override
        public long count() {
            return 0;
        }

        @Override
        public boolean anyMatch(Predicate<? super E> predicate) {
            return false;
        }

        @Override
        public boolean allMatch(Predicate<? super E> predicate) {
            return false;
        }

        @Override
        public boolean noneMatch(Predicate<? super E> predicate) {
            return false;
        }

        @Override
        public Optional<E> findFirst() {
            return Optional.empty();
        }

        @Override
        public Optional<E> findAny() {
            return Optional.empty();
        }

        @Override
        public Iterator<E> iterator() {
            return null;
        }

        @Override
        public Spliterator<E> spliterator() {
            return null;
        }

        @Override
        public boolean isParallel() {
            return false;
        }

        @Override
        public Stream<E> sequential() {
            return null;
        }

        @Override
        public Stream<E> parallel() {
            return null;
        }

        @Override
        public Stream<E> unordered() {
            return null;
        }

        @Override
        public Stream<E> onClose(Runnable closeHandler) {
            return null;
        }

        @Override
        public void close() {

        }
    }
}
