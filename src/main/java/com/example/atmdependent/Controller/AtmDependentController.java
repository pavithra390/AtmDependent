package com.example.atmdependent.Controller;

import com.example.atmdependent.Entity.AtmDependentDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class AtmDependentController {
    @Autowired
    RestTemplate restTemplate;
    @PostMapping("/adding/record")
    //http://localhost:2009/adding/record
    public String addingOneRecord(@RequestBody AtmDependentDetails atmDependentDetails) {
        String url="http://localhost:1991/adding/onerecord";
        //RestTemplate restTemplate = new RestTemplate();
        restTemplate.postForEntity(url,atmDependentDetails,String.class);
        return "Atm Record Added Successfully";
    }
    @PostMapping("/adding/allrecords")
    //http://localhost:2009/adding/allrecords
    public String addingAllRecords(@RequestBody Iterable<AtmDependentDetails> atmDependentDetails) {
        String url="http://localhost:1991/adding/allrecords";
        //RestTemplate restTemplate = new RestTemplate();
        restTemplate.postForEntity(url,atmDependentDetails,String.class);
        return "Atm Records Added Successfully";
    }
    @GetMapping("/getting/onerecord/{atm_id}")
    //http://localhost:2009/getting/onerecord/7
    public AtmDependentDetails gettingOneRecord(@PathVariable("atm_id")int id) {
        String url="http://localhost:1991/getting/onerecord/"+id;
        //RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url,AtmDependentDetails.class);
    }
    @GetMapping("/getting/allrecords")
    //http://localhost:2009/getting/allrecords
    public Iterable<AtmDependentDetails>gettingAllRecords() {
        String url="http://localhost:1991/getting/allrecords";
        //RestTemplate restTemplate = new RestTemplate();
        List<AtmDependentDetails> ls=List.of(restTemplate.getForObject(url,AtmDependentDetails[].class));
        return ls;
    }
    @DeleteMapping("/deleting/onerecord/{atm_id}")
    //http://localhost:2009/deleting/onerecord/7
    public String deletingOneRecord(@PathVariable("atm_id")int id) {
        String url="http://localhost:1991/delete/onerecord/"+id;
        //RestTemplate restTemplate = new RestTemplate();
         restTemplate.delete(url);
         return "Atm Record Deleted Successfully";
    }
    @DeleteMapping("/deleting/allrecords")
    //http://localhost:2009/deleting/allrecords
    public String deletingAllRecords() {
        String url="http://localhost:1991/delete/allrecords";
        //RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete(url);
        return "All records Deleted Successfully";
    }


}
