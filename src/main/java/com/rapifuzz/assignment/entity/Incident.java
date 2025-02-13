package com.rapifuzz.assignment.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@Getter
@Setter
public class Incident {

//    @Column
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;

    @Id
    @Column(nullable = false,length = 15,unique = true)
    private String incidentNumber;

    @Column(nullable=false,length = 15)
    private String incidentIdentity;

    @ManyToOne
    @JoinColumn(name = "reported_id", nullable = false)
    private Reporter reporter;

    @Column(nullable=false,length = 15)
    private String priority;

    @Column(nullable=false,length = 15)
    private String status;

    @Column(nullable = true, length = 50)
    private String description;

    @Column(nullable=false,updatable = false)
    @CreationTimestamp
    private Date createdAt;

    @Column(nullable = false,unique = false)
    private Long createdBy;
}
