package com.juaracoding.cucumber;

public enum TestScenarios {
    T1("Admin successful login into web HRM"),
    T2("Admin add candidate");

    private String testCaseName;
    TestScenarios(String value){
        testCaseName = value;
    }
    public String getTestCaseName(){
        return testCaseName;
    }
}
