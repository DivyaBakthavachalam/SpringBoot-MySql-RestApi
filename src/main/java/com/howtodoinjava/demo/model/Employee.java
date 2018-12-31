package com.howtodoinjava.demo.model;

import java.util.List;

public class Employee {

	public Employee() {
		
	}
	
	public Employee(Integer id, String firstName, String lastName, String email, String vote, String answers, List tags,
			String topic,String view) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.vote = vote;
		this.answers = answers;
		this.tags = tags;
		this.topic = topic;
		this.view = view;
	}


	private Integer id;
	private String firstName;
	private String lastName;
	private String email;
	private String vote;
	private String answers;
	private List tags;
	private String topic;
	private String view;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getVote() {
		return vote;
	}
	public void setVote(String vote) {
		this.vote = vote;
	}
	public String getAnswers() {
		return answers;
	}
	public void setAnswers(String answers) {
		this.answers = answers;
	}
	public List getTags() {
		return tags;
	}
	public void setTags(List tags) {
		this.tags = tags;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getView() {
		return view;
	}

	public void setView(String view) {
		this.view = view;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", vote=" + vote + ", answers=" + answers + ", tags=" + tags + ", topic=" + topic + "]";
	}
	
	
}
