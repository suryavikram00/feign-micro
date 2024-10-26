// package com.feign.feign_micro.inter_communication;

// import org.springframework.cloud.openfeign.FeignClient;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;

// // i want to move this to a property file
// // i want to package feign client & its respective entities to a open crud repository
// @FeignClient(name = "userClient", url = "${user.client.url}")
// public interface UserClientInterface {

//   @GetMapping("/user/{id}")
//   Object getData(@PathVariable("id") int id);
  
// }
