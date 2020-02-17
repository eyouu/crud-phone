package org.springbootproject.crudphone.dao;

import org.springbootproject.crudphone.entity.Phone;

import java.util.List;

public interface PhoneDAO {

    List<Phone> findAll();

    Phone findById(int id);

    void save(Phone phone);

    void delete(int id);
}
