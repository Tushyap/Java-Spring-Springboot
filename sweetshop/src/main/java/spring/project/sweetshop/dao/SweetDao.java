package spring.project.sweetshop.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import spring.project.sweetshop.entities.Sweet;
//SweetDao class contains methods to communicate with database
public class SweetDao {
	// HIBERNATE methods 
	// hibernateTemplate provides many convenience methods that help you in querying and persisting objects.
			private HibernateTemplate hibernateTemplate;
			
			@Transactional
			// Insert Details to database
			public int insert (Sweet sweet) {
				Integer i = (Integer) this.hibernateTemplate.save(sweet);
				return i;
				
			}
			//get the single data(object)
			public Sweet getSweet(int sweetId) {
				Sweet sweet=this.hibernateTemplate.get(Sweet.class,sweetId);
				return sweet;
			}
			
			//get all student(all rows)
			public List<Sweet> getAllSweets(){
				List<Sweet> sweets=this.hibernateTemplate.loadAll(Sweet.class);
				return sweets;
			} 
			//deleting the data
			@Transactional
			public void deleteSweet(int sweetId) {
				Sweet sweetDel=this.hibernateTemplate.get(Sweet.class,sweetId);
				this.hibernateTemplate.delete(sweetDel);
			}
			//update data
			@Transactional
			public void updateSweet(Sweet sweet) {
				this.hibernateTemplate.update(sweet);
			}
			
			// Encapsulation - Getter and setter for hibernateTemplate
			public HibernateTemplate getHibernateTemplate() {
				return hibernateTemplate;
			}

			public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
				this.hibernateTemplate = hibernateTemplate;
			  }

}
