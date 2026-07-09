package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Subsystem;
import frc.robot.States.ElevatorStates;
import frc.robot.subsystems.Elevator;

public class ElevatorCommand extends Command{
    
    private final Elevator s_elevator; 
    private ElevatorStates elevator_state; 

    public ElevatorCommand(Elevator s_elevator) {
        this.s_elevator = s_elevator;
        addRequirements(s_elevator); 
    }

    public ElevatorStates get_elevator_state() {
        return elevator_state; 
    }

    public void set_elevator_state() {

    }
}
