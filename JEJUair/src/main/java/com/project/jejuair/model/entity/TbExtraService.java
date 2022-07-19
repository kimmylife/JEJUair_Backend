package com.project.jejuair.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@SequenceGenerator(
        name="seq_extraservice",
        sequenceName = "seq_extraservice",
        initialValue = 1,
        allocationSize = 1
)
@Builder
@EntityListeners(AuditingEntityListener.class)
public class TbExtraService {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_extraservice")
    private Long extIdx;
    private String extServiceType;
    private String extServiceDetail;
    @CreatedDate
    private LocalDateTime extRegDate;
    private Integer extPrice;

    @ManyToOne
    private TbReservation tbReservation;

}
