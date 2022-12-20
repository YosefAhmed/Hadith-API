package com.example.HadithAPISpringBoot.Controllers;

import com.example.HadithAPISpringBoot.Models.HadithModel;
import com.example.HadithAPISpringBoot.Services.HadithService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/hadith-books")
public class HadithController {

    @Autowired
    private HadithService hadithService;

    @GetMapping
    public Iterable<Map<String, Integer>> getAllHadithBooks(){
        return hadithService.getAllHadithBooks();
    }

    @GetMapping("/book/{hadithBook}")
    public Iterable<HadithModel> getHadithBookByName(@PathVariable String hadithBook){
        return hadithService.getHadithBook(hadithBook);
    }

    @GetMapping("/hadith/{hadithNumber}")
    public Iterable<HadithModel> getHadithByNumber(@PathVariable int hadithNumber){
        return hadithService.getHadithByNumber(hadithNumber);
    }

    @GetMapping("/hadith/{hadithBook}/{hadithNumber}")
    public Iterable<HadithModel> getHadithByBookAndNumber(
            @PathVariable String hadithBook,
            @PathVariable int hadithNumber){
        return hadithService.getHadithByBookAndNumber(hadithBook, hadithNumber);
    }

//    @GetMapping("/hadith/search/{keyword}")
//    public Iterable<HadithModel> getHadithByKeyword(@PathVariable String keyword){
//        return hadithService.getHadithByKeyword(keyword);
//    }
}
