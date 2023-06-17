package com.atguigu.restful.pojo;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

public class Employee {
    private Integer id;
    @NotEmpty
    private String name;
    @Pattern(regexp = "/[男女]/")
    private String gender;
    @Min(0)
    @Max(150)
    private Integer age;
    @Pattern(regexp = "/[0-9]{11}/")
    private String phone;

    public Employee() {
    }

    public Employee(Integer id, String name, String gender, Integer age, String phone) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
