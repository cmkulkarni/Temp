package com.sample.todo.app.domain.task.commands;
import org.axonframework.commandhandling.annotation.TargetAggregateIdentifier;

public class CompleteTaskCommand {

	@TargetAggregateIdentifier
	private String id;

	public CompleteTaskCommand(String id) {
		super();
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}