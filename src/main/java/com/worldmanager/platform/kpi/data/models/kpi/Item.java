package com.worldmanager.platform.kpi.data.models.kpi;


import javax.persistence.*;

//@Entity
//@Table(name="kpiItem")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Section section;
    private Integer position;
}
