package com.example.HadithAPISpringBoot.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
@IdClass(HadithId.class)
public class HadithModel {
    @Id
    int number;
    @Id
    String hadithBook;
    @Column(columnDefinition = "TEXT")
    @Lob
    String id;
    @Column(columnDefinition = "TEXT")
    @Lob
    String arab;
}