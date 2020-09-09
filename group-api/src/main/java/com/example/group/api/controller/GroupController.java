package com.example.group.api.controller;

import com.example.group.api.dto.GroupDto;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "GroupController", url = "${ms.group.url}")
public interface GroupController {

    @GetMapping(value = "/groups")
    List<GroupDto> getGroups();

    @GetMapping(value = "/groups/{id}")
    GroupDto getGroup(@PathVariable Long id);

}
