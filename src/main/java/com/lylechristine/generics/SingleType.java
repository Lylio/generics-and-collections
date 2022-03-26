package com.lylechristine.generics;

// We use < > to specify a Parameter type which can be occupied by any type
class SingleType<T> {

    // An object of type T is declared
    T obj;
    SingleType(T obj) {
        this.obj = obj;
    } // constructor

    public T getObject() {
        return this.obj;
    }
}

