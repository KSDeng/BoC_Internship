package controller.process1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("daily_process/process1/staff")
public class StaffController {

    @RequestMapping("/startPage")
    public void startPage(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException{
        request.getRequestDispatcher("/pages/daily_process/process1/staff.jsp")
                .forward(request, response);
    }
}
