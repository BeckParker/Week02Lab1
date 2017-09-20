package sait.cprg252;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 679810
 */
public class AgeCalculatorServlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String age = request.getParameter("inputBox");
        request.setAttribute("currentAge", age);
        
        
        
        int updateAge;
        
        if (age == null) {
            
            getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").
                forward(request, response);
        }else if (age.isEmpty()) {
            
            request.setAttribute("currentAge", age);
            request.setAttribute("updatedAge", "Please enter a number.");
            
            getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").
                forward(request, response);
        } else {
            boolean isValid = false;
            try {
                Integer.parseInt(age);
                isValid = true;
            } catch (NumberFormatException e) {
                request.setAttribute("updatedAge", "Please enter a number.");
                isValid = false;
        }
            
            if (isValid == true) {
            updateAge = Integer.parseInt(age);
            updateAge = updateAge + 1;
            String updatedAge = updateAge + "";
        
            request.setAttribute("currentAge", age);
            request.setAttribute("updatedAge", "Your age next birthday will be " + updatedAge + ".");
        
            getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").
                forward(request, response);
            } else {
                request.setAttribute("updatedAge", "Please enter a number.");
                getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").
                forward(request, response);
            }
        }
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //TODO
    }
}
