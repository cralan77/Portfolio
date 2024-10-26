
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome da pessoa: ");
        String name = sc.nextLine();

        System.out.print("Sobrenome da pessoa: ");
        String surname = sc.nextLine();

        System.out.print("Sexo (F para Feminino, M para Masculino: ");
        String sex = sc.nextLine();

        System.out.print("Altura (em Metros x,xx): ");
        double height = sc.nextDouble();

        System.out.print("Peso (em Kg xx,xx): ");
        double weight = sc.nextDouble();
        sc.nextLine();


        System.out.print("Dia de nascimento: ");
        String day = sc.nextLine();

        System.out.print("Mês de nascimento: ");
        String month = sc.nextLine();

        System.out.print("Ano de nascimento: ");
        String year = sc.nextLine();

        Person person = new Person(name, surname, sex, height, weight, day, month, year);

        System.out.println();
        System.out.println(person);
        System.out.println("Frequencia cardiaca máxima= "+ Calculator.maxHeartRates(person)+" bpm");
        System.out.println("Frequencia cardiaca alvo, intervalo entre= "+ Calculator.targetHeartRates(person));
        System.out.printf("Indice de massa corporal= %.2f, classificado com %s",Calculator.imc(person), RatingIMC.ratingIMC(Calculator.imc(person)));
        System.out.println("\nSempre consulte um médico ou profissional de saúde qualificado antes de começar ou modificar um programa de exercícios físicos.");

    }
}