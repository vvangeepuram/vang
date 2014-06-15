package com.carpay.Domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Collection.*;

import javax.persistence.*;

import org.springframework.util.StringUtils;

@Entity
@Table (name = "vehicle")
public class Vehicle implements Serializable {
	@OneToMany
	private List<Person> person;
	
	@EmbeddedId
	VehiclePK vehiclePK;
	private static final String AVAILABLE_STATUS = "available";
	
	@Column (name = "description")
	private String description;
	@Column (name = "make")
	private String make;
	@Column (name = "year")
	private String year;
	@Column (name = "model")
	private String model;
	@Column (name = "transmission")
	private String transmission;
	@Column (name = "engine")
	private String engine;
	@Column (name = "exterior_color")
	private String exteriorColor;
	@Column (name = "interior_color")
	private String interiorColor;
	@Column (name = "model_code")
	private String modelCode;
	@Column (name = "stock_number")
	private String stockNumber;
	@Column (name = "mileage")
	private Integer mileage;
	@Column (name = "sticker_price")
	private String stickerPrice;
	@Column (name = "sale_price")
	private String salePrice;
	@Column (name = "status")
	private String status;
	@Column (name = "image_url")
	private String imageURL;
	@Column (name = "date_created")
	private Date dateCreated;
	@Column (name = "last_updated")
	private Date lastUpdated;
	
	
	
	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	boolean equals(Vehicle other) {
		return vehiclePK.equals(other.vehiclePK);
	}
	
	public boolean isAvailable() {
		return AVAILABLE_STATUS.equals(status);
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getYear() {
		return year;
	}

	public VehiclePK getVehiclePK() {
		return vehiclePK;
	}

	public void setVehiclePK(VehiclePK vehiclePK) {
		this.vehiclePK = vehiclePK;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getTransmission() {
		return transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getExteriorColor() {
		return exteriorColor;
	}

	public void setExteriorColor(String exteriorColor) {
		this.exteriorColor = exteriorColor;
	}

	public String getInteriorColor() {
		return interiorColor;
	}

	public void setInteriorColor(String interiorColor) {
		this.interiorColor = interiorColor;
	}

	public String getModelCode() {
		return modelCode;
	}

	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
	}

	public String getStockNumber() {
		return stockNumber;
	}

	public void setStockNumber(String stockNumber) {
		this.stockNumber = stockNumber;
	}

	public Integer getMileage() {
		return mileage;
	}

	public void setMileage(Integer mileage) {
		this.mileage = mileage;
	}

	public String getStickerPrice() {
		return stickerPrice;
	}

	public void setStickerPrice(String stickerPrice) {
		this.stickerPrice = stickerPrice;
	}

	public String getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(String salePrice) {
		this.salePrice = salePrice;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	
	
	

}
