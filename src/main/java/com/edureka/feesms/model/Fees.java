package com.edureka.feesms.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table
public @Data class Fees {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long feesId;

    @Column
    private double amount;

    @Column
    private long studentId;

    @Column
    @Temporal(TemporalType.DATE)
    private LocalDate feeDate;
}
