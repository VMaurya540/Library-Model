package com.geekster.LibraryModel.service;


import com.geekster.LibraryModel.model.Library;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LibraryService {

private static List<Library>libraries=new ArrayList<>();
static {
    libraries.add(new Library("Digital Library","Prayagraj","75444665",5));
    libraries.add(new Library("Smart Library","Varansi","777888111",15));
    libraries.add(new Library("Student Library","Chandigarh","666222333",12));
    libraries.add(new Library("Public Library","Lucknow","888777555",10));
    libraries.add(new Library("Central Library","Delhi","999666333",11));
}

    public static List<Library> allLibrary() {
    return libraries;

    }

    public static String addLibrary(Library library) {
        Library librarie = null;
        libraries.add(librarie);
        return "Successfully Added";
    }


    public static String updateLibrary(Library library, String name) {
        for(Library library1:libraries) {
            System.out.println(library.getLibraryName()+" "+name);
            if(library.getLibraryName().equals(name)) {
                library.setLibraryName(library.getLibraryAddress());
                library.setLibraryAddress(library.getLibraryAddress());
                library.setLibraryNumber(library.getLibraryNumber());
                library.setLibraryFaculty(library.getLibraryFaculty());

                return "Successfully Updated";
            }
        }
        return "Not Found";
    }


    public static String deleteStudentDetails(String name) {

        for(Library library:libraries) {
            if(library.getLibraryName().equals(name)) {
                libraries.remove(name);
                return "Successfully Removed Library";
            }
        }
        return "Failed Due to Not Found";
    }

    public static Library searchLibraryByName(String name) {
        for(Library library:libraries) {
            if(library.getLibraryName().equals(name)) {
                return library;
            }
        }
        return null;
    }

    }


