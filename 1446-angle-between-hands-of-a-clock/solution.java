class Solution {
    public double angleClock(int hour, int minutes) {
        
        double minuteAngle = minutes * 6;

        

        double hourAngle = ((hour%12)*30) + minutes * 0.5; 
        double Angle = Math.abs( minuteAngle - hourAngle );
        return Math.min( Angle , 360 - Angle );
    }
}
