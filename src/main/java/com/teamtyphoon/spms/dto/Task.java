package com.teamtyphoon.spms.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Task {
	private String id;
	private String taskListId;
	private String parentTaskId;
	private String name;
	private String desc;
	private String creater;
	private Date createdDate;
	private String assigner;
	private int percent;

}
