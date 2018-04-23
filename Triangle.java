public class Triangle {
    interface Measure {

        abstract void area();

    }

    class triangle implements measure {

        double x;

        double high1;

        public triangle(double a, double high) {

            x = a;

            high1 = high;

        }



        public void show() {

            System.out.println("長 = " +x + "高 = " + high1);

        }



        public void area() {

            System.out.println("area = " + (x * high1) / 2);

        }

    }

}
