package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.SparkMaxPIDController;
import com.revrobotics.CANSparkMax.SoftLimitDirection;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.revrobotics.SparkMaxPIDController.AccelStrategy;

import frc.twilight.tunables.TunableBoolean;
import frc.twilight.tunables.TunableDouble;

public class TunableSparkMax {

    private CANSparkMax motor;

    public TunableSparkMax(
        
    String name,
    int defaultCurrentLimit,
    int deciveID,
    double P,
    double I,
    double D,
    boolean setIdleMode,
    boolean setInverted,
    boolean enableSoftLimit,
    double setSmartMotionAllowedClosedLoopError,
    double setSmartMotionMaxVelocity


    ){
        motor = new CANSparkMax(0, MotorType.kBrushless);
        SparkMaxPIDController PIDmotor = motor.getPIDController(); 

        new TunableDouble(name + "Set Current Limit", defaultCurrentLimit, true, name, value -> {
            motor.setSecondaryCurrentLimit(value, 0);
          });


        new TunableDouble(name + "Set P", 0, true, name, value -> {
            PIDmotor.setP(P);
          });

        new TunableDouble(name + "Set I", 0, true, name, value -> {
            PIDmotor.setI(I);
          });

        new TunableDouble(name + "Set D", 0, true, name, value -> {
            PIDmotor.setD(D);
          });

        
          new TunableBoolean(name + "Set Idle Mode", false, true, name, value -> {
            motor.setIdleMode(null);
          });

          new TunableBoolean(name + "Set Inverted Mode", false, true, name, value -> {
            motor.setInverted(setInverted);
          });

          new TunableDouble(name + "Enable Forward Soft Limit", 0, true, name, value -> {
            motor.enableSoftLimit(SoftLimitDirection.kForward, enableSoftLimit);
          });

          new TunableDouble(name + "Enable Reverse Soft Limit", 0, true, name, value -> {
            motor.enableSoftLimit(SoftLimitDirection.kReverse, enableSoftLimit);
          });
           new TunableDouble(name + " Set Smart Motion Accel Startegy", 0, true, name, value -> {
             PIDmotor.setSmartMotionAccelStrategy(AccelStrategy.kTrapezoidal, 0);
           });

          new TunableDouble(name + "Set Smart Motion Allowed Closed Loop Error", 0, true, name, value -> {
            PIDmotor.setSmartMotionAllowedClosedLoopError(value,0);
          });

          new TunableDouble(name + "Set Smart Motion Max Accel", 0, true, name, value -> {
            PIDmotor.setSmartMotionMaxAccel(value, 0);
          });

          new TunableDouble(name + "Set Smart Motion Max Velocity", 0, true, name, value -> {
            PIDmotor.setSmartMotionMaxVelocity(value, 0);
          });



          
      
      


          


    }



    
}