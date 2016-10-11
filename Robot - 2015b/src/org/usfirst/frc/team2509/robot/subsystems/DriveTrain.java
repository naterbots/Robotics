// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc.team2509.robot.subsystems;

import org.usfirst.frc.team2509.robot.*;
import org.usfirst.frc.team2509.robot.subsystems.*;
import org.usfirst.frc.team2509.robot.commands.*;


import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class DriveTrain extends Subsystem {

    private final SpeedController motorR = RobotMap.driveTrainMotorR;
    private final SpeedController motorL = RobotMap.driveTrainMotorL;
    private final RobotDrive robotDrive = RobotMap.driveTrainRobotDrive;

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
    public void tankDrive(Joystick gamepad){
    	robotDrive.tankDrive(gamepad.getRawAxis(1), gamepad.getRawAxis(3));
    }
    public void DriveControl(){
    	robotDrive.tankDrive(Robot.oi.gamepad.getRawAxis(1), 
		Robot.oi.gamepad.getRawAxis(3));
    }
    public void Forward(){
    	motorR.set(0.5);
    	motorL.set(0.5);
    }
    public void Backward(){
    	motorR.set(-0.5);
    	motorL.set(-0.5);
    }
    public void Stop(){
    	motorR.set(0);
    	motorL.set(0);
    }
}
