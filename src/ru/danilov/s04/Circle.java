package ru.danilov.s04;

class Circle {
    private static Circle instance;
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
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        this.x=x;
        this.y=y;
        }
        private boolean accrossingCrcles(Circle circle){
             return Math.sqrt(Math.pow((circle.x - this.x), 2) + Math.pow((circle.y - this.y), 2))>(circle.radius+this.radius);
        }
        private double countDistanceCentres(Circle circle){
        return Math.sqrt(Math.pow((circle.x - this.x), 2) + Math.pow((circle.y - this.y), 2));
        }

    private Circle(int radius, double x, double y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public static Circle getInstance(int radius, double x, double y) {
        if (instance == null) {
            instance = new Circle(radius,x,y);
        }
        return instance;
    }
}
