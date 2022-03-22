package com.lylechristine.map;

import lombok.Data;

@Data
public class Person {

    private String name;
    private String staffId;
    private String department;
    private String areaCode;

    public Person(String name, String staffId, String department, String areaCode) {
        this.name = name;
        this.staffId = staffId;
        this.department = department;
        this.areaCode = areaCode;
    }
}

