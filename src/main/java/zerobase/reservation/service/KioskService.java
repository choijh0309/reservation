package zerobase.reservation.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ServerErrorException;
import zerobase.reservation.domain.Kiosk;
import zerobase.reservation.dto.KioskDto;
import zerobase.reservation.repository.KioskRepository;
import zerobase.reservation.repository.ShopRepository;

@Service
@Slf4j
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class KioskService {
    private final KioskRepository kioskRepository;
    private final ShopRepository shopRepository;

    @Transactional
    public KioskDto getKiosk(String kioskCode) {
        Kiosk kiosk = kioskRepository.findByKioskCode(kioskCode)
                .orElseThrow();
    }
}
