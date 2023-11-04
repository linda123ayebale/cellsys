package com.cell.cellsys.repositories;

import com.cell.cellsys.models.usermodels.CellLeader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CellleaderRepository extends JpaRepository<CellLeader,Long> {
}
