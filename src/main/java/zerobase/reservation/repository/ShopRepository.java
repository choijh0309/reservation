package zerobase.reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zerobase.reservation.domain.Shop;

import java.util.Optional;

public interface ShopRepository extends JpaRepository<Shop, Long> {
    Optional<Shop> findByShopCode(String shopCode);
}
