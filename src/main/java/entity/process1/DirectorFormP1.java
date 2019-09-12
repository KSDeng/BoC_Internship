package entity.process1;

import entity.Form_EIMS;

public class DirectorFormP1 extends Form_EIMS {

    String approval_executive;          // 申请人根据选项进行选择
    String approval_executive_comment;  // 下一个节点获得

    public DirectorFormP1(){
        super();
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
        return "DirectorFormP1{" +
                super.toString() +
                ", approval_executive='" + approval_executive + '\'' +
                ", approval_executive_comment='" + approval_executive_comment + '\'' +
                '}';
    }

}
