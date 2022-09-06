package com.bscllc.demo.skills.resources;

import java.util.StringJoiner;

public class Foo {
    private String firstName;
    private String lastName;
    private int age;
    private char sex;

    public Foo() {}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Foo foo = (Foo) o;

        if (age != foo.age) return false;
        if (sex != foo.sex) return false;
        if (!firstName.equals(foo.firstName)) return false;
        return lastName.equals(foo.lastName);
    }

    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + age;
        result = 31 * result + (int) sex;
        return result;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Foo.class.getSimpleName() + "[", "]")
                .add("firstName='" + firstName + "'")
                .add("lastName='" + lastName + "'")
                .add("age=" + age)
                .add("sex=" + sex)
                .toString();
    }
}
