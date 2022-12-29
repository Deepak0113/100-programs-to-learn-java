public class Areas {
    static float pi = 3.14F;

    static class Area2D {
        static void areaSquare(float side){
            float area = side*side;
            System.out.println(area);
        }

        void areaRectangle(float length, float breath){
            float area = length*breath;
            System.out.println(area);
        }

        static float areaCircle(float radius){
            float area = pi * radius * radius;
            return area;
        }

    }

    static class Area3D {
        void areaCylinder(float radius, float height){
            float area = 2 * pi * radius * (height+radius);
            System.out.println(area);
        }
    }
}
