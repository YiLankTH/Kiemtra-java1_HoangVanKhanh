package kiemtra;

public class Circle {

        private double radius;

        public Circle(double radius) {
            if (radius <= 0) {
                throw new RuntimeException("Error");
            }
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        public double getArea() {
            return Math.PI * radius * radius;
        }

        public double getCircumference() {
            return 2 * Math.PI * radius;
        }

        @Override
        public String toString() {
            return "Circle["+"radius = " + radius + "]";
        }
    }


