package zerobase.reservation.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import zerobase.reservation.domain.Member;
import zerobase.reservation.domain.Shop;

import java.time.LocalDateTime;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class ReservationDto {
    private String reservationCode;
    private Shop shop;
    private Member member;
    private LocalDateTime startDateTime;
}
