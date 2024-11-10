package top.soft.brandlist.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: TODO
 * @author admin
 * @date 2024/11/9 16:08
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Brand {
    private Integer id;
    private String companyName;
    private String brandName;
    private String description;
    private Integer ordered;

}
