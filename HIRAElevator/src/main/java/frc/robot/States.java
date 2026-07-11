package frc.robot;

public class States {

    public enum ElevatorStates {
        UP(0.05),
        DOWN(-0.05),
        STOP(0); 

        public final double speed; 

        ElevatorStates(double speed) {
            this.speed = speed; 
        }
    }
}

