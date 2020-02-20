package commands;

import commands.FrontCommand;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;

public class UnknownCommand extends FrontCommand {

    @Override
    public void process() {
        System.out.println("Error: Comando desconocido.");
       
    }

}
