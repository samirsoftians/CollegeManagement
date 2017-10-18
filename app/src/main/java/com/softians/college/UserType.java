package com.softians.college;

/**
 * Created by Lenovo on 3/2/2017.
 */

public enum UserType {

    FY_Student("FY Student"),
    SY_Student("SY Student"),
    TY_Student("TY Student"),
    FY_Teacher("FY Teacher"),
    SY_Teacher("SY Teacher"),
    TY_Teacher("TY Teacher"),
    Principal("Principal")

            ;

    private String stringValue;
    UserType(String toString) {
        stringValue = toString;
    }

    @Override
    public String toString() {
        return stringValue;
    }
}

