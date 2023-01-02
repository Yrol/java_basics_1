package com.yrol;

import com.yrol.company.*;

public class Main {
    public static void main(String[] args) {

        /*
         * Without encapsulation (where variables companyName and employees are public)
         * It could lead to errors such as:
         * - Setting the list to null and trying to call printSortedEmployees method.
         */

        /*
         * With encapsulation
         */
        Company company = new Company();
        company.setCompanyName("Sony");
        company.setEmployee("James Thomson");
        company.setEmployee("Ryan Jonson");
        company.setEmployee("Danny Bond");
        company.setEmployee(null); // will handle by the helper method not to add to the list
        company.setEmployee(""); // will handle by the helper method not to add to the list
        company.printSortedEmployees();
    }
}
