String a;

const int ledPin =  13;      // the number of the LED pin
int ledState = LOW;             // ledState used to set the LED
void setup() {
 Serial.begin(9600);
  pinMode(ledPin, OUTPUT);

}

void loop() {
  delay(1000);
  ///Serial.println("Halo ESP8266, Assalamualaikum :)");
  if (Serial.available()) {
    /* read the most recent byte */
    a = Serial.readString();
    /*ECHO the value that was read, back to the serial port. */
    Serial.println(a);
    if(a=="1"){
      ledState = HIGH;
    }else if(a=="0"){
      ledState = LOW;
    }
    digitalWrite(ledPin, ledState);
  }

}
