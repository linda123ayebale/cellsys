package com.cell.cellsys.models;

import com.cell.cellsys.models.Roles.Roles;
import com.cell.cellsys.models.constants.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;


@Entity

@NoArgsConstructor
@Data

public class User extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String first_name;
    private String last_name;
    private String email;
    private String contact;
    private Gender gender;
    private String username;
    private String password;
    private String location;

@ManyToMany(
        fetch = FetchType.EAGER
)
@JoinTable(name ="user_roles",
joinColumns = {@JoinColumn(name="user_id")},
inverseJoinColumns = {@JoinColumn(name ="role_id")})
    private Set<Roles> roles;










}
