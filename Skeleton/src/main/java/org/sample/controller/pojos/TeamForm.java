package org.sample.controller.pojos;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.sample.model.Team;

public class TeamForm {


    private Date date;
    private String teamName;
    private Long id;


    @NotNull
    
    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
