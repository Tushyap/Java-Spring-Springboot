package collectionarraylist;

public class Tostringarraylist {

		private int empId;
		private String empName;
		private String empDesg;
		private int  empDesk;
		public Tostringarraylist(int empId, String empName, String empDesg, int empDesk) {
			super();
			this.empId = empId;
			this.empName = empName;
			this.empDesg = empDesg;
			this.empDesk = empDesk;
		}
		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", empName=" + empName + ", empDesg=" + empDesg + ", empDesk="
					+ empDesk + "]";
		}
		
		
		

	}


