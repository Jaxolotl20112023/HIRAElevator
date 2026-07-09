package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.States.ElevatorStates;

public class Elevator extends SubsystemBase {
    
    SparkMax m_elevator; 

    public Elevator() {
        m_elevator = new SparkMax(Constants.ElevatorConstants.device_id,MotorType.kBrushless);  
    }

    @Override
    public void periodic() {
        
    }

    public void set_state(ElevatorStates state) { 
        m_elevator.set(state.speed); 
    }
}
