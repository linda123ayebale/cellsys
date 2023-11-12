package com.cell.cellsys.models.usermodels;

import com.cell.cellsys.models.BaseEntity;
import com.cell.cellsys.models.User;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class CellLeader extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @OneToOne
    private User user;
}
