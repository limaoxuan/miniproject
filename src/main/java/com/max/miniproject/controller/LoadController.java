package com.max.miniproject.controller;

import com.max.miniproject.domin.Student;
import com.max.miniproject.service.JobLaunchService;
import com.max.miniproject.service.StudentService;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoadController {
    @Autowired
    Job importJob;
    @Autowired
    JobLauncher jobLauncher;

    @Autowired
    private StudentService studentService;

    @Autowired
    private JobLaunchService jobLaunchService;

    @RequestMapping(value = "/load", method = RequestMethod.GET)
    public List<Student> main() {
        int size = studentService.findAllStu().size();
        if (size == 0) {
            jobLaunchService.launchJob();
        }

        return studentService.findAllStu();
    }
}
