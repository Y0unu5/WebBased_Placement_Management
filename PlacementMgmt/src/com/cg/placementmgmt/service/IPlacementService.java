package com.cg.placementmgmt.service;

import com.cg.placementmgmt.entities.Placement;

public interface IPlacementService {
	public abstract Placement addPlacement(Placement placement);

	public abstract Placement updatePlacement(Placement placement);

	public abstract Placement searchPlacement(int id);

	public abstract boolean cancelPlacement(int id);

}
