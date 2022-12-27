public class Question17 {
    static void areaBtwTwoConcentricCircles(float radius1, float radius2){
        float area = Math.abs(Areas.Area2D.areaCircle(radius1) - Areas.Area2D.areaCircle(radius2));
        System.out.println(area);
    }

    public static void main(String[] args) {
        areaBtwTwoConcentricCircles(10, 5);
    }
}