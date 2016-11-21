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

import org.usfirst.frc.team2509.robot.subsystems.DriveTrain;
import org.usfirst.frc.team2509.robot.subsystems.Grip;
import org.usfirst.frc.team2509.robot.subsystems.Guides;
import org.usfirst.frc.team2509.robot.subsystems.Intake;
import org.usfirst.frc.team2509.robot.subsystems.LeftLift;
import org.usfirst.frc.team2509.robot.subsystems.RightLift;

import com.ni.vision.NIVision;
import com.ni.vision.NIVision.Image;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.vision.AxisCamera;


/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	
    Command autonomousCommand;
    public static OI oi;
    public static Compressor Comp;
    public static DriveTrain driveTrain;
    public static Grip grip;
    public static Intake intake;
    public static LeftLift leftLift;
    public static RightLift rightLift;
    public static Guides guides;
    public String Tele; 
    int session;
    Image frame;
    AxisCamera camera;

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    
    public void robotInit() {
    RobotMap.init();
        Comp = new Compressor();
        driveTrain = new DriveTrain();
        grip = new Grip();
        intake = new Intake();
        leftLift = new LeftLift();
        rightLift = new RightLift();
        
        /**
         *  OI must be constructed after subsystems. If the OI creates Commands
         *  (which it very likely will), subsystems are not guaranteed to be
         *  constructed yet. Thus, their requires() statements may grab null
         *  pointers. Bad news. DON'T MOVE IT!
         */
        
        oi = new OI();//DO NOT MOVE THIS BEFORE THE SUBSYS
        Comp.start();
        frame = NIVision.imaqCreateImage(NIVision.ImageType.IMAGE_RGB, 0);
        // open the camera at the IP address assigned. This is the IP address that the camera
        // can be accessed through the web interface.
        camera = new AxisCamera("10.1.91.100");
    }

    /**
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */
    public void disabledInit(){

    }

    public void disabledPeriodic() {
        Scheduler.getInstance().run();
    }

    public void autonomousInit() {
        // schedule the autonomous command (example)
        if (autonomousCommand != null) autonomousCommand.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
    	Robot.driveTrain.DriveControl();
        // This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (autonomousCommand != null) autonomousCommand.cancel();
        
        
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
    	while (isOperatorControl() && isEnabled()){
        	camera.getImage(frame);
        	CameraServer.getInstance().setImage(frame);
        	}
        Scheduler.getInstance().run();
    }

    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
       
    }
}
