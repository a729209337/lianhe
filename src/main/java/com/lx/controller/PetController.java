package com.lx.controller;

import com.lx.pojo.Pet;
import com.lx.service.PetService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/animal")
@CrossOrigin
public class PetController {

    @Autowired
    PetService petService;

    /**
     * 展示所有动物信息
     * @return
     */
    @RequestMapping("/showAllPet")
    @ApiOperation(value = "展示所有动物的接口")
    public List<Pet> showAllPet(HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        List<Pet> petList =petService.showAllPet();
        return petList;
    }

    /**
     * 展示所有狗狗的信息
     * @return
     */
    @RequestMapping("/showAllDog")
    @ApiOperation(value = "展示所有狗狗的接口")
    public List<Pet> showAllDog(HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        List<Pet> dogList =petService.showAllDog();
        return dogList;
    }

    /**
     * 展示所有猫猫的信息
     * @return
     */
    @RequestMapping("/showAllCat")
    @ApiOperation(value = "展示所有猫猫的接口")
    public List<Pet> showAllCat(HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        List<Pet> catList =petService.showAllCat();
        return catList;
    }

    /**
     * 通过id查询某个动物的信息和对应商店的信息
     * @param id
     * @return
     */
    @RequestMapping("/showOnePet")
    @ApiOperation(value = "通过id查询某一个动物的信息和对应商店的信息")
    public Pet showOnePet(int id, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        Pet pet = petService.showOnePet(id);
        return pet;
    }

    /**
     * 通过name模糊查询所有对应的宠物
     * @param petName
     * @return
     */
    @RequestMapping("/search")
    @ApiOperation(value = "通过输入的字模糊查询对应的所有宠物")
    public List<Pet> search(String petName) {
        List<Pet> petList = petService.search(petName);
        return petList;
    }

    /**
     * 根据条件查询出符合条件的宠物
     * @param pet
     * @return
     */
    @RequestMapping("/searchByCondition")
    @ApiOperation(value = "根据条件查询出符合条件的宠物")
    public List<Pet> searchByCondition(Pet pet) {
        System.out.println(pet.getPetArea());
        System.out.println(pet.getPetPrice());
        List<Pet> petList = petService.searchByCondition(pet);
        return petList;
    }
}
