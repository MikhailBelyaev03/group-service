package com.example.group.impl.controller;

import static java.util.stream.Collectors.toList;

import com.example.group.api.controller.GroupController;
import com.example.group.api.dto.GroupDto;
import com.example.group.api.dto.StudentInGroupDto;
import com.example.group.domain.GroupEntity;
import com.example.group.impl.repository.GroupRepository;
import com.example.student.api.controller.StudentController;
import com.example.student.api.dto.StudentDto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GroupControllerImpl implements GroupController {

    @Autowired
    private GroupRepository groupRepository;

    @Autowired
    private StudentController studentController;

    @Override
    public List<GroupDto> getGroups() {
        return convertGroupsToDtos(groupRepository.findAll());
    }

    @Override
    public GroupDto getGroup(Long id) {
        return convertGroupToDto(groupRepository.findById(id));
    }

    private List<GroupDto> convertGroupsToDtos(List<GroupEntity> entities) {
        return entities.stream()
            .map(this::convertGroupToDto)
            .collect(toList());
    }

    private GroupDto convertGroupToDto(GroupEntity groupEntity) {
        List<StudentInGroupDto> students = convertStudentDtos(
            studentController.getStudentsByGroupId(groupEntity.getId()));
        return new GroupDto(groupEntity.getId(), groupEntity.getName(), students.size(), students);
    }

    private List<StudentInGroupDto> convertStudentDtos(List<StudentDto> students) {
        return students.stream()
            .map(this::convertStudentDto).
            collect(toList());
    }

    private StudentInGroupDto convertStudentDto(StudentDto student) {
        return new StudentInGroupDto(student.getId(), student.getFullName());
    }
}
