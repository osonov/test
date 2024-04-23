import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // PUT YOUR CODE HERE
        Scanner scanner = new Scanner(System.in);

        Car car = new Car();

        System.out.print("Введіть рік автомобіля: ");
        car.year = scanner.nextInt();
        System.out.print("Введіть модель автомобіля: ");
        car.model = scanner.next();
        System.out.print("Введіть швидкість автомобіля: ");
        car.speed = scanner.nextInt();

        System.out.print(car.year + " " + car.model + " " + car.speed);

    }
}
