/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.feign.feign_micro.service;

import com.api.open.crud.api.service.OpenCrudService;

import com.feign.feign_micro.entity.RoleEntity;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 *
 * @author NMSLAP570
 */
@Service
@Slf4j
public class RoleService
        extends OpenCrudService<RoleEntity, Long>
        implements IRoleService {


}
