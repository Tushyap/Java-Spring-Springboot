package spring.project.sweetshop.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import spring.project.sweetshop.entities.Order;
//OrderDao class contains methods to communicate with database
public class OrderDao {
	
	// HIBERNATE methods 
	// hibernateTemplate provides many convenience methods that help you in querying and persisting objects.
				private HibernateTemplate hibernateTemplate;
				
				@Transactional
				// Insert Details to database
				public int insert (Order order) {
					Integer i = (Integer) this.hibernateTemplate.save(order);
					return i;
					
				}
				//get the single data(object)
				public Order getOrder(int orderId) {
					Order order=this.hibernateTemplate.get(Order.class,orderId);
					return order;
				}
				
				//get all orders (all rows)
				public List<Order> getAllOrders(){
					List<Order> orders=this.hibernateTemplate.loadAll(Order.class);
					return orders;
				}
				
				// Encapsulation - Getter and setter for hibernateTemplate
				public HibernateTemplate getHibernateTemplate() {
					return hibernateTemplate;
				}

				public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
					this.hibernateTemplate = hibernateTemplate;
				  }


}
