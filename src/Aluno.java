//Aluno Joao Victor Mothe Vantil
//Matricula 2112130053

public class Aluno {
    private String nome;
    private String sobrenome;
    private int idade;
    private double altura;
    private double peso; // Peso em kg

    public Aluno(String nome, String sobrenome, int idade, double altura, double peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public void comer(String refeicao) {
        if (idade >= 18) {
            if (refeicao.equals("Frutas")) {
                peso += 0.05; // Aumentar 50g
            } else if (refeicao.equals("Lanche")) {
                peso += 0.1; // Aumentar 100g
            } else if (refeicao.equals("Almoço") || refeicao.equals("Jantar")) {
                peso += 0.2; // Aumentar 200g
            }
        }
    }

    public void treinar(String modalidade) {
        if (idade >= 18) {
            if (modalidade.equals("Intenso")) {
                peso -= 0.15; // Decrementar 150g
            } else if (modalidade.equals("Moderado")) {
                peso -= 0.1; // Decrementar 100g
            } else if (modalidade.equals("Leve")) {
                peso -= 0.05; // Decrementar 50g
            }
        }
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public String classificarIMC() {
        double imc = calcularIMC();
        if (imc < 16.00) {
            return "Baixo peso Grau III";
        } else if (imc >= 16.00 && imc <= 16.99) {
            return "Baixo peso Grau II";
        } else if (imc >= 17.00 && imc <= 18.49) {
            return "Baixo peso Grau I";
        } else if (imc >= 18.50 && imc <= 24.99) {
            return "Peso ideal";
        } else if (imc >= 25.00 && imc <= 29.99) {
            return "Sobrepeso";
        } else if (imc >= 30.00 && imc <= 34.99) {
            return "Obesidade Grau I";
        } else if (imc >= 35.00 && imc <= 39.99) {
            return "Obesidade Grau II";
        } else {
            return "Obesidade Grau III";
        }
    }

    public void exibirAtributos() {
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("IMC: " + calcularIMC());
        System.out.println("Classificação IMC: " + classificarIMC());
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno("João Victor", "Mothe Vantil", 24, 1.66, 69);
        aluno.comer("Frutas");
        aluno.treinar("Intenso");
        aluno.exibirAtributos();
    }
}
