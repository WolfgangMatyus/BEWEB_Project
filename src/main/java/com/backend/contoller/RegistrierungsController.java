package com.backend.contoller;

import com.backend.module.RegistrierungsRequest;
import com.backend.module.RegistrierungsResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:8080", maxAge = 3600)
public class RegistrierungsController {

    @PostMapping("/registrieren")
    public ResponseEntity<?> registrieren(@RequestBody RegistrierungsRequest request) {
        // Implementieren Sie hier Ihre Registrierungslogik
        return ResponseEntity.ok(new RegistrierungsResponse("Registrierung erfolgreich abgeschlossen"));
    }
}
