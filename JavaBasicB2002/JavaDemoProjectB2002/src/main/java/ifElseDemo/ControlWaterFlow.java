package ifElseDemo;

public class ControlWaterFlow {
    public void controlWaterFlow(){
        int waterFlow = 6;
        if(waterFlow == 5){
            raiseAlarm();
            //System.out.println("Raise alarm");
        } else if (waterFlow >= 6) {
            stopTheSwitch();
            //System.out.println("Stop the switch");
            } else {
            keepTheSwitchOn();
            //System.out.println("Keep the switch on");
        }

        }
        public void raiseAlarm(){
        raiseAlarm();
            System.out.println("Raise the alarm: ");
        }
        public void stopTheSwitch(){
            System.out.println("Stop the switch");
        }
        public void keepTheSwitchOn(){
            System.out.println("Keep the switch on");
        }
    }

