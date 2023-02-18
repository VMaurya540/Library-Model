package com.geekster.LibraryModel.controller;


import com.geekster.LibraryModel.model.Library;
import com.geekster.LibraryModel.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/lib-management")
public class LibraryController {

    @Autowired
public LibraryService libraryService;

@GetMapping(value = "/all-library")
    public List<Library>allLibrary(){
return LibraryService.allLibrary();
}

@GetMapping(value = "/search-library-by-name")
public void searchLibraryByName(@PathVariable ("name") String name){
    LibraryService.searchLibraryByName(name);
}



@PostMapping(value = "/add-library")
public void aadLibrary(@PathVariable Library library){
LibraryService.addLibrary(library);

}

@PutMapping(value = "/update-library/{name}")
    public Library updateLibrary(@RequestBody Library library,@PathVariable ("name") String name){
LibraryService.updateLibrary(library,name);

    return library;
}

    @DeleteMapping(value = "/deleted-library-details/{name}")
    public static void deleteStudentDetails(@PathVariable("name") String name){
        LibraryService.deleteStudentDetails(name);
    }

}
