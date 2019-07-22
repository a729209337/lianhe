package com.lx.mapper;

import com.lx.pojo.Pet;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PetMapper {
    List<Pet> showAllPet();

    List<Pet> showAllDog();

    List<Pet> showAllCat();

    Pet showOnePet(int id);

    List<Pet> search(String petName);

    List<Pet> searchByCondition(Pet pet);
}
