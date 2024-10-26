import java.time.LocalDate;

public class Person {
    private String name; //Nome
    private String surname; // Sobrenome

    private String day; //Dia de nascimento
    private String month; //Mes de nascimento
    private String year; //Ano de nascimento


    public Person(String name, String surname, String day, String month, String year) {
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

    public int age(){

        //Convertendo os dados informados para objeto LocalDate
        LocalDate dateBirth = LocalDate.parse(year+"-"+month+"-"+day);

        //Obtendo data atual
        LocalDate dateNow = LocalDate.now();

        //Retornando comparação entre data atual e data de nascimento
        return dateNow.compareTo(dateBirth);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return
                "Nome= " + name + '\n' +
                "Sobrenome= " + surname + '\n' +
                "Data de nascimento= " + day +"/" + month +"/" + year +'\n'+
                "Idade= "+ age() +" Anos"+'\n';
    }

}
