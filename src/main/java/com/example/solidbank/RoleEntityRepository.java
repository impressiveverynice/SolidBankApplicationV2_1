package com.example.solidbank;

import org.springframework.data.repository.CrudRepository;

public interface RoleEntityRepository extends CrudRepository<RoleEntity, Integer> {
    RoleEntity findByName(String name);

    RoleEntity findRoleEntityById(Integer id);
}
