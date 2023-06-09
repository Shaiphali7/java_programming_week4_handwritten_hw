package programme_20_pool_area;

public class Rectangle {
    double length;
    double width;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        if (this.width < 0) {
            this.width = 0;
        } if (this.length < 0) {
            this.length = 0;
        }
        }

    public double getLength() {
        return length;
    }
    public double getWidth(){
        return width;
    }
    public double getArea(){
        return length*width;
    }
}


