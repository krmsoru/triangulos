package modelo;

import java.util.Objects;

public class Triangulos extends absPropriedades
{

    public Triangulos(Double l1, Double l2, Double l3)
    {
        super(l1, l2, l3);
        this.Verificar();
    }

    private void Verificar()
    {

        if ((this.getL1() < this.getL2() + this.getL3() 
                && this.getL2() < this.getL1() + this.getL3() 
                && this.getL3() < this.getL1() + this.getL2()))
        {
            if (Objects.equals(this.getL1(), this.getL2()) && Objects.equals(this.getL1(), this.getL3()))
            {
                this.setResposta("Triângulo Equilátero");
            }
            else if ((Objects.equals(this.getL1(), this.getL2()))
                    || (Objects.equals(this.getL1(), this.getL3()))
                    || (Objects.equals(this.getL2(), this.getL3())))
            {
                this.setResposta("Triângulo Isósceles");
            }
            else
            {
                this.setResposta("Triângulo Escaleno");
            }

        }
        else
        {
            this.setResposta("<html>Os lados não formam<br>um Triângulo</html>");
        }
    }
}
