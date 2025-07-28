

public class Gerente extends Empregado{

    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }

    @Override
    public double calcularBonus(Departamento departamento){
        if(departamento.alcancouMeta()){
            return getSalarioFixo()*0.2 + 0.01 *(departamento.getValorAtingidoMeta()-departamento.getValorMeta());
        } else {
            return 0;
        }
    }
}
