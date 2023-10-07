package com.backend.module;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
@Entity
@Table(name = "Users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String password;

    public UserEntity() {

    }

    // Standardkonstruktor (nicht mehr erforderlich, da Lombok @AllArgsConstructor verwendet)
    // Getter und Setter werden automatisch von Lombok generiert
}
