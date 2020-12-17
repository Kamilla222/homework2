package com.lesson.l7.clone;

public class Child implements Cloneable {
    private String name;
    private int age;
    private Child2 child2;

    public Child(String name, int age, Child2 child2) {
        this.name = name;
        this.age = age;
        this.child2 = child2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Child2 getChild2() {
        return child2;
    }

    public void setChild2(Child2 child2) {
        this.child2 = child2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Child child = (Child) o;

        if (age != child.age) return false;
        if (name != null ? !name.equals(child.name) : child.name != null) return false;
        return child2 != null ? child2.equals(child.child2) : child.child2 == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (child2 != null ? child2.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    protected Child clone() throws CloneNotSupportedException {
        Child child = (Child) super.clone();
        child.child2 = child2.clone();
        return child;
    }
}
