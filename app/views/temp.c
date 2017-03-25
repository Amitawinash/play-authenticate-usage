void setup()
{
   Serial.begin(9600);
  //pinMode(A0,OUTPUT);
  int i;
  for (i = 8; i < 12; i++)  // Analog pins for yellow, red,
  {
    pinMode(i, OUTPUT);    // blue and white wires of the motor.
  }

  //pinMode(WLED, OUTPUT);     // Wiring board LED
  //digitalWrite(WLED, HIGH);
}

int sensorValue = analogRead(A0);
void stepforward(){
  int sensorValue = analogRead(A0);
   Serial.println("stepforward");
   Serial.println(sensorValue);
   Serial.println("yooooooooooo");
  for(int i=0 ; i<20;i++){
    if(i==19){
      stopMotor();
    }
     Serial.println(i);
    Serial.println(sensorValue);
    //forward.
    digitalWrite(8, HIGH);
    digitalWrite(9, LOW);
    digitalWrite(10, LOW);
    digitalWrite(11, LOW);
    delay(30);
    digitalWrite(8, LOW);
    digitalWrite(9, HIGH);
    digitalWrite(10, LOW);
    digitalWrite(11, LOW);
    delay(30);
    digitalWrite(8, LOW);
    digitalWrite(9, LOW);
    digitalWrite(10, HIGH);
    digitalWrite(11, LOW);
    delay(30);
    digitalWrite(8, LOW);
    digitalWrite(9, LOW);
    digitalWrite(10, LOW);
    digitalWrite(11, HIGH);
    delay(30);
    }
}
void stopMotor(){
  int sensorValue = analogRead(A0);
  Serial.println("Inside StopMotor");
  Serial.println(sensorValue);
  while(sensorValue>900){
    int sensorValue = analogRead(A0);
    
    
    Serial.println(sensorValue);
    Serial.println("StopMotor");
    delay(200);
    }
 if(sensorValue<900){
  loop();
 }
  }

    
  
  
void stopMotorDry(){
  int sensorValue = analogRead(A0);
  Serial.println("Inside StopMotor Dry");
  Serial.println(sensorValue);

  while(sensorValue<900){
    int sensorValue = analogRead(A0);
    Serial.println(sensorValue);
    Serial.println("StopMotorDry");
    delay(1000);
    if(sensorValue>900){
      Serial.println("sensorValue>900");
     loop();
 }
    }
  if(sensorValue>900){
  loop();
 }
    
  
  }
void stepbackward()            //Drive sequence for one cycle going
{
  int sensorValue = analogRead(A0);
  Serial.println("stepbackward");

  for(int i=0 ; i<20;i++){
    Serial.println(i);
  if(i==19){
    Serial.println("stepbackward if");
    stopMotorDry();
    
    
  }
  Serial.println(sensorValue);
   Serial.println("inside for");
  //backward.
  digitalWrite(8, LOW);
  digitalWrite(9, LOW);
  digitalWrite(10, LOW);
  digitalWrite(11, HIGH);
  delay(30);
  digitalWrite(8, LOW);
  digitalWrite(9, LOW);
  digitalWrite(10, HIGH);
  digitalWrite(11, LOW);
  delay(30);
  digitalWrite(8, LOW);
  digitalWrite(9, HIGH);
  digitalWrite(10, LOW);
  digitalWrite(11, LOW);
  delay(30);
  digitalWrite(8, HIGH);
  digitalWrite(9, LOW);
  digitalWrite(10, LOW);
  digitalWrite(11, LOW);
  delay(30);
  }
}

void loop()
{
  int sensorValue = analogRead(A0);
  
 if(sensorValue>900){
   Serial.println("gerter than 900");
  stepforward();      //Repeats the required sequence over &
  //over to make the motor turn continuously FW.
  //stopMotor();

 }
 if (sensorValue<900){
   Serial.println("less than 900");
  stepbackward();     //Repeats the required sequence over &
  //over to make the motor turn continuously BW.
  //stopMotorDry();
 }
}
