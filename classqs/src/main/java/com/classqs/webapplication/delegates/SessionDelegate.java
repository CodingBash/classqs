package com.classqs.webapplication.delegates;

import java.util.List;

import com.classqs.webapplication.models.Session;

public interface SessionDelegate
{
	public List<Session> getSessions(String courseId);
	
	public Session findSession(String id);
}
