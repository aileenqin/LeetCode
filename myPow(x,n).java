public class Solution {
    public double Pow(double x, int n) {
		if (n == 0) {
			return 1;
		}
		double v = Pow(x, n/2);
		if (n % 2 == 0) {    //(n & 1) == 0
			return v * v;
		}
		else {
			return v * v * x;
		}
    }
    public double myPow(double x, int n) {
        if (n < 0) {
			return 1 / Pow(x, -n);
		}
		else {
		    return Pow(x, n);
		}    
    }
}


/*

public void myPow(double x, int n) {
    double result = 1;
    long m = (long) ((n >= 0) ? n : -n);
    while (m > 0) {
        if ((m & 1) == 1) {
            result *= x;
        }
        
        x *= x;
        m >>= 1;
    }
    
    return n >= 0 ? result : 1 / result;
}



*/