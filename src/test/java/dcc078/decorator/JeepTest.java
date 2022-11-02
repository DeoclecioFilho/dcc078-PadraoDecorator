package dcc078.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JeepTest {

    @Test
    void deveRetornarPrecoDoJeep() {
        Jeep jeep = new JeepCompass(170000.0f);
        assertEquals(170000.0f, jeep.getPreco());
    }

    @Test
    void deveRetornarPrecoDoJeepComDirecao() {
        Jeep jeep = new DirecaoEletrica(new JeepCompass(170000.0f));
        assertEquals(185000.0f, jeep.getPreco());
    }

    @Test
    void deveRetornarPrecoDoJeepComDirecaoComBanco() {
        Jeep jeep = new BancoDeCouro(new DirecaoEletrica(new JeepCompass(170000.0f)));
        assertEquals(187600.0f, jeep.getPreco());
    }

    @Test
    void deveRetornarPrecoDoJeepComDirecaoComBancoComTeto() {
        Jeep jeep = new TetoSolar(new BancoDeCouro(new DirecaoEletrica(new JeepCompass(170000.0f))));
        assertEquals(196500.0f, jeep.getPreco());
    }

    @Test
    void deveRetornarJeepCompass(){
        Jeep jeep = new JeepCompass();
        assertEquals("Jeep Compass", jeep.getOpcional());
    }

    @Test
    void deveRetornarJeepCompass_Direcao(){
        Jeep jeep = new DirecaoEletrica(new JeepCompass());
        assertEquals("Jeep Compass + Direção Elétrica", jeep.getOpcional());
    }

    @Test
    void deveRetornarJeepCompass_Direcao_Banco(){
        Jeep jeep = new BancoDeCouro(new DirecaoEletrica(new JeepCompass()));
        assertEquals("Jeep Compass + Direção Elétrica + Banco de Couro", jeep.getOpcional());
    }

    @Test
    void deveRetornarJeepCompass_Direcao_Banco_Teto(){
        Jeep jeep = new TetoSolar(new BancoDeCouro(new DirecaoEletrica(new JeepCompass())));
        assertEquals("Jeep Compass + Direção Elétrica + Banco de Couro + Teto Solar", jeep.getOpcional());
    }

}