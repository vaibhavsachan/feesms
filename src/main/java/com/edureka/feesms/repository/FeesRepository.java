package com.edureka.feesms.repository;

import com.edureka.feesms.model.Fees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FeesRepository extends JpaRepository<Fees, Long> {
    public List<Fees> findByStudentId(long student_id);
}
