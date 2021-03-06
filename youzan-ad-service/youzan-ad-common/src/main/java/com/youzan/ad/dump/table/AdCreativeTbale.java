package com.youzan.ad.dump.table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by baimugudu on 2019/4/3
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdCreativeTbale {
    private Long adId;

    private String name;

    private Integer type;

    private Integer materialType;

    private Integer height;

    private Integer width;

    private Integer auditStatus;
}
