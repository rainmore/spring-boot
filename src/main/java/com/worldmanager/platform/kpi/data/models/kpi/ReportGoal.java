package com.worldmanager.platform.kpi.data.models.kpi;

import javax.persistence.*;

//@Entity
//@Table(name = "kpiReportGoal")
public class ReportGoal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Item question;
    private String value;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Item getQuestion() {
        return question;
    }

    public void setQuestion(Item question) {
        this.question = question;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
