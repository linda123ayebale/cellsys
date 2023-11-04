package com.cell.cellsys.repositories;

import com.cell.cellsys.models.usermodels.FamilyLeader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FamilyLeaderRepository extends JpaRepository<FamilyLeader,Long> {
}
