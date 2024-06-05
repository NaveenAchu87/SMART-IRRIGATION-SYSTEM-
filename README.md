Smart Irrigation System

Overview

This project involves creating a smart irrigation system using an Arduino board to monitor soil moisture levels and control a water pump.

A Processing-based graphical interface allows for manual control and monitoring of the system.

Components

^Arduino board (e.g., Arduino Uno)

^Soil moisture sensor

^Relay module or MOSFET for pump control

^Water pump

^Processing software for graphical interface

^Jumper wires

^Circuit Diagram

Setup Instructions

Hardware Setup

^Connect the Soil Moisture Sensor:

Connect the sensor's analog output to the Arduino analog input pin A2.

Connect the Relay Module:

Connect the relay module's control input to the Arduino digital pin 9.

Connect the relay's NO (Normally Open) terminal to one terminal of the pump.

Connect the other terminal of the pump to the power supply.

Connect the relay's common terminal to the power supply.

Power the Arduino:

Connect the Arduino to your computer via USB or use an external power source.

Software Setup

Arduino Code:

Install the Arduino IDE from the Arduino website.

Open the Arduino IDE and load the provided code.


Select the correct board and port from the Tools menu.

Upload the code to the Arduino.

cpp

Copy the code.ino


Processing Code:

Install Processing from the Processing website.

Open Processing and create a new sketch.

Copy and paste the provided Processing code into the sketch.

Adjust the serial port if necessary.

Run the Processing sketch.

java

Copy the processing_exe_code.java code



Usage

Automatic Control:

The system will automatically turn on the pump when soil moisture falls below 10% and turn off the pump when soil moisture exceeds 80%.

Manual Control via Processing Interface:


Run the Processing sketch.

Use the graphical interface to manually enable or disable the pump.

Troubleshooting

Serial Communication Issues:

Ensure the correct serial port is selected in both Arduino and Processing.

Check for loose connections and ensure the baud rate is set correctly.

Pump Not Turning On/Off:

Verify the relay connections and ensure the pump is connected correctly.

Check the soil moisture sensor readings and calibration.

Future Improvements

Integrate a web-based control panel for remote monitoring and control.

Add data logging to an SD card for historical analysis.

Implement a more advanced soil moisture algorithm to optimize water usage further.

Contributing

Feel free to fork this repository and submit pull requests. For major changes, please open an issue first to discuss what you would like to change.


