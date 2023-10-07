package zerobase.reservation.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import zerobase.reservation.domain.Kiosk;
import zerobase.reservation.service.KioskService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/kiosks")
@Slf4j
public class KioskController {
    private final KioskService kioskService;

    @PutMapping("/kiosk")
    public ResponseEntity<?> installation(@PathVariable String kioskCode) {
        return ResponseEntity.ok().build();
    }

    @PostMapping("/kiosk")
    public ResponseEntity<?> registration() {
        return ResponseEntity.ok().build();
    }

    @GetMapping("/kiosk")
    public ResponseEntity<Kiosk> read(@PathVariable String kioskCode) {
        return ResponseEntity.ok(kioskService.getKiosk(kioskCode));
    }
}
