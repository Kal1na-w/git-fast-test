package ua.od.atomspace;

import java.util.Objects;

public class User {
    public static final double DEFAULT_TEMP = 36.6;

    private String name;
    private int age;
    private EnumUserRoles role;

    public User(String name, int age, EnumUserRoles role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }

    public EnumUserRoles getRole() {
        return role;
    }

    public void setRole(EnumUserRoles role) {
        this.role = role;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", role='" + role + '\'' +
                '}';
    }
}
