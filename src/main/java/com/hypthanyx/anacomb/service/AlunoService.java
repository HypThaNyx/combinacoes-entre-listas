package com.hypthanyx.anacomb.service;

import com.hypthanyx.anacomb.model.Sala;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.hypthanyx.anacomb.util.GremioUtil.fatorial;

@Service
public class AlunoService {

    public long preveQuantidadeChapasTotal(List<Sala> salas) {
        // Percorre a lista de salas, executando a função "preveQuantidadeCombinacaoPorSala" com cada uma e retornando a multiplicação de todos os resultados
        return salas.stream().map(this::preveQuantidadeCombinacaoPorSala).reduce(1L, Math::multiplyExact);
    }

    private long preveQuantidadeCombinacaoPorSala(Sala sala) {
        int N = sala.getAlunos().size(); // quantidade de alunos na sala
        int P = sala.getCotaAlunosChapa(); // cota de alunos da sala elegíveis à chapa do Grêmio Estudantil

        // combin(N, 1) = N
        // exemplo: se temos 10 alunos na sala e a cota é de 1 aluno, logo são apenas 10 possibilidades de alunos elegíveis
        if (P == 1) return N;

        // combin(N, P) = N! / (P! * (N - P)! )
        // exemplo: se temos 10 alunos na sala e a cota é de 2 alunos, são 45 possibilidades de combinações de "pares" (P = 2) de alunos elegíveis
        return (fatorial( N ).divide(fatorial( P ).multiply(fatorial( N - P )))).longValue();
    }

}
