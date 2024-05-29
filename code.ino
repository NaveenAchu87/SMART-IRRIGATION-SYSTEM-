int soilMoistureValue = 0;

int percentage=0;

void setup() {

  pinMode(9,OUTPUT);

  Serial.begin(9600);

}

void loop() {

soilMoistureValue = analogRead(A2);

Serial.println(percentage);

percentage = map(soilMoistureValue, 490, 1023, 100, 0);

if(percentage < 10)  

{

  Serial.println(" pump on");

  digitalWrite(9,HIGH);

}

if(percentage >80)

{

  Serial.println("pump off");

  digitalWrite(9,LOW);

}

}
