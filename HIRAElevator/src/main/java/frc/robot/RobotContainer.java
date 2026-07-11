// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.Constants.OperatorConstants;
import frc.robot.States.ElevatorStates;
// import frc.robot.commands.Autos;
import frc.robot.commands.ElevatorCommand;
// import frc.robot.commands.ExampleCommand;
import frc.robot.subsystems.Elevator;
import frc.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;

public class RobotContainer {
  
  private final CommandXboxController driver0 = new CommandXboxController(0);

  private final Elevator s_elevator = new Elevator();

  private final ElevatorCommand c_elevator = new ElevatorCommand(s_elevator); 

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the trigger bindings
    configureBindings();
  }

  private void configureBindings() {
    // Schedule `ExampleCommand` when `exampleCondition` changes to `true
    // Schedule `exampleMethodCommand` when the Xbox controller's B button is pressed,
    // cancelling on release.
    driver0.pov(0).toggleOnTrue(c_elevator.set_elevator_state(ElevatorStates.UP));
    driver0.pov(180).toggleOnTrue(c_elevator.set_elevator_state(ElevatorStates.DOWN)); 
    driver0.a().toggleOnTrue(c_elevator.set_elevator_state(ElevatorStates.STOP));
  }

}
