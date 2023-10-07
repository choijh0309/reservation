package zerobase.reservation.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberDto {
    private String email;
    private String password;
    private String nickname;
    private String imageUrl;
    private String phoneNumber;
}
