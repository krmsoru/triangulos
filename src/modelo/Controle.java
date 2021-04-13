package modelo;

public class Controle extends absPropriedades
{

    public Controle(String lado1, String lado2, String lado3)
    {
        super(lado1, lado2, lado3);
        this.Executar();
    }

    private void Executar()
    {
        this.setMensagem("");
        Validacao validacao = new Validacao(this.getLado1(), this.getLado2(), this.getLado3());
        if (validacao.getMensagem().equals(""))
        {
            Triangulos triangulos = new Triangulos(validacao.getL1(), validacao.getL2(), validacao.getL3());
            this.setResposta(triangulos.getResposta());
        }
        else{
        this.setResposta(validacao.getMensagem());}
    }
}
