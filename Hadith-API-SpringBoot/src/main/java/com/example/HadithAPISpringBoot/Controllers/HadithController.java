package com.example.HadithAPISpringBoot.Controllers;

import com.example.HadithAPISpringBoot.Models.HadithModel;
import com.example.HadithAPISpringBoot.Services.HadithService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hadith-books")
public class HadithController {

    @Autowired
    private HadithService hadithService;

    @GetMapping
    public Iterable<HadithModel> getAllHadith(){
       return hadithService.getHadithList();
    }
}
