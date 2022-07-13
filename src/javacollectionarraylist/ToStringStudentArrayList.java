package javacollectionarraylist;

public class ToStringStudentArrayList {
  private int stuRollNum;
  private String  stuName;
  private String  stuCourse;
  private String  stuBatch;
  private int     stuPhoneNum;
public ToStringStudentArrayList(int stuRollNum, String stuName, String stuCourse, String stuBatch, int stuPhoneNum) {
	super();
	this.stuRollNum = stuRollNum;
	this.stuName = stuName;
	this.stuCourse = stuCourse;
	this.stuBatch = stuBatch;
	this.stuPhoneNum = stuPhoneNum;
}
@Override
public String toString() {
	return "Student [stuRollNum=" + stuRollNum + ", stuName=" + stuName + ", stuCourse=" + stuCourse
			+ ", stuBatch=" + stuBatch + ", stuPhoneNum=" + stuPhoneNum + "]";
}
  
  
  

}
