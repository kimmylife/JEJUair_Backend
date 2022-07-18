package com.project.jejuair.model.network.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TbExtraServiceResponse {
    private Long extIdx;
    private String extServiceType;
    private String extServiceDetail;
    private LocalDateTime extChoiceRegDate;
    private Integer extPrice;
}
