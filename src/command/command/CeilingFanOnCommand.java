package command.command;

import command.receiver.CeilingFan;

public class CeilingFanOnCommand implements Command {

    private CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.on();
    }
}
