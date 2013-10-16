package com.worldmanager.platform.kpi.data.models.kpi;

import com.worldmanager.platform.kpi.data.models.Account;

import javax.persistence.*;

//@Entity
//@Table(name = "kpiReport")
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Template template;
    private Account account;
    private Account manager;

    private ReportVersion version;
}
