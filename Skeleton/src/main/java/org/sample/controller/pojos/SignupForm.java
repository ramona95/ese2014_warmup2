package org.sample.controller.pojos;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.sample.model.Team;

public class SignupForm {


    private Long id;
    private String firstName;
    private String lastName;
    
    private String selectedTeam;
    private List<Team> teams;


    @NotNull
    @Pattern(regexp = "[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", 
    message = "Must be valid email address")
    private String email;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSelectedTeam()
    {
    	return this.selectedTeam;
    }
    
    public void setSelectedTeam(String team)
    {
    	this.selectedTeam = team;
    }
    
    public List<Team> getTeams()
    {
    	return this.teams;
    }
    
    public void setTeams(List<Team> teams)
    {
    	this.teams = teams;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
