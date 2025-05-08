package org.dummy.insecure.framework;

public class A {
    private B b;

    A(B b) {
        this.b = b;
    }

    public void printName() {
        System.out.print(this.b.getName());
    }
}

class B {
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public B(String name) {
        this.name = name;
    }
}

