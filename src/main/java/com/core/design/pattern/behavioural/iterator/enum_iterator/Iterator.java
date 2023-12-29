package com.core.design.pattern.behavioural.iterator.enum_iterator;

public interface Iterator<T> {
    boolean hasNext();

    T next();
}
