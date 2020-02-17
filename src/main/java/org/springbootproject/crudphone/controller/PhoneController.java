package org.springbootproject.crudphone.controller;

import org.springbootproject.crudphone.entity.Phone;
import org.springbootproject.crudphone.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PhoneController {

    @Autowired
    private PhoneService phoneService;


    @GetMapping("/phones")
    public List<Phone> findAll() {
        return phoneService.findAll();
    }

    @GetMapping("/phones/{phoneId}")
    public Phone findById(@PathVariable int phoneId) {
        Phone phone = phoneService.findById(phoneId);

        if (phone == null) {
            throw new RuntimeException("Phone id not found - " + phoneId);
        }

        return phone;
    }

    @PostMapping("/phones")
    public Phone save(@RequestBody Phone phone) {
        phone.setId(0);
        phoneService.save(phone);

        return phone;
    }

    @PutMapping("/phones")
    public Phone update(@RequestBody Phone phone) {
        phoneService.save(phone);

        return phone;
    }

    @DeleteMapping("/phones/{phoneId}")
    public String delete(@PathVariable int phoneId) {
        Phone phone = phoneService.findById(phoneId);

        if (phone == null) {
            throw new RuntimeException("Phone id not found - " + phoneId);
        }

        phoneService.delete(phoneId);

        return "Deleted phone with id - " + phoneId;
    }

}
