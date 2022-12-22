package com.example.HadithAPISpringBoot.Controllers;

import com.example.HadithAPISpringBoot.Models.HadithBook;
import com.example.HadithAPISpringBoot.Models.HadithModel;
import com.example.HadithAPISpringBoot.Services.HadithService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
@RequestMapping("/hadith-books")
public class HadithController {

    @Autowired
    private HadithService hadithService;

    @GetMapping
    public String getAllHadithBooks(Model model){
        List<HadithBook> hadithBooks = new ArrayList<HadithBook>();
        for (Map hadithMap :
                hadithService.getAllHadithBooks()) {
            System.out.println(hadithMap.get("hadith_book")+"  "+hadithMap.get("number_of_hadiths"));
            hadithBooks.add(new HadithBook((String) hadithMap.get("hadith_book"), (Long) hadithMap.get("number_of_hadiths")));
        }
        model.addAttribute("hadithBooks", hadithBooks);
        return "hadith-books";
    }

    @GetMapping("/{hadithBook}")
    public String getHadithBookByName(@PathVariable String hadithBook,
                                                     @RequestParam(defaultValue = "0", required = false)int offset,
                                                     @RequestParam int numberOfHadiths,
                                                     Model model){
        List<HadithModel> hadithList = (List<HadithModel>) hadithService.getHadithBook(hadithBook, offset);
        model.addAttribute("bookName", hadithBook);
        model.addAttribute("hadithList", hadithList);
        model.addAttribute("numberOfHadiths", numberOfHadiths);
        model.addAttribute("offset", offset);
        return "book";
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
        /hadith/{hadithBook}/?range={startNumber}:{endNumber}&?offset={offset}
     */
    @GetMapping("/hadith/{hadithBook}/")
    public Iterable<HadithModel> getRangeFromBook(@PathVariable String hadithBook,
                                                  @RequestParam String range,
                                                  @RequestParam(defaultValue = "0", required = false)int offset){
        String[] rangeNumbers = range.split(":");
        int startNumber = Integer.parseInt(rangeNumbers[0]), endNumber = Integer.parseInt(rangeNumbers[1]);
        return hadithService.getRangeFromBook(hadithBook,startNumber, endNumber, offset);
    }

//    @GetMapping("/hadith/search/{keyword}")
//    public Iterable<HadithModel> getHadithByKeyword(@PathVariable String keyword){
//        return hadithService.getHadithByKeyword(keyword);
//    }
}
