package com.example.group.api.dto;

import java.io.Serializable;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GroupDto implements Serializable {

    private static final long serialVersionUID = -5533264572574306130L;

    private Long groupId;

    private String groupName;

    private Integer numberOfStudents;

    private List<StudentInGroupDto> students;
}
