package dcc078.decorator;

public class BancoDeCouro extends JeepOpcionaisDecorator{
    public BancoDeCouro(Jeep jeep) {
        super(jeep);
    }

    @Override
    public float getValorOpcional() {
        return 2600.0f;
    }
    public String getNomeOpcional(){
        return "Banco de Couro";
    }
}
