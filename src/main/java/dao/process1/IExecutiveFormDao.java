package dao.process1;

import entity.process1.ExecutiveFormP1;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface IExecutiveFormDao {

    // Find all values
    @Select("SELECT * FROM EXECUTIVE_FORM")
    @Results(id = "executiveFormMap", value = {
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
            @Result(property = "state", column = "STATE"),
            @Result(property = "applicant_time", column = "APPLICANT_TIME")
    })
    List<ExecutiveFormP1> findAll();


    // Insert one piece of record into table
    @Insert("INSERT INTO EXECUTIVE_FORM " +
            "(APPLICANT_EHR, APPLICANT_NAME, RECIPIENT_EHR, RECIPIENT_NAME, MANUAL_ITEM, " +
            "MANUAL_DETAIL, INTEGRAL_SCORE, INTEGRAL_LOCATION, INTEGRAL_DESCRIPTION, INTEGRAL_REMARK, " +
            "PROCESSINSTID, STATE, APPLICANT_TIME)" +
            " VALUES (" +
            "#{applicant_ehr, jdbcType=VARCHAR}, " +
            "#{applicant_name, jdbcType=VARCHAR}, " +
            "#{recipient_ehr, jdbcType=VARCHAR}, " +
            "#{recipient_name, jdbcType=VARCHAR}, " +
            "#{manual_item, jdbcType=VARCHAR}, " +
            "#{manual_detail, jdbcType=VARCHAR}, " +
            "#{integral_score, jdbcType=VARCHAR}, " +
            "#{integral_location, jdbcType=VARCHAR}, " +
            "#{integral_description, jdbcType=VARCHAR}, " +
            "#{integral_remark, jdbcType=VARCHAR}, " +
            "#{process_inst_id, jdbcType=VARCHAR}, " +
            "#{state, jdbcType=VARCHAR}, " +
            "#{applicant_time, jdbcType=DATE} " +
            ")")
    @ResultMap("executiveFormMap")
    void insertExecutiveForm(ExecutiveFormP1 form);

    // Delete all the data in the table
    @Update("TRUNCATE TABLE EXECUTIVE_FORM")
    void truncateTable();
}
