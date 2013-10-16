package com.worldmanager.platform.kpi.data.models.kpi;

import javax.persistence.*;

//@Entity
//@Table(name = "kpiReportVersion")
public class ReportVersion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Report log;
    private Integer version;
    private Boolean isManagerSigned = false;
    private Boolean isAccountSigned = false;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Report getLog() {
        return log;
    }

    public void setLog(Report log) {
        this.log = log;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Boolean getManagerSigned() {
        return isManagerSigned;
    }

    public void setManagerSigned(Boolean managerSigned) {
        isManagerSigned = managerSigned;
    }

    public Boolean getAccountSigned() {
        return isAccountSigned;
    }

    public void setAccountSigned(Boolean accountSigned) {
        isAccountSigned = accountSigned;
    }
}
