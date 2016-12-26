package net.mv.rems.service;

import java.util.List;

import net.mv.rems.domain.Equipment;

public interface EquipmentService {
	
	public void addEquipment(Equipment equipment);
	
	public List<Equipment> displayEquipments();

}
