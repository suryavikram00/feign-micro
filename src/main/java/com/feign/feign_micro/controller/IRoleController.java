package com.feign.feign_micro.controller;

import org.springframework.http.ResponseEntity;

import com.api.open.crud.api.controller.IOpenCrudController;
import com.api.open.crud.api.exception.model.CrudApiResponse;
import com.feign.feign_micro.entity.RoleEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;


public interface IRoleController
        extends IOpenCrudController<RoleEntity, Long> {

}