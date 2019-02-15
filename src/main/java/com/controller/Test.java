package com.controller;

import com.dao.MyBatisDaoTest;
import com.dao.Test1Dao;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping(value = "/test")
public class Test {
    @Resource(name = "test1Dao")
    private Test1Dao test1Dao;
    @RequestMapping(value = "/hTest", method = RequestMethod.GET)
    @ResponseBody
    public void listClusters(HttpServletRequest request, HttpServletResponse response) { ;
        String result;
        try {
            test1Dao.update(null);
        } catch (Exception e) {

        }

    }
    @RequestMapping( value = "mTest", method = RequestMethod.GET)
    @ResponseBody
    public void myBatisTest(HttpServletRequest request, HttpServletResponse response) { ;
        String result;
        try {
            MyBatisDaoTest test = new MyBatisDaoTest();
           test.test();
        } catch (Exception e) {

        }

    }



}
