package com.workintech.developers;

import java.util.ArrayList;
import java.util.List;

public class HRManager extends Employee {
    private List<JuniorDeveloper> juniorDevelopers;
    private List<MidDeveloper> midDevelopers;
    private List<SeniorDeveloper> seniorDevelopers;

    public HRManager(long id, String name, double salary) {
        super(id, name, salary);
        this.juniorDevelopers = new ArrayList<>();
        this.midDevelopers = new ArrayList<>();
        this.seniorDevelopers = new ArrayList<>();
    }

    @Override
    public void work() {
        System.out.println("HRManager is managing employees and hiring.");
        setSalary(getSalary() + 1500);
    }

    public void addEmployee(JuniorDeveloper junior) {
        if (!juniorDevelopers.contains(junior)) {
            juniorDevelopers.add(junior);
            System.out.println("JuniorDeveloper added successfully.");
        } else {
            System.out.println("JuniorDeveloper already exists.");
        }
    }

    public void addEmployee(MidDeveloper mid) {
        if (!midDevelopers.contains(mid)) {
            midDevelopers.add(mid);
            System.out.println("MidDeveloper added successfully.");
        } else {
            System.out.println("MidDeveloper already exists.");
        }
    }

    public void addEmployee(SeniorDeveloper senior) {
        if (!seniorDevelopers.contains(senior)) {
            seniorDevelopers.add(senior);
            System.out.println("SeniorDeveloper added successfully.");
        } else {
            System.out.println("SeniorDeveloper already exists.");
        }
    }

    public List<JuniorDeveloper> getJuniorDevelopers() {
        return juniorDevelopers;
    }

    public List<MidDeveloper> getMidDevelopers() {
        return midDevelopers;
    }

    public List<SeniorDeveloper> getSeniorDevelopers() {
        return seniorDevelopers;
    }
}
