package frc.robot;

public class States {

    public enum ElevatorStates {
        UP(0.15),
        DOWN(-0.15);

        public final int speed; 

        ElevatorStates(int speed) {
            this.speed = speed; 
        }
    }
}

