package records.three;

public record Rectangle(double length, double width) {
//    public Rectangle(double length, double width) {
//        if (length <= 0 || width <= 0) {
//            throw new java.lang.IllegalArgumentException(
//                String.format("Invalid dimensions: %f, %f", length, width));
//        }
//        this.length = length;
//        this.width = width;
//    }

    public Rectangle {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException(
                String.format("Invalid dimensions: %f, %f", length, width));
        }
    }

    public Rectangle(double side) {
        this(side, side);
    }

    // Public accessor method
    @Override
    public double length() {
        System.out.println("Length is " + length);
        return length;
    }
}
