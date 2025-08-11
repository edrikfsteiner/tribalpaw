package com.tribalpaw.api.army.repository;

import com.tribalpaw.api.army.model.Army;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArmyRepository extends JpaRepository<Army, Long> {}