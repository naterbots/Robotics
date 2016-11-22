package org.usfirst.frc.team2509.robot.commands;

import org.usfirst.frc.team2509.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;


public class LiftDown extends Command {

    public LiftDown() {
    	requires(Robot.lift);
    }
    protected void initialize() {
    	Robot.lift.Down();
    }
    protected void execute() {
    }
    protected boolean isFinished() {
        return false;
    }
    protected void end() {
    	Robot.lift.Stop();
    }
    protected void interrupted() {
    	end();
    }
}