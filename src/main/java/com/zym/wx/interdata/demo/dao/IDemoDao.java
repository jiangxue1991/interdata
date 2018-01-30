package com.zym.wx.interdata.demo.dao;

import com.zym.wx.interdata.util.MyMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IDemoDao extends MyMapper<String>{
    List<String> getCityName();

    List<String> getData(String column);
}
