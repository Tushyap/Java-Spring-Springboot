package spring.project.sweetshop.dao;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import spring.project.sweetshop.entities.Customer;
//CustomerDao class contains methods to communicate with database
public class CustomerDao {
	
	// HIBERNATE methods 
	// hibernateTemplate provides many convenience methods that help you in querying and persisting objects.
		private HibernateTemplate hibernateTemplate;
		
		@Transactional
		// Insert Details to database
		public int insert (Customer customer) {
			Integer i = (Integer) this.hibernateTemplate.save(customer);
			return i;
			
		}
		//get the single data(object)
		public Customer getCustomer(int customerId) {
			Customer customer=this.hibernateTemplate.get(Customer.class,customerId);
			return customer;
		}
		
		// Encapsulation - Getter and setter for hibernateTemplate
		public HibernateTemplate getHibernateTemplate() {
			return hibernateTemplate;
		}

		public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
			this.hibernateTemplate = hibernateTemplate;
		  }

}
