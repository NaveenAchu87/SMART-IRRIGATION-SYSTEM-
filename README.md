Smart Irrigation System Readme
OverviewThe Smart Irrigation System is designed to automatically manage watering plants based on soil moisture levels.
The system reads soil moisture data and controls a water pump accordingly.
When the soil is too dry, the pump activates to water the plants.
When the soil moisture is sufficient, the pump deactivates.
ComponentsArduino Board
Soil Moisture Sensor
Water Pump
Relay Module (if using a pump that requires it)
Connecting Wires
Circuit Connections
Soil Moisture Sensor:Connect the analog output of the soil moisture sensor to the A2 pin of the Arduino.
Water Pump:Connect the water pump to pin 9 on the Arduino.
If using a relay module to control the pump, connect the relay module to pin 9 and wire the pump through the relay.
Code Explanationint soilMoistureValue = 0;  // Variable to store soil moisture sensor value
int percentage = 0;         // Variable to store the mapped percentage value of soil moisture

void setup() {
  pinMode(9, OUTPUT);       // Set pin 9 as an output pin for controlling the water pump
  Serial.begin(9600);       // Initialize serial communication at 9600 bits per second
}

void loop() {
  soilMoistureValue = analogRead(A2);  // Read the analog value from the soil moisture sensor
  percentage = map(soilMoistureValue, 490, 1023, 100, 0);  // Map the sensor value to a percentage

  Serial.println(percentage);  // Print the percentage value to the Serial Monitor

  if (percentage < 10) {       // If the soil moisture percentage is less than 10%
    Serial.println("pump on"); // Print "pump on" to the Serial Monitor
    digitalWrite(9, HIGH);     // Turn the pump on by setting pin 9 to HIGH
  }

  if (percentage > 80) {       // If the soil moisture percentage is greater than 80%
    Serial.println("pump off"); // Print "pump off" to the Serial Monitor
    digitalWrite(9, LOW);       // Turn the pump off by setting pin 9 to LOW
  }
}



Functionality Initialization:The setup() function sets pin 9 as an output and initializes serial communication.
Main Loop:The loop() function continuously reads the soil moisture level from the sensor connected to pin A2.
The raw sensor value is mapped to a percentage (0% to 100%) using the map function.
If the soil moisture percentage is below 10%, the system prints "pump on" to the Serial Monitor and activates the pump by setting pin 9 HIGH.
If the soil moisture percentage is above 80%, the system prints "pump off" to the Serial Monitor and deactivates the pump by setting pin 9 LOW.
UsageConnect all components as described.Upload the code to the Arduino board.
Open the Serial Monitor to observe the soil moisture percentage and pump status.
The system will automatically control the pump based on soil moisture levels.
TroubleshootingEnsure all connections are secure and correct.
Verify the soil moisture sensor and pump are functioning properly.
Adjust the mapped range in the map function if the sensor values differ.
NotesModify the threshold values in the if conditions to suit different moisture requirements.
Ensure the power supply is adequate for the pump and other components.
