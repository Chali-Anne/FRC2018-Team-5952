package org.usfirst.frc.team5952.robot.commands;

import org.usfirst.frc.team5952.robot.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class GearDropLeftPosition extends CommandGroup {

    public GearDropLeftPosition() {
    	//Avance de 20 pouces
    	addSequential(new DriveStraight(81.891 ,-0.7));
    	//Delais
    	addSequential(new Delay(0.5));
    	// Rotation 45 degrees a droite
    	addSequential(new DriveTurn(0.0,0.3,68.03));
    	//Avance de 20 pouces
    	addSequential(new DriveStraight(100.12, -0.7));
    	// Ouvrir la trappe
    	addSequential(new OpenTrap());
    	//Delais
    	addSequential(new Delay(0.6));
    	//recule de 20 pouces
    	addSequential(new DriveStraightReverse(60, 0.6));
    	// Rotation 45 degrees a gauche
    	addSequential(new DriveTurn(0.0,0.3,-68.03));
    	//Avance de 20 pouces
    	addSequential(new DriveStraight(72.0,-0.8));
    	// Fermer la trappe
    	addSequential(new CloseTrap());
    	
    	
    }
}
