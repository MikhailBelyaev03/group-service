package com.example.group.domain;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GroupEntity implements Serializable {

    private static final long serialVersionUID = -9160126620979314312L;

    private Long id;

    private String name;

}
