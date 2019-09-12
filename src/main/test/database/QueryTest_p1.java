package database;

import dao.process1.IDirectorFormDao;
import dao.process1.IExecutiveFormDao;
import dao.process1.IStaffFormDao;
import entity.process1.DirectorFormP1;
import entity.process1.ExecutiveFormP1;
import entity.process1.StaffFormP1;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class QueryTest_p1 {

    private InputStream in;
    private SqlSessionFactory factory;
    private SqlSession session;
    private IDirectorFormDao directorFormDao;
    private IStaffFormDao staffFormDao;
    private IExecutiveFormDao executiveFormDao;

    @Before
    public void init() throws Exception{
        in = Resources.getResourceAsStream("mybatis-config.xml");
        factory = new SqlSessionFactoryBuilder().build(in);
        session = factory.openSession();
        directorFormDao = session.getMapper(IDirectorFormDao.class);
        staffFormDao = session.getMapper(IStaffFormDao.class);
        executiveFormDao = session.getMapper(IExecutiveFormDao.class);
    }

    @After
    public void destroy() throws Exception{
        session.commit();
        session.close();
        in.close();
    }

    @Test
    public void testDirectorFindAll(){
        List<DirectorFormP1> res = directorFormDao.findAll();
        for(DirectorFormP1 df: res){
            System.out.println(df);
        }
    }

    @Test
    public void testDirectorInsert(){

        DirectorFormP1 df = new DirectorFormP1();
        df.setApplicant_ehr("654321");
        df.setApplicant_name("BBB");
        df.setRecipient_ehr("333");
        df.setApplicant_time(new Date(2019,9,1));
        directorFormDao.insertDirectorForm(df);

    }

    @Test
    public void testDirectorTruncate(){
        directorFormDao.truncateTable();
    }

    @Test
    public void testExecutiveFindAll(){
        List<ExecutiveFormP1> res = executiveFormDao.findAll();
        for(ExecutiveFormP1 ef: res){
            System.out.println(ef);
        }
    }

    @Test
    public void testExecutiveInsert(){
        ExecutiveFormP1 ef = new ExecutiveFormP1();
        ef.setApplicant_ehr("AAA");
        executiveFormDao.insertExecutiveForm(ef);
    }

    @Test
    public void testExecutiveTruncate(){
        executiveFormDao.truncateTable();
    }

    @Test
    public void testStaffFindAll(){
        List<StaffFormP1> res = staffFormDao.findAll();
        for(StaffFormP1 sf: res){
            System.out.println(sf);
        }
    }

    @Test
    public void testStaffInsert(){
        StaffFormP1 sf = new StaffFormP1();
        sf.setApplicant_ehr("CCC");
        staffFormDao.insertStaffForm(sf);
    }

    @Test
    public void testStaffTruncate(){
        staffFormDao.truncateTable();
    }

}
