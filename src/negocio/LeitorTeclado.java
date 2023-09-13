package negocio;

import Interfaces.Leitor;

import java.util.Scanner;

public class LeitorTeclado implements Leitor {
    private Scanner sc = new Scanner(System.in);

    //IMPLEMENTA��O DO M�TODO LER_ENTRADA, ONDE FAZ UMA VERIFI��O DE TIPO FAZENDO O CAST PARA O TIPO CORRETO E POSSIBILITANDO A ENTRADA DE V�RIOS TIPOS DE DADOS.
    @Override
    public <T> T lerEntrada(Class<T> tipoLeitura) {
        if (tipoLeitura == Integer.class) {
            return tipoLeitura.cast(sc.nextInt());
        } else if (tipoLeitura == Double.class) {
            return tipoLeitura.cast(sc.nextDouble());
        } else if (tipoLeitura == String.class) {
            return tipoLeitura.cast(sc.nextDouble());
        } else {
            throw new RuntimeException("Tipo n�o suportado!");
        }
    }
}
