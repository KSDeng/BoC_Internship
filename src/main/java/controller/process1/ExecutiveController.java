package controller.process1;

import dao.DbProcesser;
import entity.process1.DirectorFormP1;
import entity.process1.StaffFormP1;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("daily_process/process1/executive")
public class ExecutiveController {

    // 同意请求
    @RequestMapping("/approve")
    public void approveApplication(HttpServletRequest request,
                                   HttpServletResponse response,
                                   @ModelAttribute StaffFormP1 staffForm)
            throws Exception{

        System.out.println("Executive officer approves application.");
        System.out.println("Form submitted: " + staffForm);

        request.setAttribute("formSubmitted", staffForm);

        // 将数据存入数据库
        DbProcesser.insertStaffForm(staffForm);

        request.getRequestDispatcher("/pages/daily_process/process1/staff.jsp").forward(request, response);

    }

    // 拒绝请求
    @RequestMapping("/reject")
    public void rejectApplication(HttpServletRequest request,
                                  HttpServletResponse response,
                                  @ModelAttribute DirectorFormP1 directorForm)
        throws Exception{
        System.out.println("Executive officer rejects application.");
        System.out.println("Form submitted: " + directorForm);
        request.setAttribute("formSubmitted", directorForm);

        directorForm.setState("2");
        DbProcesser.insertDirectorForm(directorForm);

        request.getRequestDispatcher("/pages/daily_process/process1/rejected.jsp").forward(request, response);

    }



}
