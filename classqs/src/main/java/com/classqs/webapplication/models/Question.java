package com.classqs.webapplication.models;

import java.util.List;

public class Question
{
	private long questionId;
	private long askerId;
	private long sessionId;
	private int likeCount;
	private String questionText;
	private List<Answer> answers;
	private List<Liker> likers;
	
	
}
