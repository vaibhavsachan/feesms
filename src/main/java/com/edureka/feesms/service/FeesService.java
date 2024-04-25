package com.edureka.feesms.service;

import com.edureka.feesms.model.Fees;
import com.edureka.feesms.repository.FeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeesService {

    @Autowired
    private FeesRepository feesRepository;

    //get a fees by Student
    public List<Fees> getFees(long id){ return feesRepository.findByStudentId(id);
    }

    //pay a student fee
    public void payFees(Fees fee){ feesRepository.save(fee);}

}
