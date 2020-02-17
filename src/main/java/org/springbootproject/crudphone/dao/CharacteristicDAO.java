package org.springbootproject.crudphone.dao;

import org.springbootproject.crudphone.entity.Characteristic;

import java.util.List;

public interface CharacteristicDAO {

    List<Characteristic> findAll();

    Characteristic findById(int id);

    void save(Characteristic characteristic);

    void delete(int id);

}
