package entity.process1;

import entity.Form_EIMS;


// TODO: "审批主管"和"主管意见"字段似乎无法填写，因为申请本身就是主管发起的？
public class StaffFormP1 extends Form_EIMS {

    String approval_director;   // 审批主管
    String approval_director_comment;   // 主管意见
    String approval_executive;          // 审批总经理, 从主管提交的表格处得到
    String approval_executive_comment;  // 总经理意见

    public String getApproval_director() {
        return approval_director;
    }

    public void setApproval_director(String approval_director) {
        this.approval_director = approval_director;
    }

    public String getApproval_director_comment() {
        return approval_director_comment;
    }

    public void setApproval_director_comment(String approval_director_comment) {
        this.approval_director_comment = approval_director_comment;
    }

    public String getApproval_executive() {
        return approval_executive;
    }

    public void setApproval_executive(String approval_executive) {
        this.approval_executive = approval_executive;
    }

    public String getApproval_executive_comment() {
        return approval_executive_comment;
    }

    public void setApproval_executive_comment(String approval_executive_comment) {
        this.approval_executive_comment = approval_executive_comment;
    }

    @Override
    public String toString() {
        return "StaffFormP1{" +
                "approval_director='" + approval_director + '\'' +
                ", approval_director_comment='" + approval_director_comment + '\'' +
                ", approval_executive='" + approval_executive + '\'' +
                ", approval_executive_comment='" + approval_executive_comment + '\'' +
                "} " + super.toString();
    }
}
