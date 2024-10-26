package com.feign.feign_micro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static com.feign.feign_micro.constant.FeignMicroEndPoints.ENDPOINT_ACCOUNT;
import com.api.open.crud.api.controller.OpenCrudController;
import com.api.open.crud.api.entity.account_micro.AccountEntityModel;
import com.api.open.crud.api.entity.user_micro.UserEntityModel;
import com.api.open.crud.api.feignclient.account_micro.AccountFeignClient;
import com.api.open.crud.api.feignclient.user_micro.UserFeignClient;
import com.feign.feign_micro.entity.RoleEntity;
import lombok.extern.slf4j.Slf4j;


@RestController
@Slf4j
@RequestMapping(path = ENDPOINT_ACCOUNT)
public class RoleController
        extends OpenCrudController<RoleEntity, Long> implements IRoleController {

  @Autowired
  private UserFeignClient userClient;

  @Autowired
  private AccountFeignClient accountClient;

  @GetMapping("/hello")
  public Object hello() {
    return "hello world";
  }

  @GetMapping("/account")
  public Object account() {
    System.out.println("account");
    return accountClient.getData(1);
  }

  @GetMapping("/user")
  public Object user() {
    System.out.println("user");
    return userClient.getData(1);
  }

}
