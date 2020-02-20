/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;

/**
 *
 * @author yonay
 */
public class ListCommand extends FrontCommand {
    
    
    @Override
    public void process() {
        HttpSession session = request.getSession(true);
        List<String> lista = (List<String>) session.getAttribute("lista");
        if (lista == null) lista = new ArrayList<>(); session.setAttribute("lista", lista);
        if(request.getParameter("cosa") != null) lista.add(request.getParameter("cosa"));
        
        try {
            forward("/SessionFormView");
        } catch (ServletException | IOException ex) {
            Logger.getLogger(ListCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}