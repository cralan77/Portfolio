import java.time.LocalDate;
public class HeartRates {

    private final String name; //Nome
    private final String surname; // Sobrenome

    private final String day; //Dia de nascimento
    private final String month; //Mes de nascimento
    private final String year; //Ano de nascimento

    public HeartRates(String name, String surname, String day, String month, String year) {
        this.name = name;
        this.surname = surname;

        //Tratando dia informado, caso seja informado um digito
        //Verifica quantidade de caracteres
        if(day.length()==1){
            //se for igual a 1, adiciona zero a esquerda
            day="0"+day;
        }
        this.day = day;

        //Tratando mês informado, caso seja informado um digito
        //Verifica quantidade de caracteres
        if(month.length()==1){
            //se for igual a 1, adiciona zero a esquerda
            month = "0"+month;
        }
        this.month = month;

        this.year = year;
    }

    //Idade em anos
    public int age(){

        //Convertendo os dados informados para objeto LocalDate
        LocalDate dateBirth = LocalDate.parse(year+"-"+month+"-"+day);

        //Obtendo data atual
        LocalDate dateNow = LocalDate.now();

        //Retornando comparação entre data atual e data de nascimento
        return dateNow.compareTo(dateBirth);
    }

    //Frequencia cardiaca Maxima
    public int maxHeartRates(){
        //Formula da frequencia cardiaca maxima = 220 - idade
        //As frequências cardíacas máximas e alvo podem variar com base na saúde, capacidade física e sexo da pessoa.
        return 220-age();
    }

    //Frequencia cardiaca Alvo
    public String targetHeartRates(){
        //O intervalo alvo é entre 50% e 85% da frequencia cardiaca maxima.

        //Inicio intervalo
        double targetMin = maxHeartRates()*0.5;
        //Final intervalo
        double targetMax = maxHeartRates()*0.85;

        //Retorno da String contendo intervalo alvo
        return targetMin + " e " + targetMax;
    }

    @Override
    public String toString() {
        return
                "Nome= " + name + '\n' +
                "Sobrenome= " + surname + '\n' +
                "Data de nascimento= " + day +"/" + month +"/" + year +'\n'+
                "Idade= "+ age() +" Anos"+'\n'+
                "Frequencia cardiaca máxima= "+ maxHeartRates() +" bpm" +'\n'+
                "Frequencia cardiaca alvo, intervalo entre= "+ targetHeartRates()+'\n'+'\n'+
                "Sempre consulte um médico ou profissional de saúde qualificado antes de começar ou modificar um programa de exercícios físicos.\n";
    }

    //GET'S E SET'S não foram necessários nesse exercicio
}
