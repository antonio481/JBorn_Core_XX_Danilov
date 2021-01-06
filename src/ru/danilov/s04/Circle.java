package ru.danilov.s04;

class Circle {
    private static int INITIAL_radius=10;
    private static double area;
    private int radius;
    private double x;
    private double y;
    private static double getArea(){
        area=Math.PI*Math.pow(INITIAL_radius,2);
        return area;
        }
        private void setCentre(double x, double y){
        this.x=x;
        this.y=y;
        }
        private boolean accrossingCrcles(Circle circle){
             return Math.sqrt(Math.pow((circle.x - this.x), 2) + Math.pow((circle.y - this.y), 2))>(circle.radius+this.radius);
        }
        private double countDistanceCentres(Circle circle){
        return Math.sqrt(Math.pow((circle.x - this.x), 2) + Math.pow((circle.y - this.y), 2));
        }
}
