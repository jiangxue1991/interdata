package com.zym.wx.interdata.demo.controller;

import com.zym.wx.interdata.common.httpdeal.ResponeDeal;
import com.zym.wx.interdata.demo.service.DemoService;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping(value="/")
public class DemoController {

    Logger logger= LoggerFactory.getLogger(DemoController.class);

    @Autowired
    private DemoService service;

    @RequestMapping(value="testDemo")
    public void testDemo(HttpServletRequest request, HttpServletResponse response){
        //List<String> resStr=service.getcityName();
        logger.error("我又发了一个请求！！");
        ResponeDeal.getInstance().sendResponseStr(response,"0","success!! do best!!");
    }

    @RequestMapping(value="testDemo22")
    public void testDemo2(HttpServletRequest request, HttpServletResponse response){
        String column="id,name";
        List<String> resStr=service.getData(column);
        ResponeDeal.getInstance().sendResponseData(response,"0","success",resStr);
    }

}
