package checkpoint.andela.members;

import checkpoint.andela.main.*;

/**
 * Represents staff information.
 */
public class Staff extends Member{

    /**
     * Book Class Properties
     */
    private String staffNumber;

    private double netPay;

    private Students student;

    /**
     * Create a new staff with default properties
     */
    public Staff(){
    }
    /**
     *  Create a new staff with specific properties
     */
    public Staff (String staffNumber,double netPay){

        this.staffNumber = staffNumber;

        this.netPay = netPay;
    }

    public String getStaffNumber() {
        return staffNumber;
    }

    public void setStaffNumber(String staffNumber) {
        this.staffNumber = staffNumber;
    }

    public double getNetPay() {
        return netPay;
    }

    public void setNetPay(double netPay) {
        this.netPay = netPay;
    }

    public void assignToStudent(String studentNo){

        studentNo = student.getStudentNumber();
    }
}
