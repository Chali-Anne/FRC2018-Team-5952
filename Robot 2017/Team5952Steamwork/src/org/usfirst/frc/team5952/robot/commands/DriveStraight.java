package org.usfirst.frc.team5952.robot.commands;

import org.usfirst.frc.team5952.robot.Robot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveStraight extends Command {
	
	static final double Kp = 0.03;

	double targetDistance;
	double targetSpeed;
	

    public DriveStraight(double distance, double speed) {
    	
    
    	targetDistance = distance;
    	targetSpeed = speed;
    	
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	 Robot.drivetrain.reset();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {

    	double angle = Robot.ahrs.getAngle();
    	Robot.drivetrain.driveTest(targetSpeed, -angle * Kp);
		Timer.delay(0.01);

    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
  
    	if (Robot.drivetrain.left_encoder.getDistance() > targetDistance) {
    		
    		return true;
    		
    	}

		return false;

	}

	// Called once after isFinished returns true
	protected void end() {
		Robot.drivetrain.driveTest(0, 0);
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
		end();
	}
}
