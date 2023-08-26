package com.horseman.backend_xyz.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.horseman.backend_xyz.model.DataModel;
import com.horseman.backend_xyz.service.HService;

//@RestController indicates that the data returned by each method will be written straight into the response body instead of rendering a template.
@RestController
@CrossOrigin
@RequestMapping("horseman")
public class Controller {

    @Autowired
    HService service;

    @GetMapping("all-data")
    public List<DataModel> getAllData() {
        return service.getAllData();
    }

    @GetMapping("byId/{id}")
    public Optional<DataModel> getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @PostMapping("add")
    public String addData(@RequestBody DataModel data) {
        return service.addData(data);
    }

    @PutMapping("update")
    public String update(@RequestBody DataModel data) {
        // System.out.println(data.getId());
        return service.update(data.getId(), data.getInvoiceAmount());
    }

    @DeleteMapping("delete/{id}")
    public String remove(@PathVariable Integer id) {
        return service.removeAccount(id);
    }
}
