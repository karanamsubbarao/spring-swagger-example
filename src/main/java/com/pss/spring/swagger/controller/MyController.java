package com.pss.spring.swagger.controller;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by skaranam on 3/28/2015.
 */

@RestController
@RequestMapping("/rest")
@Api(value="/rest",description = "Swagger Online Documentation")
public class MyController {

    @RequestMapping(value="/hello", method= RequestMethod.GET)
    @ApiOperation(httpMethod = "GET", value = "Fetches the Hello World", produces ="application/json" )
    public @ResponseBody String helloWorld()
    {
        return "hello world";
    }

}


