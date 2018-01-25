package org.usfirst.frc.team5952.robot;

import org.usfirst.frc.team5952.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ArmCommand extends Command {
    private Robot _robot;
    private int _direction = 0;

    public ArmCommand(Robot robot, int direction) {
    	_robot = robot;
    	
        if (Math.abs(direction) != 1) {
            _direction = direction;
        }
    }

    protected void initialize() {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        _robot.arm.setSpeed(1 * _direction);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
        _robot.arm.setSpeed(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        end();
    }
}
