import java.util.List;
import java.util.stream.Collectors;

public class Exercicio04 {
    public static void main(String[] args) {
        List<Animal> animalList = List.of(new AnimalImpl("Abelha-europeia", true),
                new AnimalImpl("Águia-imperial-ibérica", true),
                new AnimalImpl("Cegonha-branca", true),
                new AnimalImpl("Gaivota-de-asa-escura", true),
                new AnimalImpl("Pombo-comum", true),
                new AnimalImpl("Libélula-laranja", true),
                new AnimalImpl("Condor-dos-Andes", true),
                new AnimalImpl("Leão", false),
                new AnimalImpl("Urso", false),
                new AnimalImpl("Formiga", false),
                new AnimalImpl("Gato", false),
                new AnimalImpl("Iguana", false),
                new AnimalImpl("Cavalo", false),
                new AnimalImpl("Cachorro", false));

        System.out.println("-------------------Espécies Voadoras-------------------");
        new Exercicio04().filtrar(animalList, VerificadorImpl.VOADOR).forEach(System.out::println);
        System.out.println("-------------------Espécies Não Voadoras-------------------");
        new Exercicio04().filtrar(animalList, VerificadorImpl.NAOVOADOR).forEach(animal -> System.out.println(animal.getEspecie()));
    }
    List<Animal> filtrar(List<Animal> animais, Verificador verificador) {
        if(verificador == VerificadorImpl.VOADOR) {
            List<Animal> list = animais.stream().filter(animal -> animal.isVoador()).collect(Collectors.toList());;
            return list;
        } else {
            List<Animal> list = (List<Animal>) animais.stream().filter(animal -> !animal.isVoador()).collect(Collectors.toList());;
            return list;
        }
    }
}
