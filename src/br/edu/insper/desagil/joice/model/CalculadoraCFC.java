package br.edu.insper.desagil.joice.model;

public class CalculadoraCFC extends Calculadora{

	public CalculadoraCFC() {
		super("Cúbica de Face Centrada");
	}

	@Override
	public double calcula(double peso, double raio) {
		double numeroDeAtomos = 4;
		double pesoAtomico = peso;
		
		double raioCm = raio/Math.pow(10,7);
		double numeroAvogadro = 6.023 * Math.pow(10, 23);
		
		double volumeUnitario = Math.pow(2*Math.pow(2,0.5)*raioCm, 3);
		
		double densidade = (numeroDeAtomos*pesoAtomico)/(volumeUnitario*numeroAvogadro);
		
		return densidade;
	}

}
