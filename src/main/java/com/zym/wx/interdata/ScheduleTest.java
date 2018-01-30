package com.zym.wx.interdata;

import com.zym.wx.interdata.interceptor.MyConstant;
import com.zym.wx.interdata.interceptor.MyInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleTest {

    Logger logger= LoggerFactory.getLogger(ScheduleTest.class);

    @Scheduled(cron = "0/1 * * * * *")
    public void testTask(){
        int random=(int)(Math.random()*10);
        int random2=(int)(Math.random()*10);
        MDC.put("IP", MyConstant.IPS[random]);
        MDC.put("REQ",MyConstant.REQS[random2]);
        logger.error("wo 发了一个请求~~"+(random+random2));
    }
}
