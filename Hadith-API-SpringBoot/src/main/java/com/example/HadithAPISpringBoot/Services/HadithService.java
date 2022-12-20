package com.example.HadithAPISpringBoot.Services;

import com.example.HadithAPISpringBoot.Models.HadithModel;
import com.example.HadithAPISpringBoot.Repositories.HadithRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HadithService {

    @Autowired
    private HadithRepo hadithRepo;

    public Iterable<HadithModel> getHadithList(){
        return hadithRepo.findAll();
    }
    public Iterable<HadithModel> saveHadith(List<HadithModel> hadithList){
       return hadithRepo.saveAll(hadithList);
    }


}
