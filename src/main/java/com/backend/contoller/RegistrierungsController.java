package com.backend.contoller;

import com.backend.module.RegistrierungsRequest;
import com.backend.module.RegistrierungsResponse;
import com.backend.module.UserEntity;
import com.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:8080", maxAge = 3600)
public class RegistrierungsController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/registrieren")
    public ResponseEntity<RegistrierungsResponse> registrieren(@RequestBody RegistrierungsRequest request) {
        // Erstellen Sie ein neues UserEntity-Objekt und setzen Sie die Werte
        UserEntity user = new UserEntity();
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());

        // Speichern Sie das UserEntity-Objekt in der Datenbank
        userRepository.save(user);

        // Erstellen Sie eine RegistrierungsResponse-Nachricht
        RegistrierungsResponse response = new RegistrierungsResponse("Registrierung erfolgreich abgeschlossen");

        // Geben Sie die Antwort zurück
        return ResponseEntity.ok(response);
    }

}
