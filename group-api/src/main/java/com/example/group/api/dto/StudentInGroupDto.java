package com.example.group.api.dto;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentInGroupDto implements Serializable {

    private static final long serialVersionUID = -3909851076387494508L;

    private Long id;

    private String fullName;

}
