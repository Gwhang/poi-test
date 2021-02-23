package com.example.poitest.dao;

import com.example.poitest.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PoiTestDao {

     List<User> getAll();

}
