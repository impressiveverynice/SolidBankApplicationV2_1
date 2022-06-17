package com.example.solidbank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Id;


@Data
@Builder
@AllArgsConstructor
public class RoleEntity  {
    private @Id int id;
    private String name;
}
