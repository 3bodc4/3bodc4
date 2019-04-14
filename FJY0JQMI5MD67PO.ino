/* Water Level Meter

Measuring water level with ultrasonic sensor HR S04.

Arduino IDE 1.5.8
*/

int trig = 12;
int echo = 11;
int LED = 13;
int SMS = 2;
int flag; 

void setup()
{
  Serial.begin(9600);
  pinMode(LED, OUTPUT);
  pinMode(SMS, OUTPUT);
  pinMode(trig, OUTPUT);
  pinMode(echo, INPUT);
  flag = 0;
}

void loop()
{
  long t = 0, h = 0, hp = 0;
  
  // Transmitting pulse
  digitalWrite(trig, LOW);
  delayMicroseconds(2);
  digitalWrite(trig, HIGH);
  delayMicroseconds(10);
  digitalWrite(trig, LOW);
  
  // Waiting for pulse
  t = pulseIn(echo, HIGH);
  
  // Calculating distance 
  h = t / 58;
 
  h = h - 6;  // offset correction

 if (h > 100 && h <30 && flag == 0){
  digitalWrite(LED, HIGH);
  digitalWrite(SMS, HIGH);
  delay(1000);
  digitalWrite(LED,LOW);
  digitalWrite(SMS,LOW);
  delay(1000);
  digitalWrite(LED, HIGH);
  digitalWrite(SMS, HIGH);
  delay(1000);
  digitalWrite(LED,LOW);
  digitalWrite(SMS,LOW);
  flag = 1;
 }
  // Sending to computer
  Serial.print(h);
  // Serial.print(" cm\n");
  Serial.print("\n");
  
  delay(1000);
}
