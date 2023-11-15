package ss10_DSA.array_list;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;

    Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("capacity" + capacity);
        }
    }

    public boolean add(E element) {
        if (elements.length == size) {
            this.ensureCapacity(5);
        }
        elements[size] = element;
        size++;
        return true;

    }

    public void add(E element, int index) {
        if (index > elements.length) {
            throw new IllegalArgumentException("IndexOutOfBoundsException: " + index);
        } else if (elements.length == size) {
            this.ensureCapacity(5);
        } else {
            if (elements[index] == null) {
                elements[index] = element;
                size++;
            } else {
                for (int i = size + 1; i >= index; i--) {
                    elements[i] = elements[i - 1];
                }
                elements[index] = element;
                size++;
            }
        }

    }

    public void remove(int index) {

    }

    public int size() {
        return this.size;
    }

    public MyList<E> clone() {
        MyList<E> newList = new MyList<>();
        newList.elements = Arrays.copyOf(this.elements, this.size);
        newList.size = this.size;
        return newList;
    }

    public int indexOf(E o) {
        int index = -1;
        for (int i = 0; i <size;i++){
            if(this.elements[i].equals(o)){
                return i;
            }
        }
        return index;
    }
    public boolean contains(E o) {
        return indexOf(o) != -1;
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else {
            throw new IllegalArgumentException("MinimumCapacity: " + minCapacity);
        }
    }
    public E get(int index){
        return (E) elements[index];
    }

    public void clear() {
        size = 0;
        for (Object item : elements) {
            item = null;
        }
    }
}
