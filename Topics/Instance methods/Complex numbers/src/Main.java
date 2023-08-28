class Complex {

    double real;
    double image;


    public void add(Complex otherNumber) {
        this.real = (this.real + otherNumber.real);
        this.image = (this.image + otherNumber.image);
    }

    public void subtract(Complex otherNumber) {
        this.real = (this.real - otherNumber.real);
        this.image = (this.image - otherNumber.image);
    }
}
