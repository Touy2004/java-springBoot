package com.example.restapidemo.models;

public class Member {
    private Integer id;
    private String name;
    private Integer age;
    private String dept;

    public Member() {
        super();
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getDept() {
        return dept;
    }

    @Override
    public String toString() {
        return "[" + id + ", name=" + name + ", age=" + age + ", dept='" + dept + "']";
    }
}
