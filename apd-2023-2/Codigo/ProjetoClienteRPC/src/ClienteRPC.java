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

    public int somar(int x, int y) throws Exception {
        Object[] parametros = new Object[]{Integer.valueOf(x), Integer.valueOf(y)};
        Integer resultado = (Integer) cliente.execute("Calc.adicao", parametros);
        return resultado;
    }

    public int subtrair(int x, int y) throws Exception {
        Object[] parametros = new Object[]{Integer.valueOf(x), Integer.valueOf(y)};
        Integer resultado = (Integer) cliente.execute("Calc.subtracao", parametros);
        return resultado;
    }

    public int multiplicar(int x, int y) throws Exception {
        Object[] parametros = new Object[]{Integer.valueOf(x), Integer.valueOf(y)};
        Integer resultado = (Integer) cliente.execute("Calc.multiplicacao", parametros);
        return resultado;
    }

    public double dividir(int x, int y) throws Exception {
        Object[] parametros = new Object[]{Integer.valueOf(x), Integer.valueOf(y)};
        Double resultado = (Double) cliente.execute("Calc.divisao", parametros);
        return resultado;
    }

    public int areaquadrado(int x) throws Exception{
        Object[] parametros = new Object[]{Integer.valueOf(x)};
        Integer resultado = (Integer) cliente.execute("Calc.areaquadrado", parametros); // adicionados os objetos da calculadora para calcular geometria
        return resultado;
    }

    public int areatrianguloret(int x, int y) throws Exception{
        Object[] parametros = new Object[]{Integer.valueOf(x), Integer.valueOf(y)};
        Integer resultado = (Integer) cliente.execute("Calc.areatrianguloret", parametros);
        return resultado;
    }

    public double areacircunferencia(int x) throws Exception{
        Object[] parametros = new Object[]{Integer.valueOf(x)};
        Double resultado = (Double) cliente.execute("Calc.areacircunferencia", parametros);
        return resultado;
    }

    public double areaesfera(int x) throws Exception{
        Object[] parametros = new Object[]{Integer.valueOf(x)};
        Double resultado = (Double) cliente.execute("Calc.areaesfera", parametros);
        return resultado;
    }

    public double volumeesfera(int x) throws Exception{
        Object[] parametros = new Object[]{Integer.valueOf(x)};
        Double resultado = (Double) cliente.execute("Calc.volumeesfera", parametros);
        return resultado;
    }

    public double areacilindro(int x, int y) throws Exception{
        Object[] parametros = new Object[]{Integer.valueOf(x), Integer.valueOf(y)};
        Double resultado = (Double) cliente.execute("Calc.areacilindro", parametros);
        return resultado;
    }

    public double volumecilindro(int x, int y) throws Exception{
        Object[] parametros = new Object[]{Integer.valueOf(x), Integer.valueOf(y)};
        Double resultado = (Double) cliente.execute("Calc.volumecilindro", parametros);
        return resultado;
    }

    public int areacubo(int x) throws Exception{
        Object[] parametros = new Object[]{Integer.valueOf(x)};
        Integer resultado = (Integer) cliente.execute("Calc.areacubo", parametros);
        return resultado;
    }

    public double volumecubo(int x) throws Exception{
        Object[] parametros = new Object[]{Integer.valueOf(x)};
        Double resultado = (Double) cliente.execute("Calc.volumecubo", parametros);
        return resultado;
    }
}







