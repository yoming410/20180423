public class rectangle {
    interface Measure{

        abstract void area();

    }

    class Rectangle implements measure{

        double 寬度;

        double 高度 ;

        public Rectangle(double width, double height){

            寬度 = width;

            高度 = height;

        }

        public void perimeter() {

            System.out.println("周長 = " + (寬度 + 高度 ) * 2);

        }

        public void show() {

            System.out.println("底 = " + 寬度 + "高 = " + 高度 );

        }

        public void area() {

            System.out.println("Area = " + 寬度 * 高度 );

        }

    }

}
