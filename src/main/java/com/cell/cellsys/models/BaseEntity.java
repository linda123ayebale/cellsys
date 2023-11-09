package com.cell.cellsys.models;

import com.cell.cellsys.models.constants.RecordStatus;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

import java.time.LocalDate;


@MappedSuperclass
@Data
public class BaseEntity {



    @ManyToOne
    @JoinColumn
    private User createdBy;

    @ManyToOne
    @JoinColumn
    private User changedBy;

    private LocalDate dateCreated;

    private LocalDate dateChanged;

    private RecordStatus recordStatus;










}
