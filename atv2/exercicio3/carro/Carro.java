package carro;

public class Carro {
    private String modelo;
    private String tipoCombustivel;
    private double quantidadeCombustivelNoTanque;
    private double consumoKmL;

    public Carro(String modelo, String tipoCombustivel, double quantidadeCombustivelNoTanque, double consumoKmL) {
        setModelo(modelo);
        setTipoCombustivel(tipoCombustivel);
        setQuantidadeCombustivelNoTanque(quantidadeCombustivelNoTanque);
        setConsumoKmL(consumoKmL);
    }

    public void abastece(double qtd) {
        setQuantidadeCombustivelNoTanque((getQuantidadeCombustivelNoTanque() + qtd));
    }

    public double necessarioParaKm(double km) {
        return km/this.consumoKmL;
    }

    public int simula(double dist) {
        if(necessarioParaKm(dist) > getQuantidadeCombustivelNoTanque()) return -1;
        else {
            setQuantidadeCombustivelNoTanque(getQuantidadeCombustivelNoTanque() - necessarioParaKm(dist));
            return 1;
        }
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getTipoCombustivel() {
        return this.tipoCombustivel;
    }

    public double getQuantidadeCombustivelNoTanque() { 
        return this.quantidadeCombustivelNoTanque;
    }

    public double getConsumoKmL() {
        return this.consumoKmL;
    }

    private void setModelo(String modelo) {
        this.modelo = modelo;
    }

    private void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    private void setQuantidadeCombustivelNoTanque(double quantidadeCombustivelNoTanque) {
        this.quantidadeCombustivelNoTanque = quantidadeCombustivelNoTanque;
    }

    private void setConsumoKmL(double consumoKmL) {
        this.consumoKmL = consumoKmL;
    }
}

