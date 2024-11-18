package com.workintech.developers;

public class MidDeveloper extends Employee {

    public MidDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("MidDeveloper is coding and mentoring.");
        setSalary(getSalary() + 1000); // Maaşa orta seviyede bir artış eklenebilir
    }
}
