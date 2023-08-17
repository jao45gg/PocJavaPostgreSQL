package com.joao.firstjavaproject.classes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data; 
import lombok.NoArgsConstructor;

@Data
@Table(name =  "hotel")
@Entity
@AllArgsConstructor
@NoArgsConstructor

public class Hotel {

    @Id
    private Integer id;
    private String name;
}
