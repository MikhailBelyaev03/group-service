package com.example.group.impl.config;

import com.example.student.api.controller.StudentController;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(clients = {
    StudentController.class
})
public class FeignClientConfig {

}
