package org.springbootproject.crudphone.service;

import org.springbootproject.crudphone.entity.Characteristic;

import java.util.List;

public interface CharacteristicService {

    List<Characteristic> findAll();

    Characteristic findById(int id);

    void save(Characteristic characteristic);

    void delete(int id);
}
