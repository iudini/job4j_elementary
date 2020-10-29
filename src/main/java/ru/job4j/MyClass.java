package ru.job4j;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class MyClass<T> {
    private T val;

    MyClass(T v) {
        val = v;
    }

    MyClass() {
        val = null;
    }

    T getVal() {
        return val;
    }
}

interface MyFunc<R, T> {
    R func(T n);
}

class MyClass2 {
    String str;

    MyClass2(String s) {
        str = s;
    }

    MyClass2() {
        str = "";
    }

    String getVal() {
        return str;
    }
}

class ConstructorRefDemo {
    static <T, R> T myClassFactory(Function<R, T> cons, R v) {
        return cons.apply(v);
    }

    public static void main(String[] args) {
        MyClass<Double> mc = myClassFactory(MyClass::new, 10.1);
        System.out.println(mc.getVal());

        MyClass2 ac = myClassFactory(MyClass2::new, "Jooo");
        MyClass2 yac = new MyClass2("Op");
        System.out.println(ac.getVal());
        System.out.println(yac.getVal());
    }
}
