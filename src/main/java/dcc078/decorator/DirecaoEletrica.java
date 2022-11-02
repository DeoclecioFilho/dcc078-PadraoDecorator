package dcc078.decorator;

public class DirecaoEletrica extends JeepOpcionaisDecorator{

    public DirecaoEletrica(Jeep jeep) {
        super(jeep);
    }

    @Override
    public float getValorOpcional() {
        return 15000.0f;
    }
    public String getNomeOpcional(){
        return "Direção Elétrica";
    }

}
