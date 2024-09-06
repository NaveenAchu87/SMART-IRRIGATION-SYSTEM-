//use this code in the processing.exe 
//download link https://processing.org/download


import processing.serial.*;

Serial myPort;
boolean pumpControlEnabled = true;
int btnWidth = 100;
int btnHeight = 50;
int btnX, btnY;

void setup() {
  size(400, 300);
  println((Object[]) Serial.list()); // Adjusted to print available serial ports
  String portName = Serial.list()[0]; // Adjust the port if necessary
  myPort = new Serial(this, portName, 9600);
  btnX = width / 2 - btnWidth / 2;
  btnY = height / 2 - btnHeight / 2;
  myPort.bufferUntil('\n'); // Read until newline character
}

void draw() {
  background(200);
  drawButton();
}

void drawButton() {
  if (pumpControlEnabled) {
    fill(0, 255, 0);
  } else {
    fill(255, 0, 0);
  }
  rect(btnX, btnY, btnWidth, btnHeight);
  fill(0);
  textAlign(CENTER, CENTER);
  text(pumpControlEnabled ? "Disable" : "Enable", btnX + btnWidth / 2, btnY + btnHeight / 2);
}

void mousePressed() {
  if (mouseX > btnX && mouseX < btnX + btnWidth && mouseY > btnY && mouseY < btnY + btnHeight) {
    pumpControlEnabled = !pumpControlEnabled;
    myPort.write(pumpControlEnabled ? 'E' : 'D');
  }
}

void serialEvent(Serial myPort) {
  String input = myPort.readStringUntil('\n');
  if (input != null) {
    println("Received: " + input.trim()); // Debug print to see the received data
  }
}
