package com.project.jejuair.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@SequenceGenerator(
        name="seq_flightschedule",
        sequenceName = "seq_flightschedule",
        initialValue = 1,
        allocationSize = 1
)
@Builder
@EntityListeners(AuditingEntityListener.class)
public class TbFlightSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_flightschedule")
    private Long schIdx;
    private String schAircraftType;
    @Enumerated(EnumType.STRING)
    private String schDomesticOverseas;
    private String schAircraftName;
    private String schDeparture;
    private String schArrival;
    private LocalDateTime schDepartureDate;
    private LocalDateTime schArrivalDate;
    private LocalTime schDepartureTime;
    private LocalTime schArrivalTime;
    private Long sch_bizLitePrice;
    private Integer schBizLiteDiscount;
    private Long schFlexPrice;
    private Integer schFlexDiscount;
    private Long schFlyBagPrice;
    private Integer schFlyBagDiscount;
    private Long schFlyPrice;
    private Integer schFlyDiscount;
    @Enumerated(EnumType.STRING)
    private String schFood;
    @Enumerated(EnumType.STRING)
    private String schPet;
    private String schRegDate;

    @OneToOne
    private TbReservation tbReservation;

}
