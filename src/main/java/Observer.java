public class Observer implements serverPrevisao {

    @Override
    public void update(String previsao) {
        System.out.println("Previsão: " + previsao);
    }
}
