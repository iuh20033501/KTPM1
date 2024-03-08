package fit.iuh.edu.vn.springbootkt.controllers;

import fit.iuh.edu.vn.springbootkt.entities.Waterbill;
import fit.iuh.edu.vn.springbootkt.repositories.WaterBillRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WaterBillControllers {
    @Autowired
    private WaterBillRepositories waterBillRepositories;
    @GetMapping("/water_bill")
    List<Waterbill> getAllWaterBill() { return waterBillRepositories.findAll();
    }
    @GetMapping("/water_bill/{billID}") // get user by id
    Waterbill getWaterBillbyID(@PathVariable int id) { return waterBillRepositories.findById(String.valueOf(id)).get();
    }
}
