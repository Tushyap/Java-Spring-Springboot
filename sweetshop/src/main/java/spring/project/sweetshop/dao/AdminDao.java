package spring.project.sweetshop.dao;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import spring.project.sweetshop.entities.Admin;


// AdminDao class contains methods to communicate with database  
public class AdminDao {
	
	// HIBERNATE methods 
	// hibernateTemplate provides many convenience methods that help you in querying and persisting objects.
		private HibernateTemplate hibernateTemplate;
		
		@Transactional
		// Insert Details to database
		
		public int insert (Admin admin) {
			Integer i = (Integer) this.hibernateTemplate.save(admin);
			return i;
			
		}
		//get the single data(object)
		public Admin getAdmin(int adminId) {
			Admin admin=this.hibernateTemplate.get(Admin.class,adminId);
			return admin;
		}
		
		// Encapsulation - Getter and setter for hibernateTemplate
		public HibernateTemplate getHibernateTemplate() {
			return hibernateTemplate;
		}

		public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
			this.hibernateTemplate = hibernateTemplate;
		  }

}
