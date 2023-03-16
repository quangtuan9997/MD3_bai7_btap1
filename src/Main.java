public class Main {
    public static void main(String[] args) {
        double p=Math.random();
   Circle circle=new Circle(3);
        System.out.println("dien tich hinh tron truoc khi tang % ban kinh  "+circle.getArea());
        System.out.println("phan tram tang len: "+p+" %");
   circle.resize(p);
        System.out.println("dien tich hinh tron sau khi tang % ban kinh   "+circle.getArea());
        Rectangle rectangle=new Rectangle(2,4);

        System.out.println("S HCN truoc khi tang %  "+rectangle.getArea());
        rectangle.resize(p);
        System.out.println("S HCN sau khi tang %"  +rectangle.getArea());

    }

}
