package ua.od.atomspace;

import java.util.Objects;

public class TemplateClass extends Object {
    private String name;

    public void test() {
        System.out.println("123");
    }

    public TemplateClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        System.out.println("asdasd");
        System.out.println("asdasd");
        System.out.println("asdasd");
        return "TemplateClass{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof TemplateClass) {
            return this.name == ((TemplateClass) other).name;
        }
        return false;


    }

    @Override
    public int hashCode() {
        return name.hashCode() * 34;
    }
}
