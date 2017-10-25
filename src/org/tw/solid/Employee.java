package org.tw.solid;

import java.util.Date;

public class Employee {

    private String employeeId;
    private String name;
    private String address;

    private Date dateOfJoining;

    // Another system to calculate the promotion due for employee
    // Relation : System has Employee
    public boolean isPromotionDueThisYear(){
        // logic
        return false;
    }

    public Double calcIncomeTaxForCurrentYear(){
        // logic
        return null;
    }

}
