package com.company.lesson1;

import static java.lang.System.lineSeparator;

public class Employees {
    private Object StringBuilder;
    private String fullName;
    private String position;
    private String email;
    private long phoneNumber;
    private int theSalary;
    private int age;

    public Employees(String fullName, String position, String email, long phoneNumber, int theSalary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.theSalary = theSalary;
        this.age = age;
    }

    void getInformationEmployee() {

        StringBuilder builder = new StringBuilder();

        builder.append("Full name: " + fullName).append(lineSeparator());
        builder.append("Position: " + position).append(lineSeparator());
        builder.append("E-mail: " + email).append(lineSeparator());
        builder.append("Phone number: " + phoneNumber).append(lineSeparator());
        builder.append("The salary: " + theSalary + " RUB.").append(lineSeparator());
        builder.append("Age: " + age + " years").append(lineSeparator());

        System.out.println(builder);

    }

    public int getAge() {
        return age;
    }
}
