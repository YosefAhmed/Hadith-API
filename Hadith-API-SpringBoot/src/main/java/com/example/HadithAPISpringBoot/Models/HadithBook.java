package com.example.HadithAPISpringBoot.Models;


import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class HadithBook {
    String bookName;
    List<HadithModel> hadithList;

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setHadithList(List<HadithModel> hadithList) {
        for (HadithModel hadith :
                hadithList) {
            hadith.setHadithBook(this.bookName);
        }
        this.hadithList = hadithList;
    }

}