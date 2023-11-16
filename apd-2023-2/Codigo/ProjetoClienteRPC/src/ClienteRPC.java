import java.net.URL;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

public class ClienteRPC {

    private XmlRpcClient cliente;
	
    public ClienteRPC(String urlServidor) {
		try {
			//configura o cliente para que ele possa se conectar ao servidor
			XmlRpcClientConfigImpl configuracaoCliente = new XmlRpcClientConfigImpl();
            configuracaoCliente.setServerURL(new URL(urlServidor));
			//seta a configuração no cliente
            cliente = new XmlRpcClient();
            cliente.setConfig(configuracaoCliente);
        } catch (Exception exception) {
            System.err.println("JavaServer: " + exception);
        }
    }

    public int Somar(int x, int y) throws Exception {
        Object[] parametros = new Object[]{Integer.valueOf(x), Integer.valueOf(y)};
        Integer resultado = (Integer) cliente.execute("Calc.Adicao", parametros);
        return resultado;
    }

    public int Subtrair(int x, int y) throws Exception {
        Object[] parametros = new Object[]{Integer.valueOf(x), Integer.valueOf(y)};
        Integer resultado = (Integer) cliente.execute("Calc.Subtracao", parametros);
        return resultado;
    }

    public int Multiplicar(int x, int y) throws Exception {
        Object[] parametros = new Object[]{Integer.valueOf(x), Integer.valueOf(y)};
        Integer resultado = (Integer) cliente.execute("Calc.Multiplicacao", parametros);
        return resultado;
    }

    public double Dividir(int x, int y) throws Exception {
        Object[] parametros = new Object[]{Integer.valueOf(x), Integer.valueOf(y)};
        Double resultado = (Double) cliente.execute("Calc.Divisao", parametros);
        return resultado;
    }

    public int Areaquadrado(int x) throws Exception{
        Object[] parametros = new Object[]{Integer.valueOf(x)};
        Integer resultado = (Integer) cliente.execute("Calc.Areaquadrado", parametros); // adicionados os objetos da calculadora para calcular geometria
        return resultado;
    }

    public int Areatrianguloret(int x, int y) throws Exception{
        Object[] parametros = new Object[]{Integer.valueOf(x), Integer.valueOf(y)};
        Integer resultado = (Integer) cliente.execute("Calc.Areatrianguloret", parametros);
        return resultado;
    }

    public double Areacircunferencia(int x) throws Exception{
        Object[] parametros = new Object[]{Integer.valueOf(x)};
        Double resultado = (Double) cliente.execute("Calc.Areacircunferencia", parametros);
        return resultado;
    }

    public double Areaesfera(int x) throws Exception{
        Object[] parametros = new Object[]{Integer.valueOf(x)};
        Double resultado = (Double) cliente.execute("Calc.Areaesfera", parametros);
        return resultado;
    }

    public double Volumeesfera(int x) throws Exception{
        Object[] parametros = new Object[]{Integer.valueOf(x)};
        Double resultado = (Double) cliente.execute("Calc.Volumeesfera", parametros);
        return resultado;
    }

    public double Areacilindro(int x, int y) throws Exception{
        Object[] parametros = new Object[]{Integer.valueOf(x), Integer.valueOf(y)};
        Double resultado = (Double) cliente.execute("Calc.Areacilindro", parametros);
        return resultado;
    }

    public double Volumecilindro(int x, int y) throws Exception{
        Object[] parametros = new Object[]{Integer.valueOf(x), Integer.valueOf(y)};
        Double resultado = (Double) cliente.execute("Calc.Volumecilindro", parametros);
        return resultado;
    }

    public double Areacubo(int x) throws Exception{
        Object[] parametros = new Object[]{Integer.valueOf(x)};
        Double resultado = (Double) cliente.execute("Calc.Areacubo", parametros);
        return resultado;
    }

    public double Volumecubo(int x) throws Exception{
        Object[] parametros = new Object[]{Integer.valueOf(x)};
        Double resultado = (Double) cliente.execute("Calc.Volumecubo", parametros);
        return resultado;
    }
}







