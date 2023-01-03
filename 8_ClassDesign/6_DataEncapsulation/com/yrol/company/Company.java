package com.yrol.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * POJO - Plain Old  Java Class
 * POJOs consist of encapsulated data
 */
public class Company {

    /*
     * Encapsulating data. Make them available only to this class.
     * Setting and accessing this data using helper methods.
     */
    private String companyName;
    private List<String> employees = new ArrayList<>();

    public void setCompanyName(String companyName) {

        // Adding local validation to prevent errors such as setting list to null and
        // then call sort method & etc.
        if (companyName == null || companyName.isEmpty()) {
            System.out.println("Company name cannot be empty");
            return;
        }

        this.companyName = companyName;
    }

    public void setEmployee(String name) {

        // Adding local validation
        if (name == null || name.isEmpty()) {
            System.out.println("Employee name cannot be empty");
            return;
        }
        employees.add(name);
    }

    public void printSortedEmployees() {
        Collections.sort(employees);
        System.out.println(employees);
    }
}
