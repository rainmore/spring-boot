package com.worldmanager.platform.kpi.data.models.kpi;

import javax.persistence.*;

@Entity
@Table(name = "kpiTemplate")
public class Template {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String description;
    private Boolean isActive = false;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return String.format("KRI Template[id = %d, name='%s']", this.getId(), this.getName());
    }
}
