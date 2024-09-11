class Cylinder{
    
    private static double height;
    private static double radius;

    public Cylinder(double height, double radius){
        this.radius = radius;
        this.height = height;
    }

    public static double getSurfaceArea(){
        return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
    }

    public static double getVolume(){
        return Math.PI * radius * radius * height;
    }

    public static void main(String[] args){
        Cylinder cly = new Cylinder(3000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000.0, 16);
        System.out.println(cly.getSurfaceArea());
        System.out.println(cly.getVolume());
    }
}