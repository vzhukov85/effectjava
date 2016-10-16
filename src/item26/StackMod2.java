package item26;

import java.util.Arrays;
import java.util.EmptyStackException;

public class StackMod2<E>  {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    @SuppressWarnings("unchecked")
    public StackMod2() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(E e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public E pop() {
        if (size == 0)
            throw new EmptyStackException();
        //является безопасным преобразованием, т.к. в методе push невозможно передать параметр отличный от типа E
        @SuppressWarnings("unchecked")
        E e = (E) elements[--size];
        elements[size] = null;
        return e;
    }

    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }
}
