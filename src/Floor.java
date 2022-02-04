public class Floor {
    private double length;
    private double width;

    public Floor(double length, double width) {
       if(length < 0 && width < 0) {
           this.width = 0;
           this.length = 0;
       } else if (length < 0) {
           this.length = 0;
           this.width = width;
       } else if (width < 0) {
           this.width = 0;
           this.length = length;
       } else {
           this.width = width;
           this.length = length;
       }
    }

    public double getArea() {
        return this.width * this.length;
    }

}
