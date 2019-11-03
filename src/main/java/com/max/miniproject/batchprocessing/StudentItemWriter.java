package com.max.miniproject.batchprocessing;

import com.max.miniproject.domin.Student;
import com.max.miniproject.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentItemWriter implements ItemWriter<Student> {
    private static final Logger log = LoggerFactory.getLogger(StudentItemWriter.class);

    @Autowired
    private StudentService studentService;

    @Override
    public void write(List<? extends Student> list) throws Exception {
        log.info("start save into database");

        studentService.saveAllStudents(list);
    }
}
