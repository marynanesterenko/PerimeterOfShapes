import java.util.Scanner;

    public class PerimeterOfShapes {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter the number of sides for the shape: ");
            int numberOfSides = sc.nextInt();
            double a = 0, b = 0, c = 0, d = 0;

            if (numberOfSides == 3) {

                System.out.println("Please enter the length for the side 'a': ");
                a = sc.nextDouble();
                System.out.println("Please enter the length for the side 'b': ");
                b = sc.nextDouble();
                System.out.println("Please enter the length for the side 'c': ");
                c = sc.nextDouble();

            } else if (numberOfSides == 4) {
                System.out.println("Please enter the length for the side 'a': ");
                a = sc.nextDouble();
                System.out.println("Please enter the length for the side 'b': ");
                b = sc.nextDouble();
                System.out.println("Please enter the length for the side 'c': ");
                c = sc.nextDouble();
                System.out.println("Please enter the length for the side 'd': ");
                d = sc.nextDouble();
            }

        }

        String typeOfShape = " ";
        String nameOfShape = " ";
        double perimeter = a + b + c;

        public static figureOutTheNameOfShape (Sting shapeName) {
            int shapeSides;
            String shapeType;
            if(shadeSides ==4) {
                typeOfShape = "Quadrilateral shape";
            }
        }

        System.out.println("Please enter the length of the side 'd': ");
        d = sc.nextDouble();

        perimeter += d;
        if (a == b && b == c && c == d) {
            nameOfShape = "Square";
        } else if (a == b && b == c && c == d) {
            nameOfShape = "Rectangle";
        } else {
            nameOfShape = "Trapezoid";
        }

    } else if(numberOfSides ==3)

    {
        typeOfShape = "Triangle";
        if (a == b && b == c) {
            nameOfShape = "Equilateral";
        } else if (a == b && b != c || a == c) {
            nameOfShape = "Isosceles";
        } else {
            nameOfShape = "Scalene";
        }
    }

            System.out.println("The shape you've created is: "+nameOfShape +" "+typeOfShape +" "
            +" and perimeter is: "+perimeter);

}
