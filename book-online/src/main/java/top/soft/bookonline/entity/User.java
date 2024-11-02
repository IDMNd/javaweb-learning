package top.soft.bookonline.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    private Integer id;
    private String account;
    private String password;
    private String nickname;
    private String avatar;
    private String address;
    private LocalDateTime create_time;

}
/**
 * @description: TODO
 * @author admin
 * @date 2024/10/19 16:25
 */