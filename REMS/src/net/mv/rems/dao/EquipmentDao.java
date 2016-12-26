package net.mv.rems.dao;

import java.util.List;

import net.mv.rems.domain.Equipment;

public interface EquipmentDao {
	
	public void persistEquipment(Equipment equipment);
	
	public List<Equipment> retrieveEquipments();

}
