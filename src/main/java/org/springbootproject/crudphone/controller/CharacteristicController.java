package org.springbootproject.crudphone.controller;

import org.springbootproject.crudphone.entity.Characteristic;
import org.springbootproject.crudphone.service.CharacteristicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CharacteristicController {

    @Autowired
    private CharacteristicService characteristicService;

    @GetMapping("/characteristics")
    public List<Characteristic> findAll() {
        return characteristicService.findAll();
    }

    @GetMapping("/characteristics/{characteristicId}")
    public Characteristic findById(@PathVariable int characteristicId) {
        Characteristic characteristic = characteristicService.findById(characteristicId);

        if (characteristic == null) {
            throw new RuntimeException("Characteristic id not found - " + characteristicId);
        }

        return characteristic;
    }

    @PostMapping("/characteristics")
    public Characteristic save(@RequestBody Characteristic characteristic) {
        characteristic.setId(0);
        characteristicService.save(characteristic);

        return characteristic;
    }

    @PutMapping("/characteristics")
    public Characteristic update(@RequestBody Characteristic characteristic) {
        characteristicService.save(characteristic);

        return characteristic;
    }

    @DeleteMapping("/characteristics/{characteristicId}")
    public String delete(@PathVariable int characteristicId) {
        Characteristic characteristic = characteristicService.findById(characteristicId);

        if (characteristic == null) {
            throw new RuntimeException("Characteristic id not found - " + characteristicId);

        }

        characteristicService.delete(characteristicId);

        return "Deleted characteristic with id - " + characteristicId;
    }

}
