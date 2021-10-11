package com.kync.swagger.controller;

import com.kync.swagger.OperationService;
import com.kync.swagger.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OperationController {

    @Autowired
    OperationService operationService;

    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = "application/json")
    public List<Student>  inquireAllStudents() {
        return operationService.createStudentList(1);
    }


    @RequestMapping(value = "/create", method = RequestMethod.POST, produces = "application/json")
    public List<Student>  createStudent(Student student) {
        return operationService.createStudentList(1);
    }
}
