package xin.zcglory.service;

import xin.zcglory.entity.People;

import java.util.List;

public interface PeopleService {
    void add(People people);
    void delete(String id);
    People findByid(String id);
    void update(People people);
    List<People> findAll();
}
