package com.max.miniproject.controller;

import com.max.miniproject.domin.Student;
import com.max.miniproject.repository.StudentRepository;
import com.max.miniproject.service.JobLaunchService;
import com.max.miniproject.service.StudentService;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Controller
public class MainController {


    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String main() {
//        jobLaunchService.launchJob();
//        studentService.save(new Student("max", "li", 4.0, 26));
//        JobParametersBuilder jobParameters =   new JobParametersBuilder()
//                .addDate("executeDate", new Da()).toJobParameters();
//        System.out.println();
        return "main";
    }
}
