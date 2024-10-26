public class Calculator {

    //Frequencia cardiaca Maxima
    public static int maxHeartRates(Person person){
        //Formula da frequencia cardiaca maxima = 220 - idade
        //As frequências cardíacas máximas e alvo podem variar com base na saúde, capacidade física e sexo da pessoa.
        return 220- person.age();
    }

    //Frequencia cardiaca Alvo
    public static String targetHeartRates(Person person){
        //O intervalo alvo é entre 50% e 85% da frequencia cardiaca maxima.

        int maxHeartRates = maxHeartRates(person);
        //Inicio intervalo
        double targetMin = maxHeartRates*0.5;
        //Final intervalo
        double targetMax = maxHeartRates*0.85;

        //Retorno da String contendo intervalo alvo
        return targetMin + " bpm e " + targetMax + " bpm";
    }

    //Indice de massa corporal - IMC
    public static double imc(Person person){
        //Formula IMC Peso dividido pela altura ao quadrado

        return person.getWeight()/Math.pow(person.getHeight(), 2);

    }

}
