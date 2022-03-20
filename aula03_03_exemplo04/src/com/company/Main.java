package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int x = 10;
        float y = 15.5f;
        double z = 1869.989;

        String strX, strY, strZ;
        strX = Integer.toString(x);
        strY = Float.toString(y);
        strZ = Double.toString(z);

        //Processo inverso, de string para numerico
        String a, b, c;
        a = "15";
        b = "12.6";
        c = "23.8989";

        int intA = Integer.parseInt(a);
        float floatB = Float.parseFloat(b);
        double doubleC = Double.parseDouble(c);

    }
}
