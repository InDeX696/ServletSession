package commands;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;

public class HelloWorldCommand extends FrontCommand {

    @Override
    public void process() {
        System.out.println("Hola Mundo");
        request.setAttribute("command","HelloWorldCommand");
        try {
            forward("/View");
        } catch (ServletException | IOException ex) {
            Logger.getLogger(HelloWorldCommand.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
