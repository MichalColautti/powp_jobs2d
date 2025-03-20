package edu.kis.powp.command;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand {
    List<DriverCommand> commands = new ArrayList<>();

    public void add_command(DriverCommand command) {
        commands.add(command);
    }

    @Override
    public void execute() {
        commands.forEach(DriverCommand::execute);
    }
}
