package org.springbootproject.crudphone.service;

import org.springbootproject.crudphone.dao.PhoneDAO;
import org.springbootproject.crudphone.entity.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PhoneServiceImpl implements PhoneService {

    @Autowired
    private PhoneDAO phoneDAO;

    @Override
    @Transactional
    public List<Phone> findAll() {
        return phoneDAO.findAll();
    }

    @Override
    @Transactional
    public Phone findById(int id) {
        return phoneDAO.findById(id);
    }

    @Override
    @Transactional
    public void save(Phone phone) {
        phoneDAO.save(phone);
    }

    @Override
    @Transactional
    public void delete(int id) {
        phoneDAO.delete(id);
    }
}
