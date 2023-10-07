package zerobase.reservation.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import zerobase.reservation.domain.Member;
import zerobase.reservation.domain.Reservation;
import zerobase.reservation.domain.Shop;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class ReviewDto {
    private Member member;
    private Shop shop;
    private Reservation reservation;
    private String reviewCode;
    private Integer rating;
    private String content;
    private String imageUrl;

}
