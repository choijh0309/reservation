package zerobase.reservation.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.Sort;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ShopDto {
    private int pageNum;
    private int pageSize;
    List<Sort> sort = new ArrayList<>();
}
