package zerobase.reservation.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import zerobase.reservation.dto.ReservationDto;
import zerobase.reservation.service.KioskService;
import zerobase.reservation.service.ReservationService;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/reservations")
@Slf4j
public class ReservationController {
    private final ReservationService reservationService;
    private final KioskService kioskService;

    @PostMapping("/reservation")
    public ResponseEntity<?> create(@Valid @RequestBody ReservationDto reservationDto) {
        reservationService.create(
                request.getEmail(),
                request.getShopCode(),
                request.getStartDateTime());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/reservation")
    public ResponseEntity<Page<ReservationDto>> readAllByCondition(@Valid @RequestBody ReservationDto reservationDto) {
        return ResponseEntity.ok(reservationService);
    }
}
