/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team5952.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.usfirst.frc.team5952.robot.subsystem.*;

/**
 * This is a demo program showing the use of the RobotDrive class, specifically
 * it contains the code necessary to operate a robot with tank drive.
 */
public class Robot extends IterativeRobot {
	private DifferentialDrive m_myRobot;
	private Joystick joy;
	public Talon arm;
	private ArmSubsystem test; 

	@Override
	public void robotInit() {
		m_myRobot = new DifferentialDrive(new Talon(0), new Talon(1));
		arm = new Talon(2);
		
		joy = new Joystick(0);
				
		JoystickButton b5 = new JoystickButton(joy, 5);
		JoystickButton b3 = new JoystickButton(joy, 3);
		
		b5.toggleWhenPressed(new Test());
		b3.toggleWhenPressed(new Test());
	}

	@Override
	public void teleopPeriodic() {
		m_myRobot.arcadeDrive(joy.getY(), joy.getX());
	}
}


