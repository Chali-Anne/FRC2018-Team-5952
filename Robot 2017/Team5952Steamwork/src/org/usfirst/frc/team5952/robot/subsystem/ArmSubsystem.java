package org.usfirst.frc.team5952.robot.subsystem;

import org.usfirst.frc.team5952.robot.Robot;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class ArmSubsystem extends Subsystem {
	private SpeedController _moteurBras = new Talon(2);

	public void initDefaultCommand() {
	}

	public ArmSubsystem() {
	}

	public void setSpeed(double speed) {
		_moteurBras.set(speed);
	}

	public double getAngle(){
		return 2;
	}
}
