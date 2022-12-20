package com.example.HadithAPISpringBoot.Models;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
public class HadithId implements Serializable {
    private String hadithBook;
    private int number;
}
