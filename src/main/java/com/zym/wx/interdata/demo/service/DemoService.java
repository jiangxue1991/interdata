package com.zym.wx.interdata.demo.service;

import com.zym.wx.interdata.demo.dao.IDemoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("DemoService")
public class DemoService {
    @Autowired
    private IDemoDao dao;


    public List<String> getcityName() {
        return dao.getCityName();
    }

    public List<String> getData(String column) {
        return dao.getData(column);
    }
}
