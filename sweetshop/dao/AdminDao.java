package spring.project.sweetshop.dao;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import spring.project.sweetshop.entities.Admin;



public class AdminDao {
	
	// HIBERNATE methods 
	
		private HibernateTemplate hibernateTemplate;
		
		@Transactional
		public int insert (Admin admin) {
			 
			// insert
			Integer i = (Integer) this.hibernateTemplate.save(admin);
			return i;
			
		}
		//get the single data(object)
		public Admin getAdmin(int adminId) {
			Admin admin=this.hibernateTemplate.get(Admin.class,adminId);
			return admin;
		}
		
		public HibernateTemplate getHibernateTemplate() {
			return hibernateTemplate;
		}

		public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
			this.hibernateTemplate = hibernateTemplate;
		  }

}
