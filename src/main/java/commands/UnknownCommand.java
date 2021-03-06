package commands;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;

public class UnknownCommand extends FrontCommand {

    @Override
    public void process() {
        System.out.println("Error: Comando desconocido.");
        request.setAttribute("command","UnKnownCommand");
        try {
            forward("/View");
        } catch (ServletException | IOException ex) {
            Logger.getLogger(HelloWorldCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
