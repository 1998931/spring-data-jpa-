package com.ganesh.mappingdemo;

import ch.qos.logback.classic.Logger;
import com.ganesh.mappingdemo.entity.Student;
import com.ganesh.mappingdemo.repository.StudentRepository;
import lombok.extern.flogger.Flogger;
import org.slf4j.ILoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MappingDemoApplication {


    public static void main(String[] args) {

        SpringApplication.run(MappingDemoApplication.class, args);



    }


}

