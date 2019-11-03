package com.max.miniproject.batchprocessing;

import com.max.miniproject.domin.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class StudentItemProcessor implements ItemProcessor<Student, Student> {
    private static final Logger log = LoggerFactory.getLogger(StudentItemProcessor.class);

    @Override
    public Student process(final Student person) throws Exception {

        log.info("Converting (" + person + ") into  ");

        person.transfer();

        return person;
    }
}
