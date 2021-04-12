 public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double _real, double _imaginary) {
        real = _real;
        imaginary = _imaginary;
    }

    public double getReal(){
        return real;
    }

    public double getImaginary(){
        return imaginary;
    }

    public void add(double _real, double _imaginary){
        real += _real;
        imaginary += _imaginary;
    }
    public void add(ComplexNumber complexNumber){
        real += complexNumber.real;
        imaginary += complexNumber.imaginary;
    }
    public void subtract(double _real, double _imaginary){
        real -= _real;
        imaginary -= _imaginary;
    }
    public void subtract(ComplexNumber complexNumber){
        real -= complexNumber.real;
        imaginary -= complexNumber.imaginary;
    }

    
}
