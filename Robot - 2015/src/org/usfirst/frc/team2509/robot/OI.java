package org.usfirst.frc.team2509.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;


public class OI {

    public Joystick leftStick;
    public Joystick rightStick;
    public OI() {
    	//Define Joystick
        leftStick = new Joystick(0);
        rightStick = new Joystick(1);
    }
    public Joystick getleftStick() {
        return leftStick;
    }
    public Joystick getrightStick(){
    	return rightStick;
    }
}

