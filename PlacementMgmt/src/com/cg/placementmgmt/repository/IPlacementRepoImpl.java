package com.cg.placementmgmt.repository;

import javax.persistence.EntityManager;

import com.cg.placementmgmt.entities.Placement;

public class IPlacementRepoImpl implements IPlacementRepo {
	private EntityManager entityManager;

	public IPlacementRepoImpl() {
		entityManager = JPAUtil.getEntityManager();

	}

	@Override
	public Placement addPlacement(Placement placement) {
		entityManager.persist(placement);
		return placement;
	}

	@Override
	public Placement updatePlacement(Placement placement) {
		entityManager.merge(placement);
		return placement;

	}

	@Override
	public Placement searchPlacement(int id) {
		Placement placement = entityManager.find(Placement.class, id);
		return placement;
	}

	@Override
	public void commitTransaction() {
		// TODO Auto-generated method stub
		entityManager.getTransaction().commit();
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();

	}

}
