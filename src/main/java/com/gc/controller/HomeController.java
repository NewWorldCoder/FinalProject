package com.gc.controller;

import com.gc.models.PersonEntity;
import com.gc.models.StaffEntity;
import com.gc.models.StudentEntity;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
public class HomeController {


    @RequestMapping("listStudents")
    public ModelAndView listStudent() {
        Configuration cfg = new
                Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFact = cfg.buildSessionFactory();
        Session selectStudent = sessionFact.openSession();
        selectStudent.beginTransaction();
        Criteria c =
                selectStudent.createCriteria(StudentEntity.class);
        ArrayList<StudentEntity>
                studentList = (ArrayList<StudentEntity>) c.list();
        return new
                ModelAndView("student", "cList", studentList);
    }

    public ArrayList<StudentEntity> getStudent() {
        Configuration cfg = new
                Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFact = cfg.buildSessionFactory();
        Session selectStudent = sessionFact.openSession();
        selectStudent.beginTransaction();
        Criteria c =
                selectStudent.createCriteria(StudentEntity.class);
        ArrayList<StudentEntity>
                studentList = (ArrayList<StudentEntity>) c.list();

        return studentList;
    }

    //delete button for Student
    @RequestMapping("deleteStudent")

    public ModelAndView deleteStudent(@RequestParam("id") int id)
    {
        //temp will store info for object we want to delete
        StudentEntity temp = new StudentEntity();
        temp.setStudentId(id);


        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");

        SessionFactory sessionFactory = cfg.buildSessionFactory();

        Session selectStudent = sessionFactory.openSession();

        selectStudent.beginTransaction();

        selectStudent.delete(temp);//delete the object from the list
        selectStudent.getTransaction().commit(); //deleted one row

        ArrayList<StudentEntity> studentList = getStudent();

        return new
                ModelAndView("student","cList",studentList);
    }

    @RequestMapping("addStudent")

    public ModelAndView addStaff(@ModelAttribute StudentEntity newStudent) {

        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");

        SessionFactory sessionFactory = cfg.buildSessionFactory();

        Session selectStudent = sessionFactory.openSession();

        selectStudent.beginTransaction();

        selectStudent.save(newStudent);//saves the new student to the list
        selectStudent.getTransaction().commit();

        ArrayList<StudentEntity> studentList = getStudent();

        return new
                ModelAndView("student","cList",studentList);
    }

    @RequestMapping("listStaff")
    public ModelAndView listStaff() {
        Configuration cfg = new
                Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFact = cfg.buildSessionFactory();
        Session selectStaff = sessionFact.openSession();
        selectStaff.beginTransaction();
        Criteria c =
                selectStaff.createCriteria(StaffEntity.class);
        ArrayList<StaffEntity>
                staffList = (ArrayList<StaffEntity>) c.list();
        return new
                ModelAndView("staff", "cList", staffList);
    }

    public ArrayList<StaffEntity> getStaff() {
        Configuration cfg = new
                Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFact = cfg.buildSessionFactory();
        Session selectStaff = sessionFact.openSession();
        selectStaff.beginTransaction();
        Criteria c =
                selectStaff.createCriteria(StaffEntity.class);
        ArrayList<StaffEntity>
                staffList = (ArrayList<StaffEntity>) c.list();

        return staffList;
    }



    //delete button for Staff
    @RequestMapping("deleteStaff")

    public ModelAndView deleteStaff(@RequestParam("id") int id)
    {
        //temp will store info for object we want to delete
        StaffEntity temp = new StaffEntity();
        temp.setStaffId(id);


        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");

        SessionFactory sessionFactory = cfg.buildSessionFactory();

        Session selectStaff = sessionFactory.openSession();

        selectStaff.beginTransaction();

        selectStaff.delete(temp);//delete the object from the list
        selectStaff.getTransaction().commit(); //deleted one row

        ArrayList<StaffEntity> staffList = getStaff();

        return new
                ModelAndView("staff","cList",staffList);
    }

    @RequestMapping("addStaff")

    public ModelAndView addStaff(@ModelAttribute StaffEntity newStaff) {

        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");

        SessionFactory sessionFactory = cfg.buildSessionFactory();

        Session selectStaff = sessionFactory.openSession();

        selectStaff.beginTransaction();

        selectStaff.save(newStaff);//delete the object from the list
        selectStaff.getTransaction().commit(); //deleted one row

        ArrayList<StaffEntity> staffList = getStaff();

        return new
                ModelAndView("staff","cList",staffList);
    }

    @RequestMapping("listPerson")
    public ModelAndView listPerson() {
        Configuration cfg = new
                Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFact = cfg.buildSessionFactory();
        Session selectPerson = sessionFact.openSession();
        selectPerson.beginTransaction();
        Criteria c =
                selectPerson.createCriteria(PersonEntity.class);
        ArrayList<PersonEntity>
                personList = (ArrayList<PersonEntity>) c.list();
        return new
                ModelAndView("person", "cList", personList);
    }

    public ArrayList<PersonEntity> getPerson() {
        Configuration cfg = new
                Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFact = cfg.buildSessionFactory();
        Session selectPerson = sessionFact.openSession();
        selectPerson.beginTransaction();
        Criteria c =
                selectPerson.createCriteria(PersonEntity.class);
        ArrayList<PersonEntity>
                personList = (ArrayList<PersonEntity>) c.list();

        return personList;
    }



