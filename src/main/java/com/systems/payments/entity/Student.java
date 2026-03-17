package com.systems.payments.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder // Su función principal es facilitar la creación de objetos complejos sin tener
         // que lidiar con constructores gigantes o muchas líneas de código "setter".
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    private String id;
    private String name;
    private String lastname;

    @Column(unique = true)
    private String code;
    private String programId;
    private String photo;

}
