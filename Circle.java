package ProductStar_Circle;

public class Circle {

    private double Radius;
    private double Area;

    //���������� ������ ����� � �������
    public double getRadius() {
        return Radius;
    }
    //����� ������ �����
    public void setRadius(double Radius) throws Exception {
        if (Radius > 0) {
            this.Radius = Radius;
        } else {
            throw new Exception("������ �� ����� ���� ����� 0 ��� ������");
        }
    }
    // ����� ������� �����
        public void getArea () {
            Area = Math.PI * (Math.pow(getRadius(), 2));
            System.out.println(Area);
        }
    }



