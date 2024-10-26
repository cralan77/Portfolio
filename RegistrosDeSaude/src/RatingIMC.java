public class RatingIMC {

    public static String ratingIMC(double imc){

        if(imc < 18.5){
            return "Baixo peso";
        } else if (imc >=18.5 & imc <25) {
            return "Peso normal";
        } else if (imc >=25 & imc <30) {
            return "Sobrepeso";
        } else if (imc >=30 & imc <35) {
            return "Obesidade grau I";
        } else if (imc >=35 & imc <40) {
            return "Obesidade grau II";
        }else {
            return "Obesidade grau III";
        }

        // Dados obtidos de: https://www.tuasaude.com/calculadora/imc/

    }
}
