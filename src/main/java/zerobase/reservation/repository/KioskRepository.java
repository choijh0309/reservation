package zerobase.reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zerobase.reservation.domain.Kiosk;

import java.util.Optional;

public interface KioskRepository extends JpaRepository<Kiosk, Long> {
    Optional<Kiosk> findByKioskCode(String kioskZCode);
}
