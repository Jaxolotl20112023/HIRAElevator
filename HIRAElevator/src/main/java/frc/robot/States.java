package frc.robot;

public class States {

    public enum ElevatorStates {
        UP(0.15),
        DOWN(-0.15);

        public final double speed; 

        ElevatorStates(double speed) {
            this.speed = speed; 
        }
    }
}

