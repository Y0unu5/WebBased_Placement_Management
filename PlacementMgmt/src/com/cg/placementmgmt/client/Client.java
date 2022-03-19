package com.cg.placementmgmt.client;

import java.time.LocalDate;

import com.cg.placementmgmt.entities.Placement;
import com.cg.placementmgmt.service.IPlacementService;
import com.cg.placementmgmt.service.IPlacementServiceImpl;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPlacementService service = new IPlacementServiceImpl();
		Placement placement = new Placement();

		placement.setId(1);
		placement.setName("Yunus");
		placement.setCollege("HMSIT");
		placement.setQualification("BE");
		placement.setDate(LocalDate.now());
		placement.setYear(2022);

		service.addPlacement(placement);
		System.out.println("Placement added successfully");
	}

}
