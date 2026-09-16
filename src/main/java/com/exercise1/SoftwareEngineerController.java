package com.exercise1;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {

    public final SoftwareEngineerService softwareEngineerService;

    public SoftwareEngineerController(SoftwareEngineerService softwareEngineerService) {
        this.softwareEngineerService = softwareEngineerService;
    }

    //@DeleteMapping for deleting
    //@PostMapping for posting

    @GetMapping  // FOR RETRIEVE
    public List<SoftwareEngineer> getEngineers(){
        return softwareEngineerService.getAllSoftwareEngineer();
    }

    @GetMapping("{id}")  // FOR RETRIEVE by Id
    public SoftwareEngineer getEngineerById(@PathVariable Integer id){
        return softwareEngineerService.getSoftwareEngineerById(id);
    }

    @PostMapping // INSERT
    public void addNewSoftwareEngineer(
            @RequestBody SoftwareEngineer softwareEngineer
    ){
        softwareEngineerService.insertSoftwareEngineer(softwareEngineer);
    }

    @DeleteMapping("/{id}") //DELETE
    public void deleteSoftwareEngineerById(@PathVariable Integer id){
        softwareEngineerService.deleteSoftwareEngineerById(id);
    }
}
