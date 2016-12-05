// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2509.Robot2015d.v1;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController robotDrivelMotor;
    public static SpeedController robotDriverMotor;
    public static RobotDrive robotDriveRobotDrive21;
    public static DoubleSolenoid gripPiston;
    public static DoubleSolenoid guidePiston;
    public static SpeedController liftlMotor;
    public static SpeedController liftrMotor;
    public static DoubleSolenoid armPiston;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        robotDrivelMotor = new Talon(0);
        LiveWindow.addActuator("RobotDrive", "lMotor", (Talon) robotDrivelMotor);
        
        robotDriverMotor = new Talon(1);
        LiveWindow.addActuator("RobotDrive", "rMotor", (Talon) robotDriverMotor);
        
        robotDriveRobotDrive21 = new RobotDrive(robotDrivelMotor, robotDriverMotor);
        
        robotDriveRobotDrive21.setSafetyEnabled(true);
        robotDriveRobotDrive21.setExpiration(0.1);
        robotDriveRobotDrive21.setSensitivity(0.5);
        robotDriveRobotDrive21.setMaxOutput(1.0);

        gripPiston = new DoubleSolenoid(0, 0, 1);
        LiveWindow.addActuator("Grip", "Piston", gripPiston);
        
        guidePiston = new DoubleSolenoid(0, 2, 3);
        LiveWindow.addActuator("Guide", "Piston", guidePiston);
        
        liftlMotor = new Talon(2);
        LiveWindow.addActuator("Lift", "lMotor", (Talon) liftlMotor);
        
        liftrMotor = new Talon(3);
        LiveWindow.addActuator("Lift", "rMotor", (Talon) liftrMotor);
        
        armPiston = new DoubleSolenoid(0, 4, 5);
        LiveWindow.addActuator("Arm", "Piston", armPiston);
        

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
