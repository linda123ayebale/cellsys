package com.cell.cellsys.models.Roles;

import com.cell.cellsys.models.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data

public class Permissions extends BaseEntity {

    private String name;

    private  String description;
    @Id
    private Long id;


}
