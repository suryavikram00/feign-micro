/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.feign.feign_micro.repository;

import com.api.open.crud.api.repository.OpenCrudApiRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.feign.feign_micro.entity.RoleEntity;

/**
 *
 * @author NMSLAP570
 */
@Repository
@Transactional
public interface IRoleRepository
        extends OpenCrudApiRepository<RoleEntity, Long> {

}
