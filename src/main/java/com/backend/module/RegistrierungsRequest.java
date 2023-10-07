package com.backend.module;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class RegistrierungsRequest {
    private String email;
    private String password;

    public RegistrierungsRequest() {
        // Standardkonstruktor
    }

    // Standard-Konstruktor (nicht mehr erforderlich, da Lombok @AllArgsConstructor verwendet)
    // Getter und Setter werden automatisch von Lombok generiert


}