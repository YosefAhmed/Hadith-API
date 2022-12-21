package com.example.HadithAPISpringBoot.Services;

import com.example.HadithAPISpringBoot.Models.HadithModel;
import com.example.HadithAPISpringBoot.Repositories.HadithRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class HadithService {

    @Autowired
    private HadithRepo hadithRepo;

    public Iterable<HadithModel> saveHadith(List<HadithModel> hadithList){
       return hadithRepo.saveAll(hadithList);
    }


    public Iterable<Map<String, Integer>> getAllHadithBooks() {
        return hadithRepo.findAllHadithBooks();
    }

    public Iterable<HadithModel> getHadithBook(String hadithBook) {
        return hadithRepo.findHadithBook(hadithBook);
    }

    public Iterable<HadithModel> getHadithByNumber(int hadithNumber) {
        return hadithRepo.findAllByNumber(hadithNumber);
    }

    public Iterable<HadithModel> getHadithByBookAndNumber(String hadithBook, int hadithNumber) {
        return hadithRepo.findHadithByBookAndNumber(hadithBook, hadithNumber);
    }

    public Iterable<HadithModel> getRangeFromBook(String hadithBook, int startNumber, int endNumber) {
        return hadithRepo.findRangeFromBook(hadithBook,startNumber, endNumber);
    }

//    public Iterable<HadithModel> getHadithByKeyword(String keyword) {
//        return hadithRepo.findHadithByKeyword(keyword);
//    }
}
