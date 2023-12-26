package com.hotfoot.rapid.los.app.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;



public class WorkProgress {
	
	private Long id;
	
	@JsonProperty("load_bearing_and_framestructure")
	@SerializedName("load_bearing_and_framestructure")
	private String loadBearingAndFramedStructure;
	
	@JsonProperty("work_progress")
	@SerializedName("work_progress")
	private double workProgress;
	
	@JsonProperty("total_floor_work")
	@SerializedName("total_floor_work")
	private double totalFloorWork;
	
	@JsonProperty("on_site_work")
	@SerializedName("on_site_work")
	private double onSiteWork;
	
	@JsonProperty("work_percentage")
	@SerializedName("work_percentage")
	private double workPercentage;
	
	@JsonProperty("total")
	@SerializedName("total")
	private double total;
	

}
