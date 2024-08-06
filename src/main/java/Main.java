public class Main {

    public static void main(String[] args) {

        Observer pessoa1 = new Observer();
        Observer pessoa2 = new Observer();

        Observable previsaoTempo = new Observable();
        previsaoTempo.subscribe(pessoa1);
        previsaoTempo.subscribe(pessoa2);

        previsaoTempo.setPrevisao("Sol");

        previsaoTempo.unsubscribe(pessoa2);

        previsaoTempo.setPrevisao("Chuva");

    }

}
