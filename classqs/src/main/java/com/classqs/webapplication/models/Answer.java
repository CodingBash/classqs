package com.classqs.webapplication.models;

public class Answer
{
	private long AnswerId;
	private long ResponderId;
	private String answerText;
	private Question questionAnswered;

	public long getAnswerId()
	{
		return AnswerId;
	}

	public void setAnswerId(long answerId)
	{
		AnswerId = answerId;
	}

	public long getResponderId()
	{
		return ResponderId;
	}

	public void setResponderId(long responderId)
	{
		ResponderId = responderId;
	}

	public String getAnswerText()
	{
		return answerText;
	}

	public void setAnswerText(String answerText)
	{
		this.answerText = answerText;
	}

	public Question getQuestionAnswered()
	{
		return questionAnswered;
	}

	public void setQuestionAnswered(Question questionAnswered)
	{
		this.questionAnswered = questionAnswered;
	}

}
