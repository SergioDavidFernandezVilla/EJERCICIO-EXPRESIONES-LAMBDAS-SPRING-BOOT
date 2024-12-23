package com.example.demo.persistence.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PersonEntity {

    private Long id;
    private String name;
    private String lastName;
    private Integer age;
    private String email;
    private String password;
}
