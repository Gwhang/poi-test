package com.example.poitest.service;

import com.example.poitest.dao.PoiTestDao;
import com.example.poitest.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PoiServices {

    @Autowired
    private PoiTestDao poiTestDao;

    public List<User> getAll(){
        return poiTestDao.getAll();
    }

}
