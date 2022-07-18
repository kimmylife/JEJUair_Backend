package com.project.jejuair.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

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
public class TbMember {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_extraservice")
    private Long memIdx;
    private String memUserid;
    private String memUserpw;
    private String memKoLastname;
    private String memKoFirstname;
    private String memEngLastname;
    private String memEngFirstname;
    private String memGender;
    private String memSsn;
    private String memHp;
    private String memEmail;
    @Enumerated
    private Integer memMarketing;
    @Enumerated
    private Integer memStatus;
    @CreatedDate
    private LocalDateTime memRegDate;
    private Integer memPoint;
    @Enumerated
    private Integer memSnsPush;

}
