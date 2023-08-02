
// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class REVSparkMaxes extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */

CANSparkMax m_leftBackMotor;
CANSparkMax m_leftFrontMotor;
CANSparkMax m_rightBackMotor;
CANSparkMax m_rightFrontMotor;

  public REVSparkMaxes() {  
    m_leftFrontMotor = new CANSparkMax(4, MotorType.kBrushless);
    m_leftBackMotor = new CANSparkMax(3, MotorType.kBrushless);
    m_rightFrontMotor = new CANSparkMax(5, MotorType.kBrushless);
    m_rightBackMotor = new CANSparkMax(2, MotorType.kBrushless);

    /**
     * The RestoreFactoryDefaults method can be used to reset the configuration parameters
     * in the SPARK MAX to their factory default state. If no argument is passed, these
     * parameters will not persist between power cycles
     */
    
     m_leftFrontMotor.restoreFactoryDefaults();
    m_leftBackMotor.restoreFactoryDefaults();
    m_rightFrontMotor.restoreFactoryDefaults();
    m_rightBackMotor.restoreFactoryDefaults();
}


  /**
   * Example command factory method.
   *
   * @return a command
   */
  public CommandBase exampleMethodCommand() {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return runOnce(
        () -> {
          /* one-time action goes here */
        });
  }



  /**
   * An example method querying a boolean state of the subsystem (for example, a digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
  public boolean exampleCondition() {
    // Query some boolean state, such as a digital sensor.
    return false;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}

  
