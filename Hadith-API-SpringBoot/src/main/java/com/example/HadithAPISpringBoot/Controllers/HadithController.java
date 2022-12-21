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

    @GetMapping("/{hadithBook}")
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

    /*
        /hadith/{hadithBook}/range?={startNumber}:{endNumber}
     */
    @GetMapping("/hadith/{hadithBook}/")
    public Iterable<HadithModel> getRangeFromBook(@PathVariable String hadithBook,
                                                  @RequestParam String range){
        String[] rangeNumbers = range.split(":");
        int startNumber = Integer.parseInt(rangeNumbers[0]), endNumber = Integer.parseInt(rangeNumbers[1]);
        return hadithService.getRangeFromBook(hadithBook,startNumber, endNumber);
    }

//    @GetMapping("/hadith/search/{keyword}")
//    public Iterable<HadithModel> getHadithByKeyword(@PathVariable String keyword){
//        return hadithService.getHadithByKeyword(keyword);
//    }
}
