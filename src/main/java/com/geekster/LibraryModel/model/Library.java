package com.geekster.LibraryModel.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Library {

    private String libraryName;

    private String libraryAddress;

    private String libraryNumber;

    private  int libraryFaculty;
}
