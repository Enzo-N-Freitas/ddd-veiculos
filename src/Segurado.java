public class Segurado extends Veiculo implements ISeguroService{
    private double seguro;

    public double getSeguro() {
        return seguro;
    }

    public void setSeguro(double seguro) {
        this.seguro = seguro;
    }

    public Segurado(double seguro) {
        this.seguro = seguro;
    }

    public double Segurado(double seguro)
    {
        return 1;

    }

    public double doTotal()
    {
        return super.doTotal() - doDesconto();
    }

    public String doViewCupom()
    {
        return "oi";
    }

    @Override
    public double doDesconto() {
        return super.doTotal() * seguro/100;
    }
}
