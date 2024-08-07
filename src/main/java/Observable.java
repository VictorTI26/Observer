import java.util.ArrayList;
import java.util.List;

public class Observable {

    private String previsaoAtual;
    private List<Observer> pessoas = new ArrayList<>();

    public void subscribe(Observer pessoa) {
        this.pessoas.add(pessoa);
    }

    public void unsubscribe(Observer pessoa) {
        this.pessoas.remove(pessoa);
    }

    public void setPrevisao(String previsao) {
        this.previsaoAtual = previsao;

        for (Observer pessoa : this.pessoas) {
            pessoa.update(this.previsaoAtual);
        }
    }

}
