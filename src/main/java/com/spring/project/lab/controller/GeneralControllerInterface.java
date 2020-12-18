package com.spring.project.lab.controller;

import com.spring.project.lab.service.GeneralServiceInterface;

import java.util.List;

public interface GeneralControllerInterface<T> {
    GeneralServiceInterface<T> getService();
    List<T> findAll();
    T findById(Integer id);
    void create(T t);
    void update(Integer id, T t);
    void delete(Integer id);
}
