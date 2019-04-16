package frc.robot.subsystems;

import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.Subsystem;

public class NetworkTable extends Subsystem {

  public static NetworkTableInstance inst;
  public DriverStation ds = DriverStation.getInstance();
  public edu.wpi.first.networktables.NetworkTable table;
  
  public NetworkTable() {
		inst = NetworkTableInstance.getDefault();
    table = inst.getTable(""/* <-- Table name here */);
  }

  @Override
  public void initDefaultCommand() {
  }

  public void periodic() {
  }

  public void refresh() {
  }
}