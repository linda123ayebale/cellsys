package com.cell.cellsys.models.Roles;

import com.cell.cellsys.models.BaseEntity;
import com.cell.cellsys.models.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class Roles extends BaseEntity {

    private String name;
    private String description;



    @ManyToMany
    @JoinTable(name = "role_permissions",
    joinColumns = {@JoinColumn(name = "role_id")},
    inverseJoinColumns = {@JoinColumn(name="permissions_id")})
    private Set<Permissions> permissions;
    @Id
    private Long id;


}
