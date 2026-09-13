package com.exercise1;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {


    //@DeleteMapping for deleting
    //@PostMapping for posting

    @GetMapping  // FOR RETRIEVE
    public List<SoftwareEngineer> getEngineers(){
        return List.of(
                new SoftwareEngineer(
                        1,
                        "Aime",
                        "js, java, react"
                ),

                new SoftwareEngineer(
                        2,
                        "Arson",
                        "python, java, TailwindCss"
                )
        );
    }
}
