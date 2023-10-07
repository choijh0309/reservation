package zerobase.reservation.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import zerobase.reservation.dto.ShopDto;
import zerobase.reservation.service.ShopService;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/shops")
@Slf4j
public class ShopController {
    private final ShopService shopService;

    @PostMapping("/shop")
    public ResponseEntity<?> create(@Valid @RequestBody ShopDto shopDto) {
        shopService.createShop(
                request.getEmail(),
                request.getName(),
                request.getLatitude(),
                request.getLongitude());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/shop")
    public ResponseEntity<Page<ShopDto>> readAll() {
        return ResponseEntity.ok().build();
    }
}
