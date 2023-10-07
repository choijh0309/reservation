package zerobase.reservation.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import zerobase.reservation.domain.Shop;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class KioskDto {
    private Shop shop;
    private String kioskCode;

}
