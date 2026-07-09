package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.InstantCommand;
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

    public InstantCommand set_elevator_state(ElevatorStates elevator_state) {
        this.elevator_state = elevator_state; 
        return new InstantCommand(()-> s_elevator.set_state(elevator_state),s_elevator); 
    }
}
