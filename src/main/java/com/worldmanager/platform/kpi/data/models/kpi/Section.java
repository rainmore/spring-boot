package com.worldmanager.platform.kpi.data.models.kpi;

import javax.persistence.*;

//@Entity
//@Table(name = "kpiSection")
public class Section {

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

//    @ManyToOne
//    @JoinColumn(name = "templateId")
    private Template template;

    private String name;
    private Integer position;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Template getTemplate() {
        return template;
    }

    public void setTemplate(Template template) {
        this.template = template;
    }

    public String toString() {
        return String.format("KRI Section[id = %d, name='%s']", this.getId(), this.getName());
    }
}
