public class shape {
    class Triangle implements measure {

        double x1;

        double high1;

        public Triangle(double a, double high) {

            x1 = a;

            high1 = high;

        }
        
        public void show() {

            System.out.println("長 = " + x1 + "高 = " + high1);

        }


        public void area() {

            System.out.println("Area = " + (x1 * high1) / 2);

        }

    }

    class Rectangle extends shape implements measure {

        double 寬度;

        double 高度 ;

        public Rectangle(double width, double height) {

            寬度 = width;

            高度 = height;

        }

        public void perimeter() {

            System.out.println("周長 = " + (寬度 + 高度) * 2);

        }

        public void show() {

            System.out.println("底 = " + 寬度 + "高 = " + 高度);

        }

        public void area() {

            System.out.println("Area = " + 寬度 * 高度);

        }

    }

}