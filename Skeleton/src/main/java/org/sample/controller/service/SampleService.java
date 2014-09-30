package org.sample.controller.service;

import java.util.List;

import org.sample.controller.exceptions.InvalidUserException;
import org.sample.controller.pojos.SignupForm;
import org.sample.controller.pojos.TeamForm;
import org.sample.model.Team;
import org.sample.model.User;

public interface SampleService {

    public SignupForm saveFrom(SignupForm signupForm) throws InvalidUserException;

	public TeamForm saveFrom(TeamForm teamForm) throws InvalidUserException;

	public Iterable<Team> getTeamList();
	
	public User getUserById(Long id);

}
