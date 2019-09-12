package dao;

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

import java.io.InputStream;

public class DbProcesser {

    private static InputStream in;
    private static SqlSessionFactory factory;
    private static SqlSession session;
    private static IDirectorFormDao directorFormDao;
    private static IExecutiveFormDao executiveFormDao;
    private static IStaffFormDao staffFormDao;


    private static void init() throws Exception{
        in = Resources.getResourceAsStream("mybatis-config.xml");
        factory = new SqlSessionFactoryBuilder().build(in);
        session = factory.openSession();
    }
    private static void destroy() throws Exception{
        session.commit();
        session.close();
        in.close();
    }

    public static void insertDirectorForm(DirectorFormP1 directorForm) throws Exception{
        init();
        System.out.println("Inserting director form into database.");
        directorFormDao = session.getMapper(IDirectorFormDao.class);
        directorFormDao.insertDirectorForm(directorForm);
        destroy();
    }

    public static void insertStaffForm(StaffFormP1 staffForm) throws Exception{
        init();
        System.out.println("Inserting staff form into database.");
        staffFormDao = session.getMapper(IStaffFormDao.class);
        staffFormDao.insertStaffForm(staffForm);
        destroy();
    }

    public static void insertExecutiveForm(ExecutiveFormP1 executiveForm) throws Exception{
        init();
        System.out.println("Inserting executive form into database.");
        executiveFormDao = session.getMapper(IExecutiveFormDao.class);
        executiveFormDao.insertExecutiveForm(executiveForm);
        destroy();
    }



}
