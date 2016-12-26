package net.mv.rems.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.mv.rems.domain.Account;
import net.mv.rems.domain.Category;
import net.mv.rems.domain.Equipment;

@Repository
public class EquimpmentDaoImpl implements EquipmentDao {
	
	@Autowired
	SessionFactory sf;

	@Override
	@Transactional
	public void persistEquipment(Equipment equipment) {
		
		Session session = sf.getCurrentSession();

		Category category = (Category) session.createCriteria(Category.class)
				.add(Restrictions.eq("categName", equipment.getCategory().getCategName())).uniqueResult();
		equipment.setCategory(category);
		
		Account account = (Account) session.createCriteria(Account.class)
				.add(Restrictions.eq("username", equipment.getAccount().getUsername())).uniqueResult();
		equipment.setAccount(account);
		
		// Now persist the equipment object in the database
		session.save(equipment);
	}
	
	@Override
	@Transactional
	public List<Equipment> retrieveEquipments() {
		
		Session session = sf.getCurrentSession();
		
		List<Equipment> result = session.createCriteria(Equipment.class).add(Restrictions.eq("status", "available")).list();
		return result;
	}

}
