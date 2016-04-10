package com.classqs.webapplication.delegates;

import java.util.ArrayList;
import java.util.List;

import com.classqs.webapplication.models.Session;

public class SessionDelegateImpl implements SessionDelegate
{

	@Override
	public List<Session> getSessions(String courseId)
	{
		List<Session> sessions = new ArrayList<Session>();
		sessions.add(new Session());
		sessions.add(new Session());
		sessions.add(new Session());
		return sessions;
	}

	@Override
	public Session findSession(String id)
	{
		return new Session();
	}

}
