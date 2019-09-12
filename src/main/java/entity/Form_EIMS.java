package entity;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

// 流程提交表格的父类
public class Form_EIMS implements Serializable {
    String applicant_ehr;       // 申请人EHR号
    String applicant_name;      // 申请人姓名
    String recipient_ehr;       // 受分人EHR号
    String recipient_name;      // 受分人姓名
    String manual_item;         // 积分条目
    String manual_detail;       // 积分细则
    String integral_score;      // 增减分数
    String integral_location;   // 地点
    String integral_description;// 积分说明
    String integral_remark;     // 备注
    String process_inst_id;     // 流程实例号, 系统生成
    String state;               // 状态(1-发起, 2-退回, 3-终止), 根据当前状态在后台进行设置
    Date applicant_time;        // 申请时间, 根据系统当前时间设置

    // 构造函数中对系统属性生成的属性进行初始化
    public void initForm(){
        Date current = new Date();
        this.applicant_time = current;
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd_HHmmss");
        this.process_inst_id = "DIRECTOR_APPLY_" + df.format(current);  // 生成序列号
        this.state = "1";             // 1-发起, 2-退回, 3-终止
    }

    public Form_EIMS(){
        initForm();
    }

    public String getApplicant_ehr() {
        return applicant_ehr;
    }

    public void setApplicant_ehr(String applicant_ehr) {
        this.applicant_ehr = applicant_ehr;
    }

    public String getApplicant_name() {
        return applicant_name;
    }

    public void setApplicant_name(String applicant_name) {
        this.applicant_name = applicant_name;
    }

    public String getRecipient_ehr() {
        return recipient_ehr;
    }

    public void setRecipient_ehr(String recipient_ehr) {
        this.recipient_ehr = recipient_ehr;
    }

    public String getRecipient_name() {
        return recipient_name;
    }

    public void setRecipient_name(String recipient_name) {
        this.recipient_name = recipient_name;
    }

    public String getManual_item() {
        return manual_item;
    }

    public void setManual_item(String manual_item) {
        this.manual_item = manual_item;
    }

    public String getManual_detail() {
        return manual_detail;
    }

    public void setManual_detail(String manual_detail) {
        this.manual_detail = manual_detail;
    }

    public String getIntegral_score() {
        return integral_score;
    }

    public void setIntegral_score(String integral_score) {
        this.integral_score = integral_score;
    }

    public String getIntegral_location() {
        return integral_location;
    }

    public void setIntegral_location(String integral_location) {
        this.integral_location = integral_location;
    }

    public String getIntegral_description() {
        return integral_description;
    }

    public void setIntegral_description(String integral_description) {
        this.integral_description = integral_description;
    }

    public String getIntegral_remark() {
        return integral_remark;
    }

    public void setIntegral_remark(String integral_remark) {
        this.integral_remark = integral_remark;
    }

    public String getProcess_inst_id() {
        return process_inst_id;
    }

    public void setProcess_inst_id(String process_inst_id) {
        this.process_inst_id = process_inst_id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getApplicant_time() {
        return applicant_time;
    }

    public void setApplicant_time(Date applicant_time) {
        this.applicant_time = applicant_time;
    }

    @Override
    public String toString() {
        return "Form_EIMS{" +
                "applicant_ehr='" + applicant_ehr + '\'' +
                ", applicant_name='" + applicant_name + '\'' +
                ", recipient_ehr='" + recipient_ehr + '\'' +
                ", recipient_name='" + recipient_name + '\'' +
                ", manual_item='" + manual_item + '\'' +
                ", manual_detail='" + manual_detail + '\'' +
                ", integral_score='" + integral_score + '\'' +
                ", integral_location='" + integral_location + '\'' +
                ", integral_description='" + integral_description + '\'' +
                ", integral_remark='" + integral_remark + '\'' +
                ", process_inst_id='" + process_inst_id + '\'' +
                ", state='" + state + '\'' +
                ", applicant_time=" + applicant_time +
                '}';
    }
}
