public class Calculadora {

    public int adicao(int x, int y) {
        return x + y;
    }

    public int subtracao(int x, int y) {
        return x - y;
    }

    public int multiplicacao(int x, int y) {
        return x * y;
    }

    public double divisao(int x, int y) {
        if (y == 0) {
            System.out.println("Erro: Divisão por zero.");
        }
        return  x / y;
    }

    public int areaquadrado(int x){
        return x * x; 
    }

    public int areatrianguloret(int x, int y){
        return x * y / 2;
    }

    public double areacircunferencia(int x){
        return Math.PI * x * x;
    }

    public double areaesfera(int x){
        return 4 * Math.PI * x * x;
    }

    public double volumeesfera(int x){
        return 4 * Math.PI * x * x * x / 3;
    }

    public double areacilindro(int x, int y){ // Usando a formula entre parenteses precisou-se colocar 2 variaveis separadas para cada procedimento e usando a biblioteca math.pi
        double areaLateral = 2 * Math.PI * x * y;
        double areaBase = 2 * Math.PI * x * x;
        return areaLateral + areaBase;
    }

    public double volumecilindro(int x, int y){
        return Math.PI * x * x * y;
    }

    public int areacubo(int x){
        return 6 * x * x;
    }

    public double volumecubo(int x){
        return Math.pow(x, 3); // utilizando biblioteca de matematica do java para simplificar a potenciação
    }
}
