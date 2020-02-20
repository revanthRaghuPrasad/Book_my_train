package com.booking.app.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Train implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;


	@Column(name="TRAIN_NO",unique=true,nullable=false)
	private String trainNo;


	@Column(name="TRAIN_NAME",nullable=false)
	private String trainName;


	@Column(name="TRAIN_TYPE",nullable=false)
	private String trainType;


	@Column(name="TRAIN_FARE",nullable=false)
	private String trainFare;


	@Column(name="STARTING_POINT",nullable=false)
	private String startingPoint;

	@Column(name="DESTINATION_POINT",nullable=false)
	private String destinationPoint;

	@Override
	public String toString() {
		return "Train [id=" + id + ", trainNo=" + trainNo + ", tainName=" + trainName + ", trainType=" + trainType
				+ ", trainFare=" + trainFare + ", startingPoint=" + startingPoint + ", destinationPoint="
				+ destinationPoint + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTrainNo() {
		return trainNo;
	}

	public void setTrainNo(String trainNo) {
		this.trainNo = trainNo;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String tainName) {
		this.trainName = trainName;
	}

	public String getTrainType() {
		return trainType;
	}

	public void setTrainType(String trainType) {
		this.trainType = trainType;
	}

	public String getTrainFare() {
		return trainFare;
	}

	public void setTrainFare(String trainFare) {
		this.trainFare = trainFare;
	}

	public String getStartingPoint() {
		return startingPoint;
	}

	public void setStartingPoint(String startingPoint) {
		this.startingPoint = startingPoint;
	}

	public String getDestinationPoint() {
		return destinationPoint;
	}

	public Train() {
		// TODO Auto-generated constructor stub
	}

	public void setDestinationPoint(String destinationPoint) {
		this.destinationPoint = destinationPoint;
	}

}
