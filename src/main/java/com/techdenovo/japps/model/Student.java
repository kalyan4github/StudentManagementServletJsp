package com.techdenovo.japps.model;

public class Student {
    private long id;
    private String name;
    private String collegeName;

    public Student() {
    }
    public Student(String name, String collegeName) {
        this.name = name;
        this.collegeName = collegeName;
    }
    public Student(long id, String name, String collegeName) {
        this.id = id;
        this.name = name;
        this.collegeName = collegeName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", collegeName='" + collegeName + '\'' +
                '}';
    }
}
