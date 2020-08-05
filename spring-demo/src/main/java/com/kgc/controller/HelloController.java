package com.kgc.controller;

import com.kgc.pojo.Person;
import com.kgc.pojo.Student;
import com.kgc.pojo.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private  Student stu;


    @Autowired
    private Teacher teacher;

    @RequestMapping("/showStu")
    public Student getStu(){
        return stu;
    }
    @RequestMapping("/showTeacher")
    public Teacher getTeacher(){
        return teacher;
    }


    @RequestMapping("/showPerson")
    public Person getPerson(){
        //Person person=new Person(1,"张三");
        Person person=new Person();
        person.setId(2);
        person.setName("李四");
        return person;
    }

    @RequestMapping("/show")
    public String hello(){
        return "spring boot hello";
    }
}
