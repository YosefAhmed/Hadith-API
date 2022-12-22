package com.example.HadithAPISpringBoot.Services;

import com.example.HadithAPISpringBoot.Models.HadithModel;
import com.example.HadithAPISpringBoot.Repositories.HadithRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
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

    public Iterable<HadithModel> getHadithBook(String hadithBook, int offset) {
        return hadithRepo.findHadithBook(hadithBook, PageRequest.of(offset, 20));
    }

    public Iterable<HadithModel> getHadithByNumber(int hadithNumber) {
        return hadithRepo.findAllByNumber(hadithNumber);
    }

    public Iterable<HadithModel> getHadithByBookAndNumber(String hadithBook, int hadithNumber) {
        return hadithRepo.findHadithByBookAndNumber(hadithBook, hadithNumber);
    }

    public Iterable<HadithModel> getRangeFromBook(String hadithBook, int startNumber, int endNumber, int offset) {
        return hadithRepo.findRangeFromBook(hadithBook,startNumber, endNumber, PageRequest.of(offset, 20));
    }

//    public Iterable<HadithModel> getHadithByKeyword(String keyword) {
//        return hadithRepo.findHadithByKeyword(keyword);
//    }
}
