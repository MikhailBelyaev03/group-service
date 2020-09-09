package com.example.group.impl.repository;

import static java.util.Arrays.asList;

import com.example.group.domain.GroupEntity;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class GroupRepository {

    private final List<GroupEntity> entities = asList(
        new GroupEntity(1L, "PMIb-2020"),
        new GroupEntity(2L, "MOb-2019"),
        new GroupEntity(3L, "MOb-2018")
    );

    public List<GroupEntity> findAll() {
        return new ArrayList<>(entities);
    }

    public GroupEntity findById(Long id) {
        return entities.stream()
            .filter(entity -> id.equals(entity.getId()))
            .findAny()
            .orElse(null);
    }
}
