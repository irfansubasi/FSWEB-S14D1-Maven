package com.workintech.developers;

public class JuniorDeveloper extends Employee {

    public JuniorDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("JuniorDeveloper is learning and working.");
        setSalary(getSalary() + 500); // Maaşa küçük bir artış eklenebilir
    }
}
