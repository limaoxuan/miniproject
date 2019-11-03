package com.max.miniproject.service;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;

@Service
public class JobLaunchService {

    @Autowired
    private JobLauncher jobLauncher;


    @Autowired
    Job job;

    public void launchJob() {

        try {
            JobParameters jobParameters = new JobParametersBuilder()
                    .addDate("timestamp", Calendar.getInstance().getTime())
                    .toJobParameters();
            JobExecution jobExecution = jobLauncher.run(job, jobParameters);

            while (jobExecution.isRunning()) {
                System.out.println("...");
            }
        } catch (Exception e) {

            throw new RuntimeException("launch job exception ", e);
        }

    }
}
