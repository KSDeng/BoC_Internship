package dao.process1;

import entity.process1.DirectorFormP1;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface IDirectorFormDao {

    // Find all values
    @Select("SELECT * FROM DIRECTOR_FORM")
    @Results(id = "directorFormMap", value = {
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
            @Result(property = "approval_executive", column = "APPROVAL_EXECUTIVE"),
            @Result(property = "approval_executive_comment", column = "APPROVAL_EXECUTIVE_COMMENT"),
            @Result(property = "state", column = "STATE"),
            @Result(property = "applicant_time", column = "APPLICANT_TIME")
    })
    List<DirectorFormP1> findAll();

    // Insert one piece of record into table
    @Insert("INSERT INTO DIRECTOR_FORM " +
            "(APPLICANT_EHR, APPLICANT_NAME, RECIPIENT_EHR, RECIPIENT_NAME, MANUAL_ITEM, " +
            "MANUAL_DETAIL, INTEGRAL_SCORE, INTEGRAL_LOCATION, INTEGRAL_DESCRIPTION, INTEGRAL_REMARK, " +
            "PROCESSINSTID, APPROVAL_EXECUTIVE, APPROVAL_EXECUTIVE_COMMENT, STATE, APPLICANT_TIME)" +
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
            "#{approval_executive, jdbcType=VARCHAR}, " +
            "#{approval_executive_comment, jdbcType=VARCHAR}, " +
            "#{state, jdbcType=VARCHAR}, " +
            "#{applicant_time, jdbcType=DATE} " +
            ")")
    @ResultMap("directorFormMap")
    void insertDirectorForm(DirectorFormP1 form);

    // Delete all the data in the table
    @Update("TRUNCATE TABLE DIRECTOR_FORM")
    void truncateTable();

}
