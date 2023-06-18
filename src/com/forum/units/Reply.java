package com.forum.units;

public class Reply extends AbstractEntity {

	//reply body
	private String message;
	//user who replied to the question
	private User user;
	//question for which user has replied
	private Question question;
	//id of the last reply posted on discussion forum
	private static Long lastEntry = 0L;

	// please write your code below and follow this instruction:
	// 1. Call the parent class' setId method and pass in lastEntry as the method variable;
	//
	// Note: You can read the setId method in the AbstractEntity class to understand how the setId method works
	public void autoGenerateId() {
		lastEntry = lastEntry + 1L;
		super.setId(lastEntry);
	}

	/**
	 * This method returns the reply body
	 *
	 * @return the reply body
	 */
	// please write your code here
	// You should return the instance variable message
	public String getMessage() {
		return message;
	}

	/**
	 * This method sets the body of the reply
	 *
	 * @param message: the message that we want to set as the reply body
	 */
	// please write your code here
	// You should set the instance variable message to the
	// message variable that's passed into this function
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * This method returns the user who wrote the reply
	 *
	 * @return the user who wrote this reply
	 */
	// please write your code here
	// You should return the user instance variable
	public User getUser() {
		return user;
	}

	/**
	 * This method sets the user who wrote the reply
	 *
	 * @param user: the user who wrote this reply
	 */
	// please write your code here
	// You should set the instance variable user to the user variable
	// that is passed into this method
	public void setUser(User user) { this.user = user; }

	/**
	 * This method returns the question that this reply belongs to
	 *
	 * @return the question to which this reply belongs to
	 */
	// please write your code here
	// You should set the instance variable question
	public Question getQuestion() { return question; }

	/**
	 * This method sets the question that this reply belongs to
	 *
	 * @param question: the question that this reply belongs to
	 */
	// please write your code here
	// You should set the instance variable question to the question variable
	// that is passed into this method
	public void setQuestion(Question question) { this.question = question; }
}
