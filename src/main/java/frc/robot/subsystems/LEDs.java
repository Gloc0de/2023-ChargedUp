// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.AddressableLED;
import edu.wpi.first.wpilibj.AddressableLEDBuffer;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class LEDs extends SubsystemBase {
  private AddressableLED m_frontRight =
      new AddressableLED(Constants.LEDconstants.FRONT_RIGHT_LED_PORT);
  private AddressableLED m_frontLeft =
      new AddressableLED(Constants.LEDconstants.FRONT_LEFT_LED_PORT);
  private AddressableLED m_backRight =
      new AddressableLED(Constants.LEDconstants.BACK_RIGHT_LED_PORT);
  private AddressableLED m_backLeft = new AddressableLED(Constants.LEDconstants.BACK_LEFT_LED_PORT);

  private AddressableLEDBuffer m_frontRightBuffer =
      new AddressableLEDBuffer(Constants.LEDconstants.FRONT_LED_LENGTH);
  private AddressableLEDBuffer m_frontLeftBuffer =
      new AddressableLEDBuffer(Constants.LEDconstants.FRONT_LED_LENGTH);
  private AddressableLEDBuffer m_backRightBuffer =
      new AddressableLEDBuffer(Constants.LEDconstants.BACK_LED_LENGTH);
  private AddressableLEDBuffer m_backLeftBuffer =
      new AddressableLEDBuffer(Constants.LEDconstants.BACK_LED_LENGTH);

  /** Creates a new LEDs. */
  public LEDs() {
    m_frontRight.setLength(m_frontRightBuffer.getLength());
    m_frontLeft.setLength(m_frontLeftBuffer.getLength());
    m_backRight.setLength(m_backRightBuffer.getLength());
    m_backLeft.setLength(m_backLeftBuffer.getLength());

    m_frontRight.setData(m_frontRightBuffer);
    m_frontRight.start();

    // for (var i = 0; i < m_frontRightBuffer.getLength(); i++) {
    //   // Sets the specified LED to the RGB values for red
    //   m_frontRightBuffer.setRGB(i, 0, 0, 225);
    // }

    m_frontRight.setData(m_frontRightBuffer);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
