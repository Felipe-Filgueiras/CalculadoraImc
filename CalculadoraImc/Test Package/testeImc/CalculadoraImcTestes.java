//Engenharia da Computação - Desenvolvimento Mobile
//
//Felipe Ferreira Neto Filgueiras matricula - 202101297911
//Isabelle Areias Ribeiro Mamprim matrricula - 202109123289

package testeImc;

// informações disponíveis em mdsaude imc
import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

import control.CalculadoraImc;

public class CalculadoraImcTestes {
	CalculadoraImc calc;
	
	@Before
	public void setup() {
		calc = new CalculadoraImc();
	}
	
	@Test
	public void testeAdultoBaixoPesoMuitoGrave() {
		Assert.assertEquals("Baixo peso muito grave", calc.calcularImc(1.70, 46.23, 25, "feminino"));
	}
	
	@Test
	public void testeAdultoBaixoPesoGraveInferior() {
		Assert.assertEquals("Baixo peso grave", calc.calcularImc(1.70, 46.24, 25, "feminino"));
	}
	
	@Test
	public void testeAdultoBaixoPesoGraveSuperior() {
		Assert.assertEquals("Baixo peso grave", calc.calcularImc(1.70, 49.1011, 25, "feminino"));
	}
	
	@Test
	public void testeAdultoBaixoPesoInferior() {
		Assert.assertEquals("Baixo peso", calc.calcularImc(1.70, 49.13, 25, "feminino"));
	}
	
	@Test
	public void testeAdultoBaixoPesoSuperior() {
		Assert.assertEquals("Baixo peso", calc.calcularImc(1.70, 53.4361, 25, "feminino"));
	}
	
	@Test
	public void testeAdultoPesoNormalInferior() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.70, 53.465, 25, "feminino"));
	}
	
	@Test
	public void testeAdultoPesoNormalSuperior() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.70, 72.221, 25, "feminino"));
	}
	
	@Test
	public void testeAdultoSobrepesoInferior() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.70, 72.25, 25, "feminino"));
	}
	
	@Test
	public void testeAdultoSobrepesoSuperior() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.70, 86.6711, 25, "feminino"));
	}
	
	@Test
	public void testeAdultoObesidadeIInferior() {
		Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.70, 86.7, 25, "feminino"));
	}
	
	@Test
	public void testeAdultoObesidadeISuperior() {
		Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.70, 101.1211, 25, "feminino"));
	}
	
	@Test
	public void testeAdultoObesidadeIIInferior() {
		Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.70, 101.15, 25, "feminino"));
	}
	
	@Test
	public void testeAdultoObesidadeIISuperior() {
		Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.70, 115.5711, 25, "feminino"));
	}
	
	@Test
	public void testeAdultoObesidadeIIIInferior() {
		Assert.assertEquals("Obesidade grau III", calc.calcularImc(1.70, 115.6, 25, "feminino"));
	}
	// Até aqui os valores estão mais ou menos certos.
        // idosos
        @Test
	public void testeIdosoBaixoPeso() {
		Assert.assertEquals("Baixo peso", calc.calcularImc(1.70, 63.291, 80, "masculino"));
	}
	
	@Test
	public void testeIdosoPesoNormalInferior() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.70, 63.58, 80, "masculino"));
	}
	
	@Test
	public void testeIdosoPesoNormalSuperior() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.70, 78.02, 80, "masculino"));
	}
	
	@Test
	public void testeIdosoSobrepesoInferior() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.70, 78.318, 80, "masculino"));
	}
	
	@Test
	public void testeIdosoSobrepesoSuperior() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.70, 86.69, 80, "masculino"));
	}
	
	@Test
	public void testeIdosoObesidadeIII() {
		Assert.assertEquals("Obesidade grau III", calc.calcularImc(1.70, 115.6, 80, "masculino"));
	}
        @Test
	public void testeIdosoObesidadeIInferior() {
		Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.70, 92.769, 80, "masculino"));
	}
	
	@Test
	public void testeIdosoObesidadeISuperior() {
		Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.70, 101.149, 80, "masculino"));
	}
        
        @Test
	public void testeIdosoObesidadeIIInferior() {
		Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.70, 101.439, 80, "masculino"));
	}
	
	@Test
	public void testeIdosoObesidadeIISuperior() {
		Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.70, 115.311, 80, "masculino"));
	}
	@Test
	public void testeIdosoMulherBaixoPeso() {
		Assert.assertEquals("Baixo peso", calc.calcularImc(1.70, 63.291, 80, "feminino"));
	}
	
	@Test
	public void testeIdosoMulherPesoNormalInferior() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.70, 63.58, 80, "feminino"));
	}
	
	@Test
	public void testeIdosoMulherPesoNormalSuperior() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.70, 78.03, 80, "feminino"));
	}
	
	@Test
	public void testeIdosoMulherSobrepesoInferior() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.70, 78.319, 80, "feminino"));
	}
	
	@Test
	public void testeIdosoMulherSobrepesoSuperior() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.70, 92.47, 80, "feminino"));
	}

	@Test
	public void testeIdosoMulherObesidadeIII() {
		Assert.assertEquals("Obesidade grau III", calc.calcularImc(1.70, 121.38, 80, "feminino"));
	}

        @Test
	public void testeIdosoMulherObesidadeIInferior() {
		Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.70, 92.769, 80, "feminino"));
	}
	
	@Test
	public void testeIdosoMulherObesidadeISuperior() {
		Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.70, 106.92, 80, "feminino"));
	}
        
        @Test
	public void testeIdosoMulherObesidadeIIInferior() {
		Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.70, 107.219, 80, "feminino"));
	}
	
	@Test
	public void testeIdosoMulherObesidadeIISuperior() {
		Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.70, 121.091, 80, "feminino"));
	}
}
