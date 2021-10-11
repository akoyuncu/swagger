package com.kync.swagger;

import com.kync.swagger.model.Student;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class OperationService {


    public List<Student> createStudentList(int size) {

        List<Student> rawData= new LinkedList<>();

        Student st =new Student();

        st.setStundetId(1L);
        st.setStudentName("Ahmet");
        st.setStudentSurname("Koyuncu");

        rawData.add(st);

        return rawData;

    }

}
