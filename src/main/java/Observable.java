import java.util.ArrayList;
import java.util.List;

public class Observable {

    private String previsaoAtual;
    private List<Observer> pessoas = new ArrayList<>();

    public void subscribe(Observer pessoas) {
        this.pessoas.add(pessoas);
    }

    public void unsubscribe(Observer pessoas) {
        this.pessoas.remove(pessoas);
    }

    public void setPrevisao(String previsao) {
        this.previsaoAtual = previsao;

        for (Observer pessoa : this.pessoas) {
            pessoa.update(this.previsaoAtual);
        }
    }

}
