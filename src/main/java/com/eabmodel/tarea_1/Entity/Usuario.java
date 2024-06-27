package com.eabmodel.tarea_1.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

//    private Integer id;
    private String name;
    private String lastName;
    private String email;
}
