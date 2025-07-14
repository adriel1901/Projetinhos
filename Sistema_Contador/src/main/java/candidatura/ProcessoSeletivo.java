/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package candidatura;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author cauaa
 */
public class ProcessoSeletivo {

    public static void main(String[] args) {
        imprimirSelecionados();
    }
    
    static void imprimirSelecionados(){
        String candidatos[] = {"Joao", "Carlos", "Alfredo", "Giovana", "Maria"};
        for(int i=0; i<candidatos.length; i++){
            System.out.println("O candidato de n "+ i + " eh " + candidatos[i]);
        }
    }
    
    static void selecaoCandidatos() {
        String candidatos[] = {"Joao", "Carlos", "Alfredo", "Giovana", "Maria"};
        int CandidatosSelecionados = 0;
        int CandidatoAtual = 0;
        double SalarioBase = 2000;

        while (CandidatosSelecionados < 5 && CandidatoAtual<candidatos.length) {
            String candidato = candidatos[CandidatoAtual];
            double SalarioPretendido = valorPretendido();
            
            System.out.printf("O candidato %s solicitou o salario de %s\n", candidato, SalarioPretendido);
            if(SalarioBase>=SalarioPretendido){
                System.out.println("O candidato foi selecionado para a vaga\n");
                CandidatosSelecionados++;
            }else{
                System.out.println("O candidato nao foi selecionado para a vaga\n");
            }
            CandidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double SalarioPretendido) {
        double SalarioBase = 2000.0;
        if (SalarioBase > SalarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (SalarioPretendido == SalarioBase) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
