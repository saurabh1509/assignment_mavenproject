package com.oehm4.Hibernate.mavenAssignmentProject.DTO;

import java.io.Serializable;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.Session;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.GenericGenerator;

import com.oehm4.Hibernate.mavenAssignmentProject.DAO.MySessionFactory;

@Entity
@Table(name = "Bike_Details")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)

public class BikeDTO implements Serializable {
	@Id
	@Column(name = "ID")
	@GenericGenerator(name = "bike_id", strategy = "increment")
	@GeneratedValue(generator = "bike_id")
	private Long id;
	@Column(name = "BIKE_NAME")
	private String BikeName;
	@Column(name = "BRAND_NAME")
	private String BrandName;
	@Column(name = "PRICE")
	private Double Price;
	@Column(name = "ENGINE_CC")
	private String Enginecc;
	@Column(name = "CHASIS_NO")
	private String Chasisno;
	@Column(name = "BIKE_CATAGORY")
	private String BikeCatagory;

	public BikeDTO() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBikeName() {
		return BikeName;
	}

	public void setBikeName(String bikeName) {
		this.BikeName = bikeName;
	}

	public String getBrandName() {
		return BrandName;
	}

	public void setBrandName(String brandName) {
		this.BrandName = brandName;
	}

	public Double getPrice() {
		return Price;
	}

	public void setPrice(Double price) {
		this.Price = price;
	}

	public String getEnginecc() {
		return Enginecc;
	}

	public void setEnginecc(String enginecc) {
		this.Enginecc = enginecc;
	}

	public String getChasisno() {
		return Chasisno;
	}

	public void setChasisno(String chasisno) {
		this.Chasisno = chasisno;
	}

	public String getBikeCatagory() {
		return BikeCatagory;
	}

	public void setBikeCatagory(String bikeCatagory) {
		this.BikeCatagory = bikeCatagory;
	}

	@Override
	public String toString() {
		return "BikeDTO [id=" + id + ", BikeName=" + BikeName + ", BrandName=" + BrandName + ", Price=" + Price
				+ ", Enginecc=" + Enginecc + ", Chasisno=" + Chasisno + ", BikeCatagory=" + BikeCatagory + "]";
	}

}

