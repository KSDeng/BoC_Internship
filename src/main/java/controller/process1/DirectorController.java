package controller.process1;

import dao.DbProcesser;
import dao.process1.IDirectorFormDao;
import entity.process1.DirectorFormP1;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("daily_process/process1/director")
public class DirectorController {
    private static IDirectorFormDao directorFormDao;
    static{

    }

    @RequestMapping("/startPage")
    public void startPage(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/pages/daily_process/process1/director.jsp")
                .forward(request, response);
    }

    // 用@ModelAttribute一次性获得form提交的所有字段
    @RequestMapping("/submitApplication")
    public void testModelAttribute(HttpServletRequest request,
                                   HttpServletResponse response,
                                   @ModelAttribute DirectorFormP1 directorForm)
        throws Exception{
        System.out.println("Director application submitted.");
        System.out.println("Form submitted: " + directorForm);

        request.setAttribute("formSubmitted", directorForm);

        // 将提交的数据存入数据库
        DbProcesser.insertDirectorForm(directorForm);
        request.getRequestDispatcher("/pages/daily_process/process1/executive.jsp").forward(request, response);

    }


    @RequestMapping("/terminate")
    public void getRejected(HttpServletRequest request,
                            HttpServletResponse response,
                            @ModelAttribute DirectorFormP1 directorForm)
        throws Exception{
        directorForm.setState("3");     // 终止
        DbProcesser.insertDirectorForm(directorForm);
        // TODO: 弹出对话框


    }
}
