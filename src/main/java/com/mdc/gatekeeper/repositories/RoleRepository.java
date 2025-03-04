package com.mdc.gatekeeper.repositories;

import com.mdc.gatekeeper.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<RoleEntity, Integer> {
}
