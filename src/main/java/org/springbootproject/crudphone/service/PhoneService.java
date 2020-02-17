package org.springbootproject.crudphone.service;

import org.springbootproject.crudphone.entity.Phone;

import java.util.List;

public interface PhoneService {

    List<Phone> findAll();

    Phone findById(int id);

    void save(Phone phone);

    void delete(int id);
}
