package com.vimash.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
@MappedSuperclass
@Data
public abstract class CommonEntity {
	
	@JsonProperty("ex_key")
	private Integer ex_key = 0;
	
	@JsonProperty("del_flg")
	@JsonIgnore
	
	private String del_flg = "0";
	
	@JsonProperty("create_date")
	@JsonIgnore
	@Column(updatable = false)
	private Date create_date;
	
	@JsonProperty("create_by")
	@JsonIgnore
	@Column(updatable = false)
	private Integer create_by;	
	
	@JsonProperty("update_date")
	@Column(insertable = false)
	private Date update_date;
	
	@JsonProperty("update_by")
	@JsonIgnore
	@Column(insertable = false)
	private Integer update_by;
	
}
