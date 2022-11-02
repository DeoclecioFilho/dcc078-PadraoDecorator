package dcc078.decorator;

public class TetoSolar extends JeepOpcionaisDecorator {
    public TetoSolar(Jeep jeep) {
        super(jeep);
    }

    @Override
    public float getValorOpcional() {
        return 8900.0f;
    }
    public String getNomeOpcional(){
        return "Teto Solar";
    }
}
