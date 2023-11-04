package com.cell.cellsys.repositories;

import com.cell.cellsys.models.usermodels.Pastor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PastorRepository extends JpaRepository<Pastor,Long> {
}
