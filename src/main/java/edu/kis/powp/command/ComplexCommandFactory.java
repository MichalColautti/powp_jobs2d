package edu.kis.powp.command;

import edu.kis.powp.jobs2d.AbstractDriver;

public class ComplexCommandFactory {
    public static ComplexCommand rectangle(AbstractDriver driver) {
        ComplexCommand complexCommand = new ComplexCommand();

        complexCommand.add_command(new SetPositionCommand(0,0,driver));
        complexCommand.add_command(new OperateToCommand(100,0,driver));
        complexCommand.add_command(new OperateToCommand(100,100,driver));
        complexCommand.add_command(new OperateToCommand(0,100,driver));
        complexCommand.add_command(new OperateToCommand(0,0,driver));

        return complexCommand;
    }

    public static ComplexCommand triangle(AbstractDriver driver) {
        ComplexCommand complexCommand = new ComplexCommand();

        complexCommand.add_command(new SetPositionCommand(0,0,driver));
        complexCommand.add_command(new OperateToCommand(100,-100,driver));
        complexCommand.add_command(new OperateToCommand(200,0,driver));
        complexCommand.add_command(new OperateToCommand(0,0,driver));

        return complexCommand;
    }
}
