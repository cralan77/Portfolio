
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome da pessoa: ");
        String name = sc.nextLine();

        System.out.print("Sobrenome da pessoa: ");
        String surname = sc.nextLine();

        System.out.print("Dia de nascimento: ");
        String day = sc.nextLine();

        System.out.print("Mês de nascimento: ");
        String month = sc.nextLine();

        System.out.print("Ano de nascimento: ");
        String year = sc.nextLine();

        Person person = new Person(name, surname, day, month, year);

        System.out.println(person);
        System.out.println("Frequencia cardiaca máxima= "+HeartRates.maxHeartRates(person)+" bpm");
        System.out.println("Frequencia cardiaca alvo, intervalo entre= "+ HeartRates.targetHeartRates(person));
        System.out.println("\nSempre consulte um médico ou profissional de saúde qualificado antes de começar ou modificar um programa de exercícios físicos.");

    }
}