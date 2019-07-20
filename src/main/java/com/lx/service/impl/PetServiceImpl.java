package com.lx.service.impl;

import com.lx.mapper.PetMapper;
import com.lx.pojo.Pet;
import com.lx.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PetServiceImpl implements PetService {

    @Autowired
    PetMapper petMapper;

    @Override
    public List<Pet> showAllPet() {
        List<Pet> petList = petMapper.showAllPet();
        return petList;
    }

    @Override
    public List<Pet> showAllDog() {
        List<Pet> dogList = petMapper.showAllDog();
        return dogList;
    }

    @Override
    public List<Pet> showAllCat() {
        List<Pet> catList = petMapper.showAllCat();
        return catList;
    }

    @Override
    public Pet showOnePet(int id) {
        Pet pet = petMapper.showOnePet(id);
        return pet;
    }

    @Override
    public List<Pet> search(String petName) {
        return petMapper.search(petName);
    }
}
