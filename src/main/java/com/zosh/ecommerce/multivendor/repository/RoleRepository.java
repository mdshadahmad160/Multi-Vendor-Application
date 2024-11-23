package com.zosh.ecommerce.multivendor.repository;

import com.zosh.ecommerce.multivendor.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {

    Role findByName(String name);

}
