package com.example.HadithAPISpringBoot.Repositories;

import com.example.HadithAPISpringBoot.Models.HadithModel;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface HadithRepo extends JpaRepository<HadithModel,String> {
    @Modifying
    @Transactional
    @Query(value="select hadith_book, COUNT(number) as number_of_hadiths from hadith_model GROUP BY hadith_book", nativeQuery=true)
    Iterable<Map<String, Integer>> findAllHadithBooks();

    @Modifying
    @Transactional
    @Query(value = "select * from hadith_model where hadith_book = :hadithBook", nativeQuery = true)
    Iterable<HadithModel> findHadithBook(String hadithBook);
    @Modifying
    @Transactional
    @Query(value = "select * from hadith_model where number = :hadithNumber", nativeQuery = true)
    Iterable<HadithModel> findAllByNumber(int hadithNumber);

    @Modifying
    @Transactional
    @Query(value = "select * from hadith_model where hadith_book= :hadithBook AND number = :hadithNumber", nativeQuery = true)
    Iterable<HadithModel> findHadithByBookAndNumber(String hadithBook, int hadithNumber);

//    @Modifying
//    @Transactional
//    @Query(value = "select * from hadith_model where arab LIKE '%:keyword%'", nativeQuery = true)
//    Iterable<HadithModel> findHadithByKeyword(String keyword);
}
