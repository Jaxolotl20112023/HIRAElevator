package frc.robot;

public class States {

    public enum ElevatorStates {
        UP(1),
        DOWN(-1);

        public final int speed; 

        ElevatorStates(int speed) {
            this.speed = speed; 
        }
    }
}

