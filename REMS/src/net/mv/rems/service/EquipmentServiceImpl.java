package net.mv.rems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.mv.rems.dao.EquipmentDao;
import net.mv.rems.domain.Equipment;

@Service
public class EquipmentServiceImpl implements EquipmentService {

	@Autowired
	EquipmentDao equipmentDao;
	
	@Override
	public void addEquipment(Equipment equipment) {
		
		equipmentDao.persistEquipment(equipment);
		
	}
	
	@Override
	public List<Equipment> displayEquipments() {
		
		
		return  equipmentDao.retrieveEquipments();
	}

}
