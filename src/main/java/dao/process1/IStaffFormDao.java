package dao.process1;

import entity.process1.StaffFormP1;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface IStaffFormDao {
    // Find all values
    @Select("SELECT * FROM STAFF_FORM")
    @Results(id = "staffFormMap", value = {
            @Result(property = "applicant_ehr", column = "APPLICANT_EHR"),
            @Result(property = "applicant_name", column = "APPLICANT_NAME"),
            @Result(property = "recipient_ehr", column = "RECIPIENT_EHR"),
            @Result(property = "recipient_name", column = "RECIPIENT_NAME"),
            @Result(property = "manual_item", column = "MANUAL_ITEM"),
            @Result(property = "manual_detail", column = "MANUAL_DETAIL"),
            @Result(property = "integral_score", column = "INTEGRAL_SCORE"),
            @Result(property = "integral_location", column = "INTEGRAL_LOCATION"),
            @Result(property = "integral_description", column = "INTEGRAL_DESCRIPTION"),
            @Result(property = "integral_remark", column = "INTEGRAL_REMARK"),
            @Result(property = "process_inst_id", column = "PROCESSINSTID"),
            @Result(property = "approval_director", column = "APPROVAL_DIRECTOR"),
            @Result(property = "approval_director_comment", column = "APPROVAL_DIRECTOR_COMMENT"),
            @Result(property = "approval_executive", column = "APPROVAL_EXECUTIVE"),
            @Result(property = "approval_executive_comment", column = "APPROVAL_EXECUTIVE_COMMENT"),
            @Result(property = "state", column = "STATE"),
            @Result(property = "applicant_time", column = "APPLICANT_TIME")
    })
    List<StaffFormP1> findAll();

    // Insert one piece of record into table
    @Insert("INSERT INTO STAFF_FORM " +
            "(APPLICANT_EHR, APPLICANT_NAME, APPLICANT_TIME, RECIPIENT_EHR, RECIPIENT_NAME, " +
            "MANUAL_ITEM, MANUAL_DETAIL, INTEGRAL_SCORE, INTEGRAL_LOCATION, INTEGRAL_DESCRIPTION, " +
            "INTEGRAL_REMARK, PROCESSINSTID, APPROVAL_DIRECTOR, APPROVAL_DIRECTOR_COMMENT, " +
            "APPROVAL_EXECUTIVE, APPROVAL_EXECUTIVE_COMMENT, STATE)" +
            " VALUES (" +
            "#{applicant_ehr, jdbcType=VARCHAR}, " +
            "#{applicant_name, jdbcType=VARCHAR}, " +
            "#{applicant_time, jdbcType=DATE}, " +
            "#{recipient_ehr, jdbcType=VARCHAR}, " +
            "#{recipient_name, jdbcType=VARCHAR}, " +
            "#{manual_item, jdbcType=VARCHAR}, " +
            "#{manual_detail, jdbcType=VARCHAR}, " +
            "#{integral_score, jdbcType=VARCHAR}, " +
            "#{integral_location, jdbcType=VARCHAR}, " +
            "#{integral_description, jdbcType=VARCHAR}, " +
            "#{integral_remark, jdbcType=VARCHAR}, " +
            "#{process_inst_id, jdbcType=VARCHAR}, " +
            "#{approval_director, jdbcType=VARCHAR}, " +
            "#{approval_director_comment, jdbcType=VARCHAR}, " +
            "#{approval_executive, jdbcType=VARCHAR}, " +
            "#{approval_executive_comment, jdbcType=VARCHAR}, " +
            "#{state, jdbcType=VARCHAR}" +
            ")")
    @ResultMap("staffFormMap")
    void insertStaffForm(StaffFormP1 form);

    // Delete all the data in the table
    @Update("TRUNCATE TABLE STAFF_FORM")
    void truncateTable();
}