    //delete button for Person
    @RequestMapping("delete")

    public ModelAndView deletePerson(@RequestParam("id") String name)
    {
        //temp will store info for object we want to delete
        PersonEntity temp = new PersonEntity();
        temp.setName(name);

        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");

        SessionFactory sessionFactory = cfg.buildSessionFactory();

        Session selectPerson = sessionFactory.openSession();

        selectPerson.beginTransaction();

        selectPerson.delete(temp);//delete the object from the list
        selectPerson.getTransaction().commit(); //deleted one row

        ArrayList<PersonEntity> personList = getPerson();

        return new
                ModelAndView("person","cList",personList);
    }

    @RequestMapping("addPerson")

    public ModelAndView addPerson(@ModelAttribute PersonEntity newPerson) {

        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");

        SessionFactory sessionFactory = cfg.buildSessionFactory();

        Session selectPerson = sessionFactory.openSession();

        selectPerson.beginTransaction();

        selectPerson.save(newPerson);//delete the object from the list
        selectPerson.getTransaction().commit(); //deleted one row

        ArrayList<PersonEntity> personList = getPerson();

        return new
                ModelAndView("person","cList",personList);


    }

    @RequestMapping("/")

    public ModelAndView helloWorld() {
        return new
                ModelAndView("welcome", "message", "Hello World");

    }

    @RequestMapping("welcome")

    public ModelAndView helloWorld2() {   //int [] ar = {1,2,3,4};
        return new
                ModelAndView("person", "message", "testing");

    }




/*    @RequestMapping("person")
    public ModelAndView Person(Model model) {
        Person p1 = new Person("Antonella", "1570 Woodward");
        Person p2 = new Person("Vicky", "1001 Woodward");
        Person p3 = new Person("David", "13146 Observatory");
        Person p4 = new Person("Kenneth", "63456 Division");
        Person p5 = new Person("Frances", "82 Marble Arch");
        Person p6 = new Person("Raymond", "23789 Chandler Rd.");
        Person p7 = new Person("Rex", "478 Tillerson");

        model.addAttribute("p2", p2.toString());
        model.addAttribute("p3", p3.toString());
        model.addAttribute("p4", p4.toString());
        model.addAttribute("p5", p5.toString());
        model.addAttribute("p6", p6.toString());
        model.addAttribute("p7", p7.toString());


        String info = p1.getName() + " " + p1.getAddress();
        return new
                ModelAndView("person", "message", info);

    }*/
/*

    @RequestMapping("student")
    public ModelAndView Student(Model model) {
        Student s1 = new Student("Antonella", "1570 Woodward", "Advanced Java Bootcamp", 2017, 900.00);
        Student s2 = new Student("Vicky", "1001 Woodward", "Java Fundamentals", 2017, 300.00);
        Student s3 = new Student("David", "13146 Observatory", "Java Bootcamp", 2017, 700.00);
        Student s4 = new Student("Kenneth", "63456 Division", "Java Bootcamp", 2017, 700.00);
        Student s5 = new Student("Frances", "82 Marble Arch", "Java Bootcamp", 2017, 700.00);
        Student s6 = new Student("Raymond", "23789 Chandler Rd.", "Advanced Java Bootcamp", 2017, 900.00);
        Student s7 = new Student("Rex", "478 Tillerson", "Advanced Java Bootcamp", 2017, 900.00);

        model.addAttribute("s2", s2.toString() + " " + s2.getYear() + " " + s2.getFee());
        model.addAttribute("s3", s3.toString() + " " + s3.getYear() + " " + s3.getFee());
        model.addAttribute("s4", s4.toString() + " " + s4.getYear() + " " + s4.getFee());
        model.addAttribute("s5", s5.toString() + " " + s5.getYear() + " " + s5.getFee());
        model.addAttribute("s6", s6.toString() + " " + s6.getYear() + " " + s6.getFee());
        model.addAttribute("s7", s7.toString() + " " + s7.getYear() + " " + s7.getFee());

        String info = s1.getName() + " " + s1.getAddress() + " " + s1.getProgram() + " " + s1.getYear() + " " + s1.getFee();
        return new
                ModelAndView("student", "message", info);  //when info is removed, Antonella will not appear in the output

    }
*/

/*
    @RequestMapping("staff")
    public ModelAndView Staff(Model model) {
        Staff t1 = new Staff("Robert Redford", "123 Sundance Trail", "Grand Circus", 8453.22);
        Staff t2 = new Staff("Marie Currie", "54 Rue de Radiant", "Institute de Currie", 12453.22);
        Staff t3 = new Staff("Lilly Munster", "1313 Mockingbird Ln.", "Grand Circus", 5681.54);

        model.addAttribute("t2", t2.toString() + " " + t2.getPay());
        model.addAttribute("t3", t3.toString() + " " + t3.getPay());

        String info = t1.getName() + " " + t1.getAddress() + " " + t1.getSchool() + " " + t1.getPay();
        return new
                ModelAndView("staff", "message", info);

    }

*/

}
