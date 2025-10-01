

import java.util.List;
import java.util.Map;

public class ConsultaPessoas {
    static Map<String, List<Pessoa>> obterPessoasPorCargo(List<Pessoa> pessoas) {
        return pessoas.stream().collect(java.util.stream.Collectors.groupingBy(Pessoa::getCargo));
    }
}
