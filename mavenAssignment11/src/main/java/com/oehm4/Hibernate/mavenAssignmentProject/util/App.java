package com.oehm4.Hibernate.mavenAssignmentProject.util;



import java.util.List;

import com.oehm4.Hibernate.mavenAssignmentProject.DAO.BikeDAO;
import com.oehm4.Hibernate.mavenAssignmentProject.DAO.HqlBikeDAO;
import com.oehm4.Hibernate.mavenAssignmentProject.DTO.BikeDTO;

public class App {
	
	public static void main(String[] args) {	
	
	
   // saving Details of bikes by save methods......
	
	/*BikeDTO bikeDTO = new BikeDTO();
	//accountDTO.setId(102L);
	bikeDTO.setBikeName("Hornet");
	bikeDTO.setBrandName("Honda");
	bikeDTO.setPrice(125480.00D);
	bikeDTO.setEnginecc("150cc");
	bikeDTO.setChasisno("HOR12345HON123");
	bikeDTO.setBikeCatagory("StreetRacing");
	
	BikeDAO bikeDAO = new BikeDAO();
	bikeDAO.saveBikeDetails(bikeDTO);
	System.out.println("operation successful"); 
	*/
	
	/*Getting Details By update-----------------------
	 * 
	BikeDAO bikeDAO=new BikeDAO();
	BikeDTO bikeDTO=bikeDAO.getBikeDetailsById(1L);
	if(bikeDTO!=null)
	{
	
		System.out.println(bikeDTO);
	}
	else
	{
		System.out.println("Invalid Id");
	}
	*/
	
	/* Update Details by update method
	
	BikeDAO bikeDAO=new BikeDAO();
	bikeDAO.updatePriceById(1L, 55000.0);*/
	
	/* Getting Details by Hql-----------------
	
	
	HqlBikeDAO hqlBikeDAO = new HqlBikeDAO();
	List<BikeDTO> list=hqlBikeDAO.getBikeDetails();
	list.forEach(obj->{
		System.out.println(obj);
	});
	*/
	
	/*Getting Details by Brand--------
	HqlBikeDAO hqlbikeDAO=new HqlBikeDAO();
    BikeDTO bikeDTO = hqlbikeDAO.getBikeDetailsByBrandName("Honda");
	System.out.println(bikeDTO);
	*/
	
	/*Update price by brand using hql----------
	HqlBikeDAO hqlbikeDAO=new HqlBikeDAO();
    hqlbikeDAO.updatePriceByBrandNmae("Honda", 100000D);
    */
	
	/*Delete LaptopDetails By Id-----------
	HqlBikeDAO hqlbikeDAO=new HqlBikeDAO();
	hqlbikeDAO.deleteBikeDetailsByBrandName("Honda");
	*/
	/*Retrieve data using method by cache-----------
	LaptopDAO laptopDAO = new LaptopDAO();
	LaptopDTO laptopDTO1 = laptopDAO.getLaptopDetailsById(1L);
	LaptopDTO laptopDTO2 = laptopDAO.getLaptopDetailsById(1L);
	System.out.println("LaptopDTO1" + laptopDTO1);
	System.out.println("LaptopDTO2" + laptopDTO2);
	*/
	HqlBikeDAO bikeDAO = new HqlBikeDAO();
	List<BikeDTO> bikeDetails1 = bikeDAO.getBikeDetails();
	List<BikeDTO> bikeDetails2 = bikeDAO.getBikeDetails();
	System.out.println("size of BikeDetails1 is "+bikeDetails1.size());
	System.out.println("size of BikeDetails2 is "+bikeDetails2.size());

	
	}
	
}

