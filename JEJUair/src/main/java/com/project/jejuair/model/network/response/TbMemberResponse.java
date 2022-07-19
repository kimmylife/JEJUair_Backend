package com.project.jejuair.model.network.response;

import com.project.jejuair.model.enumclass.MemberConsent;
import com.project.jejuair.model.enumclass.MemberStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TbMemberResponse {
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
    private MemberConsent memMarketing;
    private MemberStatus memStatus;
    private LocalDateTime memRegDate;
    private Integer memPoint;
    private MemberConsent memSnsPush;
}
