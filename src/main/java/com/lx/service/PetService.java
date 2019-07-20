package com.lx.service;

import com.lx.pojo.Pet;

import java.util.List;

public interface PetService {
    List<Pet> showAllPet();

    List<Pet> showAllDog();

    List<Pet> showAllCat();

    Pet showOnePet(int id);

    List<Pet> search(String petName);
}
