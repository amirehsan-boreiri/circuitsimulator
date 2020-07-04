public class Resistor extends Element {
    static double R0;
    Resistor(){
        if (R0!=0) {
            i = deltaV / R0;
            power= (deltaV/R0)*deltaV;
        }
    }
}
