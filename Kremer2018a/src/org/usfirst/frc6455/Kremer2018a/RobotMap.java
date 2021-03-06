// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc6455.Kremer2018a;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController drivebaserightrear;
    public static SpeedController drivebaseleftfront;
    public static SpeedController drivebaseleftrear;
    public static SpeedController drivebaserightfront;
    public static RobotDrive drivebaserobotDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        drivebaserightrear = new Spark(1);
        LiveWindow.addActuator("drivebase", "rightrear", (Spark) drivebaserightrear);
        drivebaserightrear.setInverted(false);
        drivebaseleftfront = new Spark(2);
        LiveWindow.addActuator("drivebase", "leftfront", (Spark) drivebaseleftfront);
        drivebaseleftfront.setInverted(true);
        drivebaseleftrear = new Spark(3);
        LiveWindow.addActuator("drivebase", "leftrear", (Spark) drivebaseleftrear);
        drivebaseleftrear.setInverted(false);
        drivebaserightfront = new Spark(0);
        LiveWindow.addActuator("drivebase", "rightfront", (Spark) drivebaserightfront);
        drivebaserightfront.setInverted(true);
        drivebaserobotDrive = new RobotDrive(drivebaseleftfront, drivebaseleftrear,
              drivebaserightfront, drivebaserightrear);
        
        drivebaserobotDrive.setSafetyEnabled(false);
        drivebaserobotDrive.setExpiration(0.1);
        drivebaserobotDrive.setSensitivity(0.5);
        drivebaserobotDrive.setMaxOutput(1.0);


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
