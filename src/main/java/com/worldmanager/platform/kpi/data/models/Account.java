package com.worldmanager.platform.kpi.data.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {

    public enum Group {
        UM(4),
        WM(5),
        NM(6),
        AM(7),
        GM(8),
        SM(9),
        EMPLOYEE(10);

        private Integer integer;

        private Group(Integer integer) {
            this.integer = integer;
        }

        public Integer getInteger() {
            return integer;
        }

        @Override
        public String toString() {
            return String.format("%s - %d", this.getClass().getName(), getInteger());
        }

        public static Group fromValue(Integer integer) {
            for(Group g: values()) {
                if (g.getInteger().equals(integer)) return g;
            }
            return null;
        }
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private Integer accountGroupID;
    private Group group;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAccountGroupID() {
        return accountGroupID;
    }

    public void setAccountGroupID(Integer accountGroupID) {
        this.accountGroupID = accountGroupID;
    }

    public Group getGroup() {
        if (group == null && accountGroupID != null) {
            group = Group.fromValue(accountGroupID);
        }
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
        this.setAccountGroupID(group.getInteger());
    }
}
