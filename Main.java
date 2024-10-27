import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.1
        System.out.print("Сколько точек вы хотите ввести? ");
        int numPoints = scanner.nextInt();
        scanner.nextLine();
        point[] points = new point[numPoints];
        for (int i = 0; i < points.length; i++) {
            System.out.println("Введите координаты для точки " + (i + 1) + ":");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            points[i] = new point(x, y);
        }
        for (int i = 0; i < points.length; i++) {
            System.out.println("Точка " + (i + 1) + ": " + points[i]);
        }


        //1.3
        System.out.print("Сколько имен вы хотите ввести? ");
        int numNames = scanner.nextInt();
        scanner.nextLine();
        name[] names = new name[numNames];
        for (int i = 0; i < names.length; i++) {
            System.out.println("Введите фамилию для имени " + (i + 1) + ":");
            String lastName = scanner.nextLine();
            System.out.println("Введите имя для имени " + (i + 1) + ":");
            String firstName = scanner.nextLine();
            System.out.println("Введите отчество для имени " + (i + 1) + ":");
            String middleName = scanner.nextLine();
            names[i] = new name(lastName, firstName, middleName);
        }
        for (int i = 0; i < names.length; i++) {
            System.out.println("Имя " + (i + 1) + ": " + names[i]);
        }

        //2.1
        line[] lines = new line[3];
        for (int i = 0; i < lines.length; i++) {
            System.out.println("Введите координаты начала для линии " + (i + 1) + ":");
            double startX = scanner.nextDouble();
            double startY = scanner.nextDouble();
            point start = new point(startX, startY);

            System.out.println("Введите координаты конца для линии " + (i + 1) + ":");
            double endX = scanner.nextDouble();
            double endY = scanner.nextDouble();
            point end = new point(endX, endY);

            lines[i] = new line(start, end);
        }
        for (int i = 0; i < lines.length; i++) {
            System.out.println("Линия " + (i + 1) + ": " + lines[i]);
        }
        if (lines.length > 0) {
            lines[0].getStart().setX(2);
            lines[0].getStart().setY(4);
        }
        if (lines.length > 1) {
            lines[1].getEnd().setX(30);
        }
        System.out.println("\nПосле изменений:");
        for (int i = 0; i < lines.length; i++) {
            System.out.println("Линия " + (i + 1) + ": " + lines[i]);
        }
        if (lines.length > 0) {
            lines[0].getEnd().setX(24);
            lines[0].getEnd().setY(9);
        }
        System.out.println("\nПосле изменений первой линии без изменения третьей:");
        for (int i = 0; i < lines.length; i++) {
            System.out.println("Линия " + (i + 1) + ": " + lines[i]);
        }

        //3.3  4.8
        City cityA = new City("A");
        City cityB = new City("B");
        City cityC = new City("C");
        City cityD = new City("D");
        City cityE = new City("E");
        City cityF = new City("F");

        cityA.addConnection(cityF, 1);
        cityA.addConnection(cityB, 2);
        cityA.addConnection(cityB, 5);
        cityA.addConnection(cityC, 5);
        cityA.addConnection(cityC, 8);
        cityA.addConnection(cityE, 3);
        cityA.addConnection(cityE, 11);
        cityA.addConnection(cityD, 9);

        cityB.addConnection(cityA, 5);
        cityB.addConnection(cityA, 13);
        cityB.addConnection(cityC, 3);
        cityB.addConnection(cityD, 7);
        cityB.addConnection(cityE, 9);
        cityB.addConnection(cityF, 11);

        cityC.addConnection(cityB, 3);
        cityC.addConnection(cityB, 9);
        cityC.addConnection(cityA, 8);
        cityC.addConnection(cityA, 10);
        cityC.addConnection(cityD, 4);
        cityC.addConnection(cityE, 6);
        cityC.addConnection(cityF, 8);

        cityD.addConnection(cityC, 4);
        cityD.addConnection(cityA, 6);
        cityD.addConnection(cityA, 10);
        cityD.addConnection(cityA, 12);
        cityD.addConnection(cityE, 2);
        cityD.addConnection(cityB, 7);
        cityD.addConnection(cityB, 5);
        cityD.addConnection(cityF, 4);

        cityE.addConnection(cityF, 2);
        cityE.addConnection(cityB, 3);
        cityE.addConnection(cityA, 8);
        cityE.addConnection(cityA, 16);
        cityE.addConnection(cityC, 18);
        cityE.addConnection(cityC, 6);
        cityE.addConnection(cityD, 14);

        cityF.addConnection(cityE, 2);
        cityF.addConnection(cityB, 1);
        cityF.addConnection(cityA, 19);
        cityF.addConnection(cityA, 6);
        cityF.addConnection(cityA, 14);
        cityF.addConnection(cityC, 4);
        cityF.addConnection(cityD, 8);

        System.out.println("\nГорода и пути:");
        System.out.println(cityA);
        System.out.println(cityB);
        System.out.println(cityC);
        System.out.println(cityD);
        System.out.println(cityE);
        System.out.println(cityF);

        //5.5
        System.out.println("\nВведите числитель и знаменатель для первой дроби:");
        int numerator1 = scanner.nextInt();
        int denominator1 = scanner.nextInt();
        fraction f1 = new fraction(numerator1, denominator1);

        System.out.println("Введите числитель и знаменатель для второй дроби:");
        int numerator2 = scanner.nextInt();
        int denominator2 = scanner.nextInt();
        fraction f2 = new fraction(numerator2, denominator2);

        System.out.println("Введите числитель и знаменатель для третьей дроби:");
        int numerator3 = scanner.nextInt();
        int denominator3 = scanner.nextInt();
        fraction f3 = new fraction(numerator3, denominator3);

        fraction sumResult = f1.add(f2);
        fraction subtractResult = f1.subtract(f2);
        fraction multiplyResult = f1.multiply(f2);
        fraction divideResult = f1.divide(f2);

        System.out.println("\nПримеры операций с дробями:");
        System.out.println(f1 + " + " + f2 + " = " + sumResult);
        System.out.println(f1 + " - " + f2 + " = " + subtractResult);
        System.out.println(f1 + " * " + f2 + " = " + multiplyResult);
        System.out.println(f1 + " / " + f2 + " = " + divideResult);

        fraction complexResult = f1.add(f2).divide(f3).subtract(5);
        System.out.println("\nРезультат выражения f1.sum(f2).div(f3).minus(5): " + complexResult);
        scanner.close();
    }
}