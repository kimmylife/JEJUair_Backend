package com.project.jejuair.model.network.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TbExtraServiceRequest {
    private Long extIdx;
    private String extServiceType;
    private String extServiceDetail;
    private LocalDateTime extChoiceRegDate;
    private Integer extPrice;
}
