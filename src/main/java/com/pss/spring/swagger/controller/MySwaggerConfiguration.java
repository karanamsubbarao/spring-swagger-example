package com.pss.spring.swagger.controller;

import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by skaranam on 3/16/2015.
 */
@Configuration
@EnableWebMvc
@ComponentScan
public class MySwaggerConfiguration extends WebMvcAutoConfiguration {
}
