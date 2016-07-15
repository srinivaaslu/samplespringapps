package com.test;

/**
 * Created by 205025 on 6/24/2016.
 */
public class EmpClass implements Comparable<EmpClass>{

    private String userName;
    private String jobTitle;
    private String location;
    private int age;

    public EmpClass(String userName, String jobTitle, String location, int age) {
        this.userName = userName;
        this.jobTitle = jobTitle;
        this.location = location;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int compareTo(EmpClass o) {

        return this.getUserName().compareToIgnoreCase(o.getUserName());
    }
}
