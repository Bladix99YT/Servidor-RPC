public class Calculadora {

    public int Adicao(int x, int y) {
        return x + y;
    }

    public int Subtracao(int x, int y) {
        return x - y;
    }

    public int Multiplicacao(int x, int y) {
        return x * y;
    }

    public double Divisao(int x, int y) {
        if (y == 0) {
            System.out.println("Erro: Divisão por zero.");
        }
        return  x / y;
    }

    public int Areaquadrado(int x){
        return x * x;
    }

    public int Areatrianguloret(int x, int y){
        return x * y / 2;
    }

    public double Areacircunferencia(int x){
        return Math.PI * Math.pow(x, 2);
    }

    public double Areaesfera(int x){
        return 4 * Math.PI * Math.pow(x, 2);
    }

    public double Volumeesfera(int x){
        return 4 * Math.PI * Math.pow(x, 3) / 3;
    }

    public double Areacilindro(int x, int y){ // Usando a formula entre parenteses precisou-se colocar 2 variaveis separadas para cada procedimento e usando a biblioteca math.pi
        double areaLateral = 2 * Math.PI * x * y;
        double areaBase = 2 * Math.PI * Math.pow(x, 2);
        return areaLateral + areaBase;
    }

    public double Volumecilindro(int x, int y){
        return Math.PI * Math.pow(x, 2) * y;
    }

    public double Areacubo(int x){
        return 6 * Math.pow(x, 2);
    }

    public double Volumecubo(int x){
        return Math.pow(x, 3); // utilizando biblioteca de matematica do java para simplificar a potenciação
    }
}
