package com.horseman.backend_xyz.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.horseman.backend_xyz.dao.Dao;
import com.horseman.backend_xyz.model.DataModel;

@Service
public class HService {

    @Autowired
    private Dao dao;

    public List<DataModel> getAllData() {
        return dao.findAll();
    }

    public Optional<DataModel> getById(Integer id) {
        return dao.findById(id);
    }

    public String addData(DataModel data) {
        try {
            dao.save(data);
            return "SUCCESS";
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
            return "FAILED";
        }
    }

    public String update(Integer id, Integer data) {
        try {
            DataModel existDataModel = dao.findById(id).get();
            existDataModel.setInvoiceAmount(data);
            dao.save(existDataModel);
            return "Updated....";
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
            return "UPDATE-FAILED";
        }
    }

    public String removeAccount(Integer id) {
        try {
            dao.deleteById(id);
            return "ACCOUNT DELETED";
        } catch (Exception e) {
            return e.getStackTrace().toString();
        }
    }

}
