package ProductStar_Circle;

public class Circle {

    private double Radius;
    private double Area;

    //Возвращаем радиус сразу в площадь
    public double getRadius() {
        return Radius;
    }
    //Узнаём радиус круга
    public void setRadius(double Radius) throws Exception {
        if (Radius > 0) {
            this.Radius = Radius;
        } else {
            throw new Exception("Радиус не может быть равен 0 или меньше");
        }
    }
    // Найдём площадь круга
        public void getArea () {
            Area = Math.PI * (Math.pow(getRadius(), 2));
            System.out.println(Area);
        }
    }



