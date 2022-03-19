package com.cg.placementmgmt.repository;

import com.cg.placementmgmt.entities.Placement;

public interface IPlacementRepo {
	public abstract Placement addPlacement(Placement placement);

	public abstract Placement updatePlacement(Placement placement);

	public abstract Placement searchPlacement(int id);

	public abstract void commitTransaction();

	public abstract void beginTransaction();
}
