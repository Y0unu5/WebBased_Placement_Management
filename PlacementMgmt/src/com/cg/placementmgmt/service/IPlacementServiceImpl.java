package com.cg.placementmgmt.service;

import com.cg.placementmgmt.entities.Placement;
import com.cg.placementmgmt.repository.IPlacementRepo;
import com.cg.placementmgmt.repository.IPlacementRepoImpl;


public class IPlacementServiceImpl implements IPlacementService 
{
	private IPlacementRepo repo;

	public IPlacementServiceImpl() {
		repo = new IPlacementRepoImpl();
	}

	@Override
	public Placement addPlacement(Placement placement) {
		repo.beginTransaction();
		repo.addPlacement(placement);
		repo.commitTransaction();
		return null;
	}

	@Override
	public Placement updatePlacement(Placement placement) {
		repo.beginTransaction();
		repo.updatePlacement(placement);
		repo.commitTransaction();
		return null;
	}

	@Override
	public Placement searchPlacement(int id) {
		repo.beginTransaction();
		repo.searchPlacement(id);
		repo.commitTransaction();
		return null;
	}

	@Override
	public boolean cancelPlacement(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
