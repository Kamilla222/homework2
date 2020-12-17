package com.lesson.l7.clone;

public class Child2  implements Cloneable{
    private String name;

    public Child2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Child2 child2 = (Child2) o;

        return name != null ? name.equals(child2.name) : child2.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Child2{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    protected Child2 clone() throws CloneNotSupportedException {
        return (Child2) super.clone();
    }
}
