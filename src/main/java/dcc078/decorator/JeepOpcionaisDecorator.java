package dcc078.decorator;

public abstract class JeepOpcionaisDecorator implements Jeep {

    private Jeep jeep;
    private String opcional;

    public abstract float getValorOpcional();

    @Override
    public float getPreco() {
        return this.jeep.getPreco() + this.getValorOpcional();  // * (1 + (this.getPercentualCargaHoraria() / 100));
    }

    public JeepOpcionaisDecorator(Jeep jeep) {
        this.jeep = jeep;
    }

    public abstract String getNomeOpcional();
    @Override
    public String getOpcional() {
        return this.jeep.getOpcional()+" + "+ this.getNomeOpcional();
    }

}
