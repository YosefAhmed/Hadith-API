package com.example.HadithAPISpringBoot.Models;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class HadithBook {
    String bookName;
    long numberOfHadiths;
    List<HadithModel> hadithList;

    public HadithBook(String name, long numOfHadiths) {
        this.bookName = name;
        this.numberOfHadiths = numOfHadiths;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setHadithList(List<HadithModel> hadithList) {
        for (HadithModel hadith :
                hadithList) {
            hadith.setHadithBook(this.bookName);
        }
        setNumberOfHadiths(hadithList.size());
        this.hadithList = hadithList;
    }

}