package com.example.HadithAPISpringBoot.Repositories;

import com.example.HadithAPISpringBoot.Models.HadithModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HadithRepo extends JpaRepository<HadithModel,String> {
}
