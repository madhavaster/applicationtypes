package com.agrisutra.rest;

import com.agrisutra.model.Service;
import com.agrisutra.repo.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/service")
public class ServiceRestController {
    @Autowired
    private ServiceRepository repository;

    @GetMapping("/all")
    public ResponseEntity<?> getAllServices(){
        List<Service> all = repository.findAll();
        return ResponseEntity.ok(all);
    }
}
