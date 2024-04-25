package com.edureka.feesms.controller;

import com.edureka.feesms.model.Fees;
import com.edureka.feesms.service.FeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fees")
public class FeeController {

    @Autowired
    private FeesService feesService;

    @GetMapping("/student/{studentId}")
    private List<Fees> fetchFeesByStudent(@PathVariable long studentId){
        return feesService.getFees(studentId);
    }

    @PostMapping("/pay")
    private long feePayment(@RequestBody Fees fee){
        feesService.payFees(fee);
        return fee.getFeesId(); }

}
