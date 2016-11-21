// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc.team2509.robot;

import org.usfirst.frc.team2509.robot.commands.ArmOff;
import org.usfirst.frc.team2509.robot.commands.ArmOn;
import org.usfirst.frc.team2509.robot.commands.ArmsIn;
import org.usfirst.frc.team2509.robot.commands.ArmsStandbye;
import org.usfirst.frc.team2509.robot.commands.DriveBack;
import org.usfirst.frc.team2509.robot.commands.DriveForward;
import org.usfirst.frc.team2509.robot.commands.GripOff;
import org.usfirst.frc.team2509.robot.commands.GripOn;
import org.usfirst.frc.team2509.robot.commands.IntakeCMD;
import org.usfirst.frc.team2509.robot.commands.IntakeOff;
import org.usfirst.frc.team2509.robot.commands.LLiftDown;
import org.usfirst.frc.team2509.robot.commands.LLiftStop;
import org.usfirst.frc.team2509.robot.commands.LLiftUp;
import org.usfirst.frc.team2509.robot.commands.RLiftDown;
import org.usfirst.frc.team2509.robot.commands.RLiftStop;
import org.usfirst.frc.team2509.robot.commands.RLiftUp;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;



/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());

    public JoystickButton Intake_a;
    public JoystickButton Intake_b;
    public JoystickButton Grip_a;
    public JoystickButton Grip_b;
    public JoystickButton LiftUpL_a;
    public JoystickButton LiftUpR_a;
    public JoystickButton LiftUpL_b;
    public JoystickButton LiftUpR_b;
    public JoystickButton LiftDownL_a;
    public JoystickButton LiftDownR_a;
    public JoystickButton LiftDownL_b;
    public JoystickButton LiftDownR_b;
    public Joystick gamepad;


    public OI() {
        gamepad = new Joystick(0);
        
        LiftDownR_b = new JoystickButton(gamepad, 3);
        LiftDownR_b.whenReleased(new RLiftStop());
        LiftDownL_b = new JoystickButton(gamepad, 3);
        LiftDownL_b.whenReleased(new LLiftStop());
        LiftDownR_a = new JoystickButton(gamepad, 3);
        LiftDownR_a.whileHeld(new RLiftDown());
        LiftDownL_a = new JoystickButton(gamepad, 3);
        LiftDownL_a.whileHeld(new LLiftDown());
        LiftUpR_b = new JoystickButton(gamepad, 2);
        LiftUpR_b.whenReleased(new RLiftStop());
        LiftUpL_b = new JoystickButton(gamepad, 2);
        LiftUpL_b.whenReleased(new LLiftStop());
        LiftUpR_a = new JoystickButton(gamepad, 2);
        LiftUpR_a.whileHeld(new RLiftUp());
        LiftUpL_a = new JoystickButton(gamepad, 2);
        LiftUpL_a.whileHeld(new LLiftUp());
        Grip_b = new JoystickButton(gamepad, 4);
        Grip_b.whenPressed(new GripOff());
        Grip_a = new JoystickButton(gamepad, 4);
        Grip_a.whenPressed(new GripOn());
        Intake_b = new JoystickButton(gamepad, 1);
        Intake_b.whenReleased(new IntakeOff());
        Intake_a = new JoystickButton(gamepad, 1);
        Intake_a.whileHeld(new IntakeCMD());


        // SmartDashboard Buttons
        SmartDashboard.putData("L Lift Up", new LLiftUp());
        SmartDashboard.putData("L Lift Down", new LLiftDown());
        SmartDashboard.putData("L Lift Stop", new LLiftStop());
        SmartDashboard.putData("Arms In", new ArmsIn());
        SmartDashboard.putData("Arms Standbye", new ArmsStandbye());
        SmartDashboard.putData("Grip Off", new GripOff());
        SmartDashboard.putData("Grip On", new GripOn());
        SmartDashboard.putData("Intake CMD", new IntakeCMD());
        SmartDashboard.putData("Arm On", new ArmOn());
        SmartDashboard.putData("Arm Off", new ArmOff());
        SmartDashboard.putData("Intake Off", new IntakeOff());
        SmartDashboard.putData("R Lift Up", new RLiftUp());
        SmartDashboard.putData("R Lift Stop", new RLiftStop());
        SmartDashboard.putData("R Lift Down", new RLiftDown());
        SmartDashboard.putData("Drive Forward", new DriveForward());
        SmartDashboard.putData("Drive Back", new DriveBack());
        SmartDashboard.putBoolean("L Limit Top", RobotMap.leftLiftLimitSwitchLT.get());
        SmartDashboard.putBoolean("L Limit Bottom", RobotMap.leftLiftLimitSwitchLT.get());
        SmartDashboard.putBoolean("R Limit Top", RobotMap.rightLiftLimitSwitchRT.get());
        SmartDashboard.putBoolean("R Limit Bottom", RobotMap.rightLiftLimitSwitchRB.get());

        
    }

    public Joystick getGamepad() {
        return gamepad;
    }
}

